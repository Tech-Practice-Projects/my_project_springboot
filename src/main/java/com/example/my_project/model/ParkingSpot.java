package com.example.my_project.model;

import com.example.my_project.constants.ParkingLotSize;
import com.example.my_project.constants.ParkingStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class ParkingSpot {

    @Id
    private Long spot_id;
    private String spotName;
    @Enumerated(EnumType.STRING)
    private ParkingLotSize parkingLotSize;
    @Enumerated(EnumType.STRING)
    private ParkingStatus parkingStatus;
}
