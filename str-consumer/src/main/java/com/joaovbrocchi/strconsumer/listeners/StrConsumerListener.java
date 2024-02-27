package com.joaovbrocchi.strconsumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Log4j2
@Component
public class StrConsumerListener {
    @KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "listenerContainerFactory")
    public void listener(String message){
       log.info("Received message {}",message);
    }

    @KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "listenerContainerFactory")
    public void logger(String message){
        log.info("LOG ::: Received Message: {}",message);
    }

}
