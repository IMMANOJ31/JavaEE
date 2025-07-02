package com.xworkz.pg.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuestDto {

    private int guestId;
    private String guestName;
    private int guestAge;
    private int guestRoomNumber;
}
