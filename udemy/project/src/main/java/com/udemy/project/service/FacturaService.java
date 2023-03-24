//package com.udemy.project.service;
//
//import com.udemy.project.dao_repository.IfacturaDao;
//import com.udemy.project.entity.Factura;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class FacturaService implements IfacturaService {
//
//    @Autowired
//    private final IfacturaDao dao;
//
//    public FacturaService(IfacturaDao service) {
//        this.dao = service;
//    }
//
//
//    public Factura update(Factura factura, long id) {
//        if (this.findById(id).isEmpty()) {
//            return null;
//        }
//        Factura newData = new Factura();
//        newData.setCliente(factura.getCliente());
//        newData.setDescripcion(factura.getDescripcion());
//        newData.setObservacion(factura.getObservacion());
//        return dao.save(newData);
//    }
//
//
//    @Override
//    public List<Factura> findAll() {
//        return (List<Factura>) dao.findAll();
//    }
//
//    @Override
//    public Factura save(Factura factura) {
//        return dao.save(factura);
//    }
//
//    @Override
//    public Optional<Factura> findById(Long id) {
//        return dao.findById(id);
//    }
//
//    @Override
//    public void delete(Long id) {
//        dao.deleteById(id);
//    }
//
//    @Override
//    public Optional<List<Factura>> findByObservacion(String observacion) {
//        return dao.findByObservacion(observacion);
//    }
//
//    @Override
//    public Optional<List<Factura>> findByCreateAt(LocalDate date) {
//        return dao.findByCreateAt(date);
//    }
//
//
//}
