package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Formation;

public interface FormationRepository extends JpaRepository <Formation , Long>{
    
}
