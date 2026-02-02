package com.example.turistguideopgave.controller;

import com.example.turistguideopgave.model.TouristAttraction;
import com.example.turistguideopgave.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/attractions")
public class  TouristController {

    private final TouristService service;

    public TouristController(TouristService touristService) {
        this.service = touristService;
    }

    @GetMapping
    public List<TouristAttraction> attractionList() {

        List<TouristAttraction> attractions = service.getAllAttractions();
        return new ResponseEntity<>(attractions, HttpStatus.OK).getBody();
    }

    @GetMapping("{name}")
    public ResponseEntity<TouristAttraction> getAttractionsByName(@PathVariable String name) {

        TouristAttraction attraction = service.getAttractionByName(name);
        return attraction == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(attraction);
    }

    @PostMapping("/add")
    public ResponseEntity<TouristAttraction> addAttraction(@RequestBody TouristAttraction attraction) {

        TouristAttraction touristAttraction = service.createAttraction(attraction);
        return ResponseEntity.ok(touristAttraction);
    }

//    @PostMapping("/update")
//    public ResponseEntity<TouristAttraction> updateAttraction() {
//
//
//    }


}