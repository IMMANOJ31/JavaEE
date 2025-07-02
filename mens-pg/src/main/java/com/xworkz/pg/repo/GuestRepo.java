package com.xworkz.pg.repo;

import com.xworkz.pg.dto.GuestDto;

public interface GuestRepo {

    boolean saveGuestDetails(GuestDto guestDto);
    boolean updateGuestDetails(int guestId, int guestRoomNumber);
    boolean deleteGuestDetails(int guestId);
    GuestDto fetchGuestDetails(int guestId);
}
