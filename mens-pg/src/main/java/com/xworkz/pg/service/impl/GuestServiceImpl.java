package com.xworkz.pg.service.impl;

import com.xworkz.pg.dto.GuestDto;
import com.xworkz.pg.repo.GuestRepo;
import com.xworkz.pg.repo.impl.GuestRepoImpl;
import com.xworkz.pg.service.GuestService;

public class GuestServiceImpl implements GuestService {

   GuestRepo guestRepo;

    public  GuestServiceImpl(){
        guestRepo = new GuestRepoImpl();
    }
    @Override
    public boolean guestValidate(GuestDto guestDto) {
        boolean isGuestValid = false;
        boolean isGuestId = false;
        boolean isGuestName = false;
        boolean isGuestAge = false;
        boolean isGuestRoomNumber= false;

        if (guestDto.getGuestId() != 0){
            isGuestId = true;
        }
        if (guestDto.getGuestName() != null && !guestDto.getGuestName().isEmpty()){
            isGuestName =true;
        }
        if (guestDto.getGuestAge() != 0){
            isGuestAge = true;
        }
        if (guestDto.getGuestRoomNumber() != 0){
            isGuestRoomNumber = true;
        }
        if (isGuestId && isGuestName && isGuestAge && isGuestRoomNumber){
            isGuestValid = guestRepo.saveGuestDetails(guestDto);
        }
        return isGuestValid;
    }

    @Override
    public boolean updateRoomNumber(int guestId, int guestRoomNumber) {
        boolean isUpdated = false;
        if (guestId != 0 && guestRoomNumber != 0){
            isUpdated = guestRepo.updateGuestDetails(guestId,guestRoomNumber);
        }
        return isUpdated;
    }

    @Override
    public boolean deleteGuest(int guestId) {
        boolean isDeleted = false;
        if (guestId != 0){
            isDeleted = guestRepo.deleteGuestDetails(guestId);
        }
        return isDeleted;
    }

    @Override
    public GuestDto fetchGuestDetails(int guestId) {
        if (guestId > 0){
            return guestRepo.fetchGuestDetails(guestId);
        }
        return null;
    }


}
