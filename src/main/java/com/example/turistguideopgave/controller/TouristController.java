package com.example.turistguideopgave.controller;

import com.example.turistguideopgave.model.TouristAttraction;
import com.example.turistguideopgave.service.TouristService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
}