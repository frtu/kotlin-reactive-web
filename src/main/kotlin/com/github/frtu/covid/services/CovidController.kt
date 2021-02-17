package com.github.frtu.covid.services

import com.github.frtu.covid.persistence.Covid
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/covid")
class CovidController(private val covidService: CovidService) {
    @GetMapping
    fun getAllArtists(): List<Covid>? {
//    fun getAllArtists(): Flux<Covid>? {
        return covidService.getAllArtists()
    }

    @PostMapping
    fun createArtist(@RequestBody covid: Covid): Covid {
//    fun createArtist(@RequestBody covid: Covid): Mono<Covid> {
        return covidService.createArtist(covid)
    }
}
