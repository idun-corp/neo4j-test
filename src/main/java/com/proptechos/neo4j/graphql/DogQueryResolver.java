package com.proptechos.neo4j.graphql;

import com.proptechos.neo4j.model.Dog;
import com.proptechos.neo4j.service.DogService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
public class DogQueryResolver {

    private final DogService dogService;

    public DogQueryResolver(DogService dogService) {
        this.dogService = dogService;
    }

    @QueryMapping
    public Dog getDog(@Argument("id") String uuid) {
        return dogService.getByUuid(UUID.fromString(uuid));
    }
}
