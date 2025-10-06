package com.xworkz.boutiqueapp.repositry;

import com.xworkz.boutiqueapp.dto.BoutiqueDto;

public interface BoutiqueRegistrationRepo {

    boolean saveUserDetails(BoutiqueDto dto);

}
