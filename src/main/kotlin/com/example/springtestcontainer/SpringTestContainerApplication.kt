package com.example.springtestcontainer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringTestContainerApplication

fun main(args: Array<String>) {
    runApplication<SpringTestContainerApplication>(*args)
}
