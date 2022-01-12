package com.proptechos.neo4j.repository;

import com.proptechos.neo4j.model.BaseClass;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface BaseClassRepository extends Neo4jRepository<BaseClass, String> {
}
