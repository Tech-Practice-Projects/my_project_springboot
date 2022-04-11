package com.example.my_project.repository;

import com.example.my_project.model.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, String> {

    @Query("SELECT ps FROM ParkingSpot ps WHERE ps.spotName = :spotName")
    Optional<ParkingSpot> findBySpotName(@Param("spotName") String spotName);
}
