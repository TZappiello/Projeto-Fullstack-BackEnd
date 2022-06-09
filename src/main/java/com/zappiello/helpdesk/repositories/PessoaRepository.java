package com.zappiello.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zappiello.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
