package br.com.kafka.controller;

import br.com.kafka.service.TopicProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final TopicProducerService topicProducerService;

    @GetMapping(value = "/send")
    public void send(){
        topicProducerService.send("Mensagem de teste enviada");
    }
}
