package com.example.demo.Mappers;

import org.modelmapper.ModelMapper;

import com.example.demo.DTO.CongeDTO;
import com.example.demo.Entity.Conge;

public class CongeMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static CongeDTO convertToDto(Conge conge)
	{
		return modelMapper.map(conge, CongeDTO.class);
	}
	public static Conge convertToEntity(CongeDTO congeDTO)
	{
		return modelMapper.map(congeDTO, Conge.class);
	}
	
	
}
