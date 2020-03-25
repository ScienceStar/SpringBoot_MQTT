package com.service;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
@Component
public interface MqttGateway {
    void sendToMqtt(String data, @Header(MqttHeaders.TOPIC) String topic);
}
