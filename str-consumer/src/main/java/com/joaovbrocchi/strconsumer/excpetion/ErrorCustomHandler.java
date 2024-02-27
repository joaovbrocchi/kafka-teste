package com.joaovbrocchi.strconsumer.excpetion;

import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
@Log4j2
@Component
public class ErrorCustomHandler implements KafkaListenerErrorHandler {
    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException exception) {
        log.info("Exception Handler ::: Capturei um erro");

    }


}
