package com.proptechos.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Getter
@Setter
@Node("Base")
public abstract class BaseClass {

    @Id
    private String uuid;
}
