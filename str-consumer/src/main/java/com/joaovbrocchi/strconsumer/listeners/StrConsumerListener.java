package com.joaovbrocchi.strconsumer.listeners;

import com.joaovbrocchi.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Log4j2
@Component
public class StrConsumerListener {
    @StrConsumerCustomListener(groupId = "group-1")
    public void listener(String message) throws Exception{
       log.info("Received message {}",message);
       throw  new IllegalArgumentException("baba");
    }


    @StrConsumerCustomListener(groupId = "group-2")
    public void logger(String message){
        log.info("LOG ::: Received Message: {}",message);
    }

}
