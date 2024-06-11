package com.example.demo.Mappers;

import org.modelmapper.ModelMapper;

import com.example.demo.DTO.BankDetailsDTO;
import com.example.demo.Entity.BankDetails;

public class BankDetailsMapper {
	private static final ModelMapper modelMapper= new ModelMapper();

	public static BankDetailsDTO convertToDto(BankDetails bankDetails)
	{
		return modelMapper.map(bankDetails, BankDetailsDTO.class);
	}
	public static BankDetails convertToEntity(BankDetailsDTO bankDetailsDTO)
	{
		return modelMapper.map(bankDetailsDTO, BankDetails.class);
	}
	
	
}