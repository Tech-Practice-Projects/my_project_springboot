package com.example.my_project.model;

import com.example.my_project.constants.ParkingLotSize;
import com.example.my_project.constants.ParkingStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class ParkingLot {

    @Id
    private Long lot_id;
    private Long slotNumberId;
    private ParkingLotSize parkingLotSize;
    private ParkingStatus parkingStatus;
}
