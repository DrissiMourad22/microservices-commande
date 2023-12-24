package com.commande.microservicescommande.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Commande.Commandeservice.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
 }