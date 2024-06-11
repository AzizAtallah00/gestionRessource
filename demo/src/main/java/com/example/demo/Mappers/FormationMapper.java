package com.example.demo.Mappers;

import org.modelmapper.ModelMapper;

import com.example.demo.DTO.FormationDTO;
import com.example.demo.Entity.Formation;

public class FormationMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static FormationDTO convertToDto(Formation formation)
	{
		return modelMapper.map(formation, FormationDTO.class);
	}
	public static Formation convertToEntity(FormationDTO formationDTO)
	{
		return modelMapper.map(formationDTO, Formation.class);
	}
	
	
}
