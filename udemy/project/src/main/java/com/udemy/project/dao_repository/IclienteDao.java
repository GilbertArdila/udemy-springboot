package com.udemy.project.dao_repository;

import com.udemy.project.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IclienteDao extends CrudRepository<Cliente,Long> {
    Cliente findByEmail(String email);

}
