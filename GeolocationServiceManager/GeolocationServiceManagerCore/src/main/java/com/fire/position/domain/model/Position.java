package com.fire.position.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Position {

    private String vehicleReg;
    private Coordinate coordinate;
    private String country;
    private String timestamp;

}
