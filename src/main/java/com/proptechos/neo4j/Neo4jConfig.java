//package com.proptechos.neo4j;
//
//import lombok.Getter;
//import org.neo4j.driver.*;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.data.neo4j.config.AbstractNeo4jConfig;
//import org.springframework.data.neo4j.core.DatabaseSelectionProvider;
//import org.springframework.data.neo4j.core.Neo4jClient;
//import org.springframework.data.neo4j.core.Neo4jTemplate;
//import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import java.net.URI;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//@Getter
//@Configuration
//@Profile("!test")
//@EnableTransactionManagement
//@EnableNeo4jRepositories("com.proptechos.neo4j.repository")
//public class Neo4jConfig extends AbstractNeo4jConfig {
//
//    @Value("${spring.neo4j.authentication.username}")
//    private String username;
//
//    @Value("${spring.neo4j.authentication.password}")
//    private String password;
//
//    @Value("${axioms.neo4j.database}")
//    private String database;
//
//    @Value("${axioms.neo4j.uris:}")
//    private List<URI> routingUris;
//
//    @Bean
//    public Driver driver() {
//
//        final AuthToken authToken = AuthTokens.basic(username, password);
//        final Config config = Config.builder()
//            .withMaxTransactionRetryTime(5, TimeUnit.SECONDS)
//            .build();
//
//        return GraphDatabase.driver(routingUris.get(0), authToken, config);
//    }
//
//    @Bean
//    protected DatabaseSelectionProvider databaseSelectionProvider() {
//
//        return DatabaseSelectionProvider.createStaticDatabaseSelectionProvider(database);
//    }
//
//    @Bean
//    public Neo4jTemplate neo4jTemplate(Neo4jClient neo4jClient) {
//        return new Neo4jTemplate(neo4jClient);
//    }
//}
