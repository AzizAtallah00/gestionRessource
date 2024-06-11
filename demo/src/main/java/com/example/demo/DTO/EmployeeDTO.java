package com.example.demo.DTO;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class EmployeeDTO extends BaseDTO {
    @NotBlank
    private String nom ;
    @NotBlank
    private String prenom;
    @Email
    private String email;
    @NotBlank
    @JsonIgnoreProperties(allowSetters = true,allowGetters = false)
    private String password ; 
    @NotBlank
    private String telephone;
    @JsonIgnoreProperties("employee")
    private List<CongeDTO> conges;
    @JsonIgnoreProperties("employee")
    private BankDetailsDTO bankdetails;
    @JsonIgnoreProperties("employees")
    private Set<FormationDTO> formations;
        
}
