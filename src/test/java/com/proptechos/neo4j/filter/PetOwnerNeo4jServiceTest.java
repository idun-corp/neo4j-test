package com.proptechos.neo4j.filter;

import com.proptechos.neo4j.BaseServiceTest;
import com.proptechos.neo4j.model.BaseClass;
import com.proptechos.neo4j.model.PetOwner;
import com.proptechos.neo4j.repository.BaseClassRepository;
import com.proptechos.neo4j.repository.BoyRepository;
import com.proptechos.neo4j.repository.PetOwnerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PetOwnerNeo4jServiceTest extends BaseServiceTest {

    private static final String PET_OWNER_1_ID = "00000001-0000-0000-0000-000000000000";

    @Test
    void testGetAll(@Autowired PetOwnerRepository repository) {
        var all = repository.findAll();
        assertEquals(4, all.size());
    }

    @Test
    void testGetAllWithRelations(@Autowired BaseClassRepository repository) {
        var all = repository.findAll();
        assertEquals(8, all.size());

        Optional<BaseClass> boy1 = all.stream()
            .filter(item -> item instanceof PetOwner)
            .filter(item -> ((PetOwner)item).getName().equals("Boy1"))
            .findFirst();

        assertTrue(boy1.isPresent());
        assertTrue(((PetOwner) boy1.get()).getPets().size() > 0, "Boy1 has 2 pets");
    }

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
