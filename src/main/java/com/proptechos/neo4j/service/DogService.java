package com.proptechos.neo4j.service;

import com.proptechos.neo4j.model.Dog;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DogService {

    public Dog getByUuid(UUID uuid) {
        Dog dog = new Dog();
        dog.setUuid(uuid.toString());
        dog.setName("Test dog " + uuid);
        return dog;
    }
}
