package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.MqttGateway;

@RestController
public class TestController {
    @Autowired
    private MqttGateway mqttGateway;

    @RequestMapping("/sendMqtt")
    public String sendMqtt(String  sendData){
        mqttGateway.sendToMqtt(sendData,"hello");
        return "OK";
    }
}
