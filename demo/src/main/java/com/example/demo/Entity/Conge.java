package com.example.demo.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conge extends BaseEntity{

    private String description;
    @Column(columnDefinition = "varchar(30) default 'en attente'")
    private String etat;
    @FutureOrPresent
    private Date debut;
    @Positive
    private int duree;
}
