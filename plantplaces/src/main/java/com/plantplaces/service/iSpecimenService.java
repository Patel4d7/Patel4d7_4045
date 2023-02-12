package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;

public interface iSpecimenService {

	SpecimenDTO fetchbyId(int id);

	void save(SpecimenDTO specimenDTO);

}