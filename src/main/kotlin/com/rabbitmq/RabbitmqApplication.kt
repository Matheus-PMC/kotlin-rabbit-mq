package com.rabbitmq

import org.springframework.amqp.rabbit.annotation.EnableRabbit
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableRabbit
class RabbitmqApplication

fun main(args: Array<String>) {
    runApplication<RabbitmqApplication>(*args)
}
