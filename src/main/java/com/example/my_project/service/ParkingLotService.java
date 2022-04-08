package com.example.my_project.service;

import com.example.my_project.constants.ParkingLotSize;
import com.example.my_project.dtos.ParkingLotDTO;
import com.example.my_project.repository.ParkingSpotRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ParkingLotService {

    private ParkingSpotRepository parkingSpotRepository;

    public void create(ParkingLotDTO parkingLotDTO) {

    }
}
