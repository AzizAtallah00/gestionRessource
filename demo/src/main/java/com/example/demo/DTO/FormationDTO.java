package com.example.demo.DTO;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;

public class FormationDTO extends BaseDTO{
    @NotBlank
    private String titre;
    @NotBlank
    private double prix;
    @NotBlank
    private int duree;
    @JsonIgnoreProperties("formations")
    private Set <EmployeeDTO> employees;
    
}
