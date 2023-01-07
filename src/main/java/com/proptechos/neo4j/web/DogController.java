package com.proptechos.neo4j.web;

import com.proptechos.neo4j.model.Dog;
import com.proptechos.neo4j.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
public class DogController {

    private final DogService dogService;

    @Autowired
    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @RequestMapping(
        value = "/json/dog/{id}",
        method = RequestMethod.GET,
        produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Dog> getStorey(
        @PathVariable UUID id) {
        return ResponseEntity.ok(dogService.getByUuid(id));
    }
}
