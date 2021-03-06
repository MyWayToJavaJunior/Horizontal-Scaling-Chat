package otus.project.horizontal_scaling_chat.master_node.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import otus.project.horizontal_scaling_chat.master_node.db.DBService;
import otus.project.horizontal_scaling_chat.master_node.db.service.ChannelService;
import otus.project.horizontal_scaling_chat.master_node.db.service.DbIndexService;
import otus.project.horizontal_scaling_chat.master_node.db.service.UserService;

import java.io.IOException;

@Configuration
public class BeanConfig {
    @Bean
    public DBService dbService() {
        try {
            return new DBService("mybatis/config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new RuntimeException();
    }

    @Bean
    public ChannelService channelService() {
        return new ChannelService(dbService());
    }

    @Bean
    public UserService userService() {
        return new UserService(dbService());
    }

    @Bean
    public DbIndexService dbIndexService() {
        return new DbIndexService(dbService());
    }
}