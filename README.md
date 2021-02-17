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
* [spring-data](https://github.com/spring-projects/spring-data-r2dbc) & [R2DBC](https://r2dbc.io/) 
* [with H2](https://github.com/r2dbc/r2dbc-h2#getting-started) or with Mysql

### Performance

#### Performance metrics

Access Prometheus metrics through : 

* [http://localhost:8080/actuator/prometheus](http://localhost:8080/actuator/prometheus)

#### JMeter scripts

Find jmeter script in [/jmeter](/jmeter) folder.

## See also

* Spring getting started with R2DBC : [https://docs.spring.io/spring-data/r2dbc/docs/1.0.x/reference/html/#r2dbc.connectionfactory](https://docs.spring.io/spring-data/r2dbc/docs/1.0.x/reference/html/#r2dbc.connectionfactory)
* Spring guide for R2DBC : [https://spring.io/guides/gs/accessing-data-r2dbc/](https://spring.io/guides/gs/accessing-data-r2dbc/)
* Spring R2DBC samples : [https://github.com/hantsy/spring-r2dbc-sample](https://github.com/hantsy/spring-r2dbc-sample)

## Release notes

### 0.0.1-SNAPSHOT - Current version

* Feature list