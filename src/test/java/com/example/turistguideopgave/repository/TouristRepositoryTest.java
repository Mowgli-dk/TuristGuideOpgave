package com.example.turistguideopgave.repository;

import com.example.turistguideopgave.model.TouristAttraction;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class TouristRepositoryTest {

    private TouristRepository repository;

    @BeforeEach
    void setUp() {
        repository = new TouristRepository(); // Arrange
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAllAttractions() {
    }


    @Test
    void getAttractionByName() {
        TouristAttraction attractionNameToBeFound = repository.getAttractionByName("Bowling");
        assertEquals("Bowling", attractionNameToBeFound.getName());
    }

    @Test
    void saveAttractionToDatabase() {
    }

    @Test
    void updateAttraction() {
    }

    @Test
    void deleteAttraction() {
    }
}
