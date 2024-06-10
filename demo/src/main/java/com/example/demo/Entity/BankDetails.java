package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankDetails {
    @Id
    private long id;
    private String banque;
    private String branche;
    private String Rib;
    private String iban;

    //relationship between entities
    @MapsId
    @OneToOne(optional = false)
    @JoinColumn(name = "id")    
    private Employee employee;
}
