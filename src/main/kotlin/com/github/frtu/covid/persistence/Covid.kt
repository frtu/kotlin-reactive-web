package com.github.frtu.covid.persistence

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


//@Table("covid")
@Entity
data class Covid(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    val provinceState: String? = null,
    val countryRegion: String? = null,
    val lat: String? = null,
    val lng: String? = null,
    val date: String? = null,
    val value: String? = null,
    val iso3166: String? = null,
    val regionCode: String? = null,
    val subRegionCode: String? = null,
    val intermediateRegionCode: String? = null
)
