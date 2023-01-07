package com.proptechos.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Neo4jTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Neo4jTestApplication.class, args);
    }
}
