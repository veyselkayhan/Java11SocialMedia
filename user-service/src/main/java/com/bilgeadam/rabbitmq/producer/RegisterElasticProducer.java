package com.bilgeadam.rabbitmq.producer;

import com.bilgeadam.rabbitmq.model.RegisterElasticModel;
import com.bilgeadam.rabbitmq.model.RegisterModel;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterElasticProducer {

    @Value("${rabbitmq.exchange-user}")
    private String directExchange;

    @Value("${rabbitmq.elastic-register-key}")
    private String registerBindingKey;


    private final RabbitTemplate rabbitTemplate;

    public void sendNewUser(RegisterElasticModel model){
        System.out.println(registerBindingKey+directExchange);
        rabbitTemplate.convertAndSend(directExchange,registerBindingKey,model);
    }
}
