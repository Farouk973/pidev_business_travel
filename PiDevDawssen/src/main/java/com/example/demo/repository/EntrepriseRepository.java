package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Entreprise;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

}
