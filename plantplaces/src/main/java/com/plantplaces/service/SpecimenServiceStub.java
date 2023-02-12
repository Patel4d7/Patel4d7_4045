package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component

public class SpecimenServiceStub implements iSpecimenService {
	
	@Override
	public SpecimenDTO fetchbyId(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		return specimenDTO;
	}
		
		@Override
		public void save(SpecimenDTO specimenDTO) {
			
		}
	}
