# travelDemo

This project is generated from start.spring.io. 

To compile it type: mvn clean install
to run : java -jar ./target/travelDemo-0.0.1-SNAPSHOT.jar

to see h2 database : http://localhost:8080/h2
to test using swagger: http://localhost:8080/swagger-ui.html#/

The rest service for is for distance lookup between 2 cities is 'http://localhost:8080/api/travelDistances/A/B,
where A and B can be one of these CAPE TOWN, JOHANNESBURG, DURBAN, TSHWANE, PORT ELIZABETH

The rest service for this is a simple GET. The current implementation returns an integer. In retrospect this should have been a JSON payload to make it compatible with the angular payload. 
