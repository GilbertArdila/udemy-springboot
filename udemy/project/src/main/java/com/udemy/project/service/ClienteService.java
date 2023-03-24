package com.udemy.project.service;

import com.udemy.project.dao_repository.IclienteDao;
import com.udemy.project.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IclienteService {

    @Autowired
    private final IclienteDao dao;

    public ClienteService(IclienteDao service) {
        this.dao = service;
    }

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) dao.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        cliente.setCreatedAt(LocalDate.now());
        return dao.save(cliente);
    }

    @Override
    public Cliente findById(Long id) {

        return dao.findById(id).orElse(null);

    }

    @Override
    public void delete(Long id) {
        if(dao.findById(id).isPresent()){
            dao.deleteById(id);
        }

    }

    @Override
    public Optional<Cliente> findByEmail(String email) {

        return Optional.ofNullable(dao.findByEmail(email));
    }


    public Cliente update(Cliente cliente, long id) {
        if (this.findById(id) != null) {
            Cliente actual = this.findById(id);
            actual.setNombre(cliente.getNombre());
            actual.setApellido(cliente.getApellido());
            actual.setEmail(cliente.getEmail());
            return dao.save(actual);
        }

        return null;


    }


}
