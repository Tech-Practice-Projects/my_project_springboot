package com.example.my_project.dtos;

import com.example.my_project.constants.ParkingLotSize;
import com.example.my_project.constants.ParkingStatus;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Component
public class ParkingSpotDTO {

    private String spotName;
    private ParkingLotSize parkingLotSize;
    private ParkingStatus parkingStatus;
}
