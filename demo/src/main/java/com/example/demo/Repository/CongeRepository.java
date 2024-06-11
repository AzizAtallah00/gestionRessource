package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Conge;

public interface CongeRepository  extends JpaRepository <Conge , Long>{
    
}
