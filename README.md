poc-spring-observability

### Introduction
This proof of concept aims to validate the observability of a Spring application using elasticsearch apm

### Requisites

* Docker
* Java 11

### How to run

* Start the docker-compose files (apm, filebeat, logstash, service)
* Check elasticsearch APM: `http://localhost:5601`