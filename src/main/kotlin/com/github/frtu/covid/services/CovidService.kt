package com.github.frtu.covid.services

import com.github.frtu.covid.persistence.Covid
import com.github.frtu.covid.persistence.CovidRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Service
class CovidService(private val covidRepository: CovidRepository) {
    //    fun getAllArtists(): List<Covid>? {
    fun getAllArtists(): Flux<Covid>? {
        return covidRepository.findAll()
    }

    //    fun createArtist(covid: Covid): Covid {
    fun createArtist(covid: Covid): Mono<Covid> {
        return covidRepository.save(covid)
    }
}
