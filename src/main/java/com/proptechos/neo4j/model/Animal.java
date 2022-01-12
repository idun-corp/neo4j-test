package com.proptechos.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Getter
@Setter
@Node("Animal")
public abstract class Animal extends BaseClass {

    private String name;
}
