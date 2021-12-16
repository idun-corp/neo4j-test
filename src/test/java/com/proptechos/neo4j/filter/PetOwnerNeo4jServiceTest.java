package com.proptechos.neo4j.filter;

import com.proptechos.neo4j.BaseServiceTest;
import com.proptechos.neo4j.repository.BoyRepository;
import com.proptechos.neo4j.repository.PetOwnerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PetOwnerNeo4jServiceTest extends BaseServiceTest {

    private static final String PET_OWNER_1_ID = "00000001-0000-0000-0000-000000000000";

    @Test
    void testGetAll(@Autowired PetOwnerRepository repository) {
        var all = repository.findAll();
        assertEquals(4, all.size());
    }

    // FIXME Not working
    @Test
    void testGetById(@Autowired PetOwnerRepository boyRepository) {
        var byUuid = boyRepository.findById(PET_OWNER_1_ID);
        assertTrue(byUuid.isPresent());
        assertEquals(2, byUuid.get().getPets().size());
    }

    @Test
    void testGetById1(@Autowired BoyRepository boyRepository) {
        var byUuid = boyRepository.findById(PET_OWNER_1_ID);
        assertTrue(byUuid.isPresent());
        assertEquals(2, byUuid.get().getPets().size());
    }
}
