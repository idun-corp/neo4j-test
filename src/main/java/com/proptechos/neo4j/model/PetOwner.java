package com.proptechos.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Getter
@Setter
@Node("PetOwner")
public abstract class PetOwner {

    @Id
    private String uuid;

    private String name;

    @Relationship(type = "hasPet")
    private List<Animal> pets;
}
