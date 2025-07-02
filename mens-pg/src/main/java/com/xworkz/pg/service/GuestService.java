package com.xworkz.pg.service;

import com.xworkz.pg.dto.GuestDto;

public interface GuestService {

    boolean guestValidate(GuestDto guestDto);
    boolean updateRoomNumber(int guestId, int guestRoomNumber);
    boolean deleteGuest(int guestId);
    GuestDto fetchGuestDetails(int guestId);
}
