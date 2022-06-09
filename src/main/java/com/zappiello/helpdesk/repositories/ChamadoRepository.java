package com.zappiello.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zappiello.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
