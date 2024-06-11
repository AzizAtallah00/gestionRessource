package com.example.demo.Entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Formation extends BaseEntity {
    @Column(nullable = false)
	private String titre;
    @Column(nullable = false)
	private double prix;
	private int duree;

    //relationship between entities
    @ManyToMany (mappedBy = "formations")
    private Set<Employee> employees;
}
