package com.rabbitmq

import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class SendMessageController(
    private val queue: Queue,
    private val rabbitTemplate: RabbitTemplate
) {

    @GetMapping("/sendMessageMQ")
    fun sendMessage(): ResponseEntity<*> {
        rabbitTemplate.convertAndSend(this.queue.name, "testando rabbitMQ");
        return ResponseEntity.ok().build<Any>()
    }
}