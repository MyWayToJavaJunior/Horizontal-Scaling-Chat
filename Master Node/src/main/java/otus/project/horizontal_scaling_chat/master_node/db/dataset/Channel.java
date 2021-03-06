package otus.project.horizontal_scaling_chat.master_node.db.dataset;

import com.google.gson.annotations.Expose;
import otus.project.horizontal_scaling_chat.db.dataset.CommonChannel;

import java.util.ArrayList;
import java.util.List;

public class Channel extends CommonChannel {
    @Expose private String host;
    private long dbIndex;
    private List<User> members = new ArrayList<>();

    public Channel() {
    }

    public Channel(String name, long dbIndex) {
        this.setName(name);
        this.dbIndex = dbIndex;
    }


    public long getDbIndex() {
        return dbIndex;
    }
    public void setDbIndex(long dbIndex) {
        this.dbIndex = dbIndex;
    }
    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public List<User> getMembers() {
        return members;
    }
    public void setMembers(List<User> members) {
        this.members = members;
    }
}
