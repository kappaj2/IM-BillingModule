package za.co.ajk.billing.service.messaging;

import org.springframework.messaging.Message;


public interface IMMessageProcessor {
    
    void processMessageReceived(Message<?> message);

}
