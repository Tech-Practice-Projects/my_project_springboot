package com.example.my_project.repository;

import com.example.my_project.model.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, Long> {
}
