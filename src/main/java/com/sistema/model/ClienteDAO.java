package com.sistema.model;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteDAO {

	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jbdc;
	
	@PostConstruct
	private void initialize() {
		jbdc = new JdbcTemplate(dataSource);
	}
	
	public void inserirCliente(RegisterInfos cliente) {
		String sql = "INSERT INTO cliente(firstName, lastName, email, senha)" + " VALUES (?,?,?,?)";
		
		Object[] obj = new Object[4];
		obj[0] = cliente.getnFirstName();
		obj[1] = cliente.getnLastName();
		obj[2] = cliente.getnEmail();
		obj[3] = cliente.getnSenha();
		jbdc.update(sql, obj);
	}
}
