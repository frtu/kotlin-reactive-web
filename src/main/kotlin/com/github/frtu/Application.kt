package com.github.frtu

import com.github.frtu.logs.config.LogConfigAll
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@Import(LogConfigAll::class)
@EnableConfigurationProperties(AppProperties::class)
@SpringBootApplication
@EnableR2dbcRepositories
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}