package com.quat.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.quat.dto.ClienteDTO;

@Transactional
public interface ClienteDao extends CrudRepository<ClienteDTO, Long>{
	

}
