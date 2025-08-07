# Gerador de Anagramas

## Requisitos
- Java 17
- Maven 3.8+

## Para Executar (na pasta do projeto)

mvn spring-boot:run  
curl http://localhost:8080/api/v1/anagramas/ABC  

ou  

mvn clean package  
java -jar target/anagramas-0.0.1-SNAPSHOT.jar  
curl http://localhost:8080/api/v1/anagramas/ABC

## Cobertura de testes
Execute  
mvn clean verify

relatório:  
target/site/jacoco/index.html
