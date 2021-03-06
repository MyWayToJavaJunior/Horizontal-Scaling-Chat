package otus.project.horizontal_scaling_chat.master_node.share.message;

import otus.project.horizontal_scaling_chat.master_node.db.service.ChannelService;

public class MasterChannelExpelMemberMessage extends MasterMessage {
    private long channelId;
    private long userId;

    public MasterChannelExpelMemberMessage(long channelId, long userId) {
        this.channelId = channelId;
        this.userId = userId;
    }

    @Override
    public void masterHandle(ChannelService channelService) {
        channelService.expelMember(channelId, userId);
    }
}
