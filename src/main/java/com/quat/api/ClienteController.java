package com.quat.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quat.dto.ClienteDTO;
import com.quat.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired 
	ClienteService clienteservice;
	
	@RequestMapping(value="/crear",produces="application/json")
	public ClienteDTO crearCliente(@RequestParam String nombre, @RequestParam String correo) {
	
		return clienteservice.crearCliente(nombre, correo);
		
	}
	
	

}
