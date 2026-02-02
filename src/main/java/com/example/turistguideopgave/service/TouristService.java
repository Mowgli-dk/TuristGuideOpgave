package com.example.turistguideopgave.service;
import com.example.turistguideopgave.model.TouristAttraction;
import com.example.turistguideopgave.repository.TouristRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TouristService {

    private final TouristRepository repository;

    public TouristService(TouristRepository repository) {
        this.repository = repository;
    }

    public List<TouristAttraction> getAllAttractions() {

        return repository.getAllAttractions();
    }

    public TouristAttraction getAttractionByName(String name) {

        TouristAttraction attraction = repository.getAttractionByName(name);

        if (attraction != null && attraction.getName().equals(name)) {
            return attraction;
        }
        return null;
    }

    public TouristAttraction createAttraction(TouristAttraction attraction) {

        return repository.saveAttractionToDatabase(attraction);
    }

    public TouristAttraction updateAttraction(String newName, String newDescription) { // Update Attraction {name, description}

        for (TouristAttraction attraction : repository.getAllAttractions()) {

            String updateName = attraction.setName(newName);
            String updateDescription = attraction.setName(newDescription);

            return new TouristAttraction(updateName, updateDescription);
        }
        return null;
    }
}
