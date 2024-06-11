package com.example.demo.DTO;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class CongeDTO extends BaseDTO{
    @NotBlank
    private String description;
    @NotBlank
    private String etat;
    @NotBlank
    private Date debut;
    @Positive
    private int duree;    
    @JsonIgnoreProperties("conges")
    private EmployeeDTO employee;

}
