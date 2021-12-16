package com.proptechos.neo4j.repository;

import com.proptechos.neo4j.model.PetOwner;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PetOwnerRepository extends Neo4jRepository<PetOwner, String> {
}
