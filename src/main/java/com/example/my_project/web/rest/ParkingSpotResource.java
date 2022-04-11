package com.example.my_project.web.rest;

import com.example.my_project.dtos.ParkingSpotDTO;
import com.example.my_project.service.ParkingSpotService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/parking-spots")
public class ParkingSpotResource {

    private final ParkingSpotService parkingSpotService;

    @PreAuthorize("isAuthenticated()")
    @PostMapping
    public ParkingSpotDTO create(@RequestBody ParkingSpotDTO parkingSpotDTO) {
        return parkingSpotService.create(parkingSpotDTO);
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/{spotName}")
    public ParkingSpotDTO getSpotByName(@PathVariable String spotName) {
        return parkingSpotService.getSpotByName(spotName);
    }

}
