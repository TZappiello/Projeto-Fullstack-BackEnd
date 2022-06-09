package com.zappiello.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zappiello.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
