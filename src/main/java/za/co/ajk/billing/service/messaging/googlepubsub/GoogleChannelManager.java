package za.co.ajk.billing.service.messaging.googlepubsub;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

import za.co.ajk.billing.service.messaging.InterModulePubSubMessage;

public interface GoogleChannelManager {

    void pubSubMessageSender(InterModulePubSubMessage interModulePubSubMessage);
    MessageChannel pubsubInputChannel();
    MessageHandler messageReceiver();

}
