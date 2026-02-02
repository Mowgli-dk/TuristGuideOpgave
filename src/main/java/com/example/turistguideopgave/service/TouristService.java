package com.example.turistguideopgave.service;
import com.example.turistguideopgave.model.TouristAttraction;
import com.example.turistguideopgave.model.UpdateRequest;
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

    public void updateAttraction(TouristAttraction attraction, String newName, String newDescription) {

        repository.updateAttraction(attraction, newName, newDescription);
    }
}
