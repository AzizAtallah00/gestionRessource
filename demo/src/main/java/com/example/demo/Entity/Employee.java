package com.example.demo.Entity;

import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee extends BaseEntity {
    @Column(nullable = false)
    @NotBlank
    private String nom;
    @Column(nullable = false)
    @NotBlank
    private String prenom;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    @NotBlank
    private String password;
    @Column(nullable = false,unique = true)
    @NotBlank
    private String telephone;
    
    //relationship between entities
    @OneToMany(mappedBy="employee")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Conge> conges;

}
