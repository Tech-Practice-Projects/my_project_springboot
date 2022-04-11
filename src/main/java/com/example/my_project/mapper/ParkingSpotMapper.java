package com.example.my_project.mapper;

import com.example.my_project.dtos.ParkingSpotDTO;
import com.example.my_project.model.ParkingSpot;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ParkingSpotMapper {


    ParkingSpotDTO toParkingSpotDTO(ParkingSpot parkingSpot);
    ParkingSpot toParkingSpot(ParkingSpotDTO parkingSpot);

}
