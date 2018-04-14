package com.quat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quat.dao.ClienteDao;
import com.quat.dto.ClienteDTO;

@Service
public class ClienteService {

	@Autowired
	ClienteDao clientedao;

	public ClienteDTO crearCliente(String nombre, String correo) {
		ClienteDTO cliente = new ClienteDTO();

		cliente.setNombre(nombre);
		cliente.setCorreo(correo);

		clientedao.save(cliente);
		return cliente;
	}

}
