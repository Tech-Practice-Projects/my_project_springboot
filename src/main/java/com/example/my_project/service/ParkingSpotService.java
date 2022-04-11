package com.example.my_project.service;

import com.example.my_project.dtos.ParkingSpotDTO;
import com.example.my_project.mapper.ParkingSpotMapper;
import com.example.my_project.model.ParkingSpot;
import com.example.my_project.repository.ParkingSpotRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@AllArgsConstructor
@Service
@Transactional
public class ParkingSpotService {

    private final ParkingSpotRepository parkingSpotRepository;
    private final ParkingSpotMapper parkingSpotMapper;

    public ParkingSpotDTO create(ParkingSpotDTO parkingSpotDTO) {
        Optional<ParkingSpot> parkingSpot = parkingSpotRepository.findBySpotName(parkingSpotDTO.getSpotName());
        if (parkingSpot.isPresent()) {
            throw new IllegalStateException(String.format("Parking spot by name %s already there", parkingSpotDTO.getSpotName()));
        }
        ParkingSpot savedParkingSpot = parkingSpotRepository.save(parkingSpotMapper.toParkingSpot(parkingSpotDTO));
        return parkingSpotMapper.toParkingSpotDTO(savedParkingSpot);
    }

    public ParkingSpotDTO getSpotByName(String spotName) {
        ParkingSpot parkingSpot = parkingSpotRepository.findBySpotName(spotName).orElseThrow(() -> new RuntimeException(String.format("Parking spot by name %s Not Found", spotName)));
        return parkingSpotMapper.toParkingSpotDTO(parkingSpot);
    }

    public boolean deleteSpotByName(String spotName) {
        ParkingSpot parkingSpot = parkingSpotRepository.findBySpotName(spotName).orElseThrow(() -> new RuntimeException(String.format("Parking spot by name %s Not Found", spotName)));
        parkingSpotRepository.delete(parkingSpot);
        return true;
    }

    public ParkingSpotDTO updateSpot(ParkingSpotDTO parkingSpotDTO) {
        String spotName = parkingSpotDTO.getSpotName();
        if (spotName == null || spotName.isEmpty()) throw new IllegalStateException("Spot Name is mandatory");
        ParkingSpot parkingSpot = parkingSpotRepository.findBySpotName(spotName).orElseThrow(() -> new RuntimeException(String.format("Parking spot by name %s Not Found", spotName)));
        parkingSpot.setParkingStatus(parkingSpotDTO.getParkingStatus());
        parkingSpot.setParkingLotSize(parkingSpotDTO.getParkingLotSize());
        parkingSpotRepository.save(parkingSpot);
        return parkingSpotMapper.toParkingSpotDTO(parkingSpot);
    }
}
