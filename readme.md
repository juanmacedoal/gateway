# Light API Gateway

## Description

Console light API Gateway implemented using Zuul.

## Configurations 

The discovery configuration loaded is:

```yml
eureka:
  instance:
   hostname: localhost
  client:
    registerWithEureka: false
    fetchRegistry: false
    serviceUrl:
      defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
  server:
    enableSelfPreservation: true
```

The projects under the Gateway must be launched with profile = loc to test it in localhost

## How to run

Run with spring.profiles.active=def to run the microservice stand-alone

Run with spring.profiles.active=loc with cloud configuration, discovery service and vac-logger

Run with spring.profiles.active=dev
