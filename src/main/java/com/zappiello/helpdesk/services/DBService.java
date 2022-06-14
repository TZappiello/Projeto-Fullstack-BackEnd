package com.zappiello.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zappiello.helpdesk.domain.Chamado;
import com.zappiello.helpdesk.domain.Cliente;
import com.zappiello.helpdesk.domain.Tecnico;
import com.zappiello.helpdesk.domain.enums.Perfil;
import com.zappiello.helpdesk.domain.enums.Prioridade;
import com.zappiello.helpdesk.domain.enums.Status;
import com.zappiello.helpdesk.repositories.ChamadoRepository;
import com.zappiello.helpdesk.repositories.ClienteRepository;
import com.zappiello.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "Thiago Zappiello", "111.222.333-44", "tzappiello@mail.com", "123456");
		tec1.addPerfil(Perfil.ADMIN);
		
		Tecnico tec2 = new Tecnico(null, "Ana Julha", "000.999.888-77", "ana@mail.com", "9876543");
		tec2.addPerfil(Perfil.TECNICO);
		Tecnico tec3 = new Tecnico(null, "Mario Costa", "102.202.303-44", "mario@mail.com", "10101010");
		tec3.addPerfil(Perfil.TECNICO);
		Tecnico tec4 = new Tecnico(null, "Maria Joaquina", "333.222.111-00", "maria@mail.com", "01010202");
		tec4.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Laila Zappiello", "222.333.444-55", "lailazapi@mail.com", "123456");

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		tecnicoRepository.saveAll(Arrays.asList(tec2));
		tecnicoRepository.saveAll(Arrays.asList(tec3));
		tecnicoRepository.saveAll(Arrays.asList(tec4));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
