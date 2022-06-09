package com.zappiello.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zappiello.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
