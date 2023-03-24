//package com.udemy.project.service;
//
//import com.udemy.project.dao_repository.IproductoDao;
//import com.udemy.project.entity.Producto;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ProductoService implements IproductoService{
//
//    @Autowired
//    private final IproductoDao dao;
//
//    public ProductoService(IproductoDao service) {
//        this.dao = service;
//    }
//
//
//
//
//    public Producto update(Producto producto, long id) {
//        if (!this.findById(id).isPresent()) {
//            return null;
//        }
//        Producto newData = new Producto();
//        newData.setPrecio(producto.getPrecio());
//        newData.setNombre(producto.getNombre());
//        return dao.save(newData);
//
//    }
//
//
//    @Override
//    public List<Producto> findAll() {
//        return (List<Producto>) dao.findAll();
//    }
//
//    @Override
//    public Producto save(Producto producto) {
//        return dao.save(producto);
//    }
//
//    @Override
//    public Optional<Producto> findById(Long id) {
//        return dao.findById(id);
//    }
//
//    @Override
//    public void delete(Long id) {
//      dao.deleteById(id);
//    }
//
//    @Override
//    public Optional<Producto> findByNombre(String nombre) {
//        return dao.findByNombre(nombre);
//    }
//
//    @Override
//    public Optional<List<Producto>> findByPrecioBetween(Double min, Double max) {
//        return dao.findByPrecioBetween(min,max);
//    }
//}
