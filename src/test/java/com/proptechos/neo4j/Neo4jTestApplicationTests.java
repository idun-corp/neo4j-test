package com.proptechos.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
@Configuration
class Neo4jTestApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jTestApplicationTests.class, args);
	}

}
