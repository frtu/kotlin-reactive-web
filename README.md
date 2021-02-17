# Project - kotlin-reactive-web

## About

A Kotlin project for REST API that give covid case per country :

* Access application using [http://localhost:8080/covid](http://localhost:8080/covid)

### SYNC version

Rely on :

* spring-boot
* spring MVC
* JPA with Mysql

### ASYNC version

Rely on :

* spring-boot
* spring webflux
* [R2DBC](http://r2dbc.io) with Mysql

### Performance

#### Performance metrics

Access Prometheus metrics through : 

* [http://localhost:8080/actuator/prometheus](http://localhost:8080/actuator/prometheus)

#### JMeter scripts

Find jmeter script in [/jmeter](/jmeter) folder.

## Release notes

### 0.0.1-SNAPSHOT - Current version

* Feature list