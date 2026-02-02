package com.example.turistguideopgave.repository;

import com.example.turistguideopgave.model.TouristAttraction;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    private List<TouristAttraction> attractions = new ArrayList<>();

    public TouristRepository() {

        populateAttractions();
    }

    private void populateAttractions() { // DATABASE {Name, Description}

        attractions.add(new TouristAttraction("Disney Land", "Amusement Park"));
        attractions.add(new TouristAttraction("Watching movie", "Movie Theater"));
        attractions.add(new TouristAttraction("Bowling", "Activity Center"));
        attractions.add(new TouristAttraction("Esports", "Live competitive computer entertainment"));
    }

    // Vis alle attractions
    public List<TouristAttraction> getAllAttractions() {

        return new ArrayList<>(attractions);
    }

    // Hent attraction ud fra getName()
    public TouristAttraction getAttractionByName(String name) {

        for (TouristAttraction attraction : attractions) {

            if (attraction.getName().equals(name)) {

                return attraction;
            }
        }
        return null;
    }
}