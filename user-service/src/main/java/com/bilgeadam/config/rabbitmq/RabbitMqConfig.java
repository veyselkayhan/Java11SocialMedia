package com.bilgeadam.config.rabbitmq;



import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {


    @Value("${rabbitmq.exchange-user}")
    private String userExchange;

    @Value("${rabbitmq.elastic-register-key}")
    private String elasticRegisterBindingKey;

    @Value("${rabbitmq.queue-register-elastic}")
    private String elasticRegisterQueue;

    @Value("${rabbitmq.queue-register}")
    private String queueNameRegister;

    @Bean
    public DirectExchange exchangeUser(){
        return new DirectExchange(userExchange);
    }

    @Bean
    public Binding bindingRegisterElastic(final Queue registerElasticQueue,final DirectExchange exchangeUser){
        return BindingBuilder.bind(registerElasticQueue).to(exchangeUser).with(elasticRegisterBindingKey);
    }

    @Bean
    public Queue registerQueue(){
        return new Queue(queueNameRegister);
    }

    @Bean
    public Queue registerElasticQueue(){
        return new Queue(elasticRegisterQueue);
    }



}
