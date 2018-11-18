# ai-spring-cloud-consul - start at 2018-11-18
spring cloud consul - service registration, key value store, config server and client

Pre-Installation 

- java 8 +
- consul 1.4.0 (tested version)

## How to run
1. Start consul (locally, non-cluster)
- consul: consul agent -dev -node machine
- verify: http://localhost:8500
2. hello-world service, run two services with two ports. 
- mvn spring-boot:run -f hello-world/pom.xml -Dspring-boot.run.arguments=--server.port=9001
- mvn spring-boot:run -f hello-world/pom.xml -Dspring-boot.run.arguments=--server.port=9002
3. api-gateway service, one only

## config key value in consul using yml
By using yml, data is the default key, below are the loaded data with start application with dev profile
- config/application/data
- config/application,dev/data
- config/ai-spring-cloud-hello-world/data
- config/ai-spring-cloud-hello-world,dev/data