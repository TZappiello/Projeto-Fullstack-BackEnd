package com.zappiello.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "Thiago Programador", "281.672.000-43", "teste@mail.com", encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Ana Julha", "827.227.200-86", "ana@mail.com", encoder.encode("123"));
		tec2.addPerfil(Perfil.TECNICO);
		Tecnico tec3 = new Tecnico(null, "Mario Costa", "816.124.760-90", "mario@mail.com", encoder.encode("123"));
		tec3.addPerfil(Perfil.TECNICO);
		Tecnico tec4 = new Tecnico(null, "Maria Joaquina", "827.567.890-03", "maria@mail.com", encoder.encode("123"));
		tec4.addPerfil(Perfil.ADMIN);
		Tecnico tec5 = new Tecnico(null, "Carmen Araujo", "711.782.290-25", "carmen@mail.com", encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec6 = new Tecnico(null, "Isabel Costa", "938.238.740-47", "isa@mail.com", encoder.encode("123"));
		tec2.addPerfil(Perfil.TECNICO);
		Tecnico tec7 = new Tecnico(null, "Alexandre Martins", "534.371.380-73", "alex@mail.com", encoder.encode("123"));
		tec3.addPerfil(Perfil.TECNICO);
		Tecnico tec8 = new Tecnico(null, "Amaral Souza", "379.359.260-00", "amaral@mail.com", encoder.encode("123"));
		tec4.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Adriana Andrade", "238.486.330-43", "adri@mail.com", encoder.encode("123"));
		Cliente cli2 = new Cliente(null, "Bob Green", "910.136.570-39", "bob@mail.com", encoder.encode("123"));
		Cliente cli3 = new Cliente(null, "Pablo Matias", "726.467.220-44", "pablom@mail.com", encoder.encode("123"));
		Cliente cli4 = new Cliente(null, "Marina Cunha", "626.132.490-56", "mari@mail.com", encoder.encode("123"));
		Cliente cli5 = new Cliente(null, "Pedro Paulo", "286.816.640-77", "pedro@mail.com", encoder.encode("123"));
		Cliente cli6 = new Cliente(null, "Jane Cardoso", "028.097.570-89", "jane@mail.com", encoder.encode("123"));
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, 	
				cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ENCERRADO, "Chamado 02", "Segundo Chamado", tec1,
				cli2);
		Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ABERTO, "Chamado 03", "TerceiroChamado", tec1,
				cli3);
		Chamado c4 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 04", "Primeiro Chamado", tec2, 	
				cli4);
		Chamado c5 = new Chamado(null, Prioridade.ALTA, Status.ENCERRADO, "Chamado 05", "Segundo Chamado", tec3,
				cli5);
		Chamado c6 = new Chamado(null, Prioridade.BAIXA, Status.ABERTO, "Chamado 06", "TerceiroChamado", tec4,
				cli6);
		Chamado c7 = new Chamado(null, Prioridade.ALTA, Status.ENCERRADO, "Chamado 07", "Segundo Chamado", tec5,
				cli2);
		Chamado c8 = new Chamado(null, Prioridade.BAIXA, Status.ANDAMENTO, "Chamado 08", "TerceiroChamado", tec6,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		tecnicoRepository.saveAll(Arrays.asList(tec2));
		tecnicoRepository.saveAll(Arrays.asList(tec3));
		tecnicoRepository.saveAll(Arrays.asList(tec4));
		tecnicoRepository.saveAll(Arrays.asList(tec5));
		tecnicoRepository.saveAll(Arrays.asList(tec6));
		tecnicoRepository.saveAll(Arrays.asList(tec7));
		tecnicoRepository.saveAll(Arrays.asList(tec8));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		clienteRepository.saveAll(Arrays.asList(cli2));
		clienteRepository.saveAll(Arrays.asList(cli3));
		clienteRepository.saveAll(Arrays.asList(cli4));
		clienteRepository.saveAll(Arrays.asList(cli5));
		clienteRepository.saveAll(Arrays.asList(cli6));
		
		chamadoRepository.saveAll(Arrays.asList(c1));
		chamadoRepository.saveAll(Arrays.asList(c2));
		chamadoRepository.saveAll(Arrays.asList(c3));
		chamadoRepository.saveAll(Arrays.asList(c4));
		chamadoRepository.saveAll(Arrays.asList(c5));
		chamadoRepository.saveAll(Arrays.asList(c6));
		chamadoRepository.saveAll(Arrays.asList(c7));
		chamadoRepository.saveAll(Arrays.asList(c8));
	}
}
