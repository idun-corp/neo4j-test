package com.proptechos.neo4j.repository;

import com.proptechos.neo4j.model.Boy;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface BoyRepository extends Neo4jRepository<Boy, String> {
}
