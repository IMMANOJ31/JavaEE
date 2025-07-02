package com.xworkz.pg;

import com.xworkz.pg.dto.GuestDto;
import com.xworkz.pg.service.GuestService;
import com.xworkz.pg.service.impl.GuestServiceImpl;

public class Runner {

    static GuestService guestService;

    public static void main(String[] args) {
        GuestDto dto = new GuestDto();
        dto.setGuestId(1);
        dto.setGuestName("Malli");
        dto.setGuestAge(24);
        dto.setGuestRoomNumber(102);

        GuestDto dto1 = new GuestDto();
        dto1.setGuestId(2);
        dto1.setGuestName("Babu");
        dto1.setGuestAge(58);
        dto1.setGuestRoomNumber(204);

        guestService = new GuestServiceImpl();
        //guestService.guestValidate(dto);
        //guestService.guestValidate(dto1);
        //guestService.updateRoomNumber(1500);
        //guestService.deleteGuest(1);
        //guestService.fetchGuestDetails(2);
        System.out.println(guestService.fetchGuestDetails(2));

    }
}
