package com.xworkz.boutiqueapp.service;

import com.xworkz.boutiqueapp.dto.BoutiqueDto;

public interface BoutiqueRegistrationService {

    boolean validateAndSaveUser(BoutiqueDto dto);
}
