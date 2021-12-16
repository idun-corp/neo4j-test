package com.proptechos.neo4j.repository;

import com.proptechos.neo4j.model.Animal;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AnimalNeo4jRepository extends Neo4jRepository<Animal, String> {
}
