package com.github.frtu.covid.persistence

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CovidRepository : CrudRepository<Covid, Long>
//interface CovidRepository : ReactiveCrudRepository<Covid, Long>
