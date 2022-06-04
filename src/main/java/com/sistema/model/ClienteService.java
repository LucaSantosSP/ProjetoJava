package com.sistema.model;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	
	@Autowired
	ClienteDAO cdao;
	
	public void inserirCliente(RegisterInfos c) {
		cdao.inserirCliente(c);
	}
	
	public Map<String,Object> getCliente(int id){
		return cdao.getCliente(id);
	}
}
