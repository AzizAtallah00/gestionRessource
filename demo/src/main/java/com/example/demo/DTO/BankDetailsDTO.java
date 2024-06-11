package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;

public class BankDetailsDTO {
    @NotBlank
    private String banque;
    @NotBlank
    private String branche;
    @NotBlank
    private String rib;
    @NotBlank
    private String iban;
    @JsonIgnoreProperties("bankdetails")
    private EmployeeDTO employee;

}
