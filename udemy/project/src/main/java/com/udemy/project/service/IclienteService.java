package com.udemy.project.service;

import com.udemy.project.entity.Cliente;

import java.util.List;
import java.util.Optional;

public interface IclienteService {
    public List<Cliente> findAll();
    public Cliente save(Cliente cliente);

    public Cliente findById(Long id);

    public void delete(Long id);

    public Optional<Cliente> findByEmail(String email);


}
