package com.devsuperior.desafio03.repositories;

import com.devsuperior.desafio03.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}