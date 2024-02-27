package com.joaovbrocchi.strproducer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Log4j2
@RequiredArgsConstructor
@Service
public class SpringProducerService {

    public final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("send message: {}",message);
        kafkaTemplate.send("str-topic", message);

    }





}
