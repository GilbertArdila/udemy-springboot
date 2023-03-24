//package com.udemy.project.dao_repository;
//
//import com.udemy.project.entity.Producto;
//import org.springframework.data.repository.CrudRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface IproductoDao extends CrudRepository<Producto,Long> {
//
//    Optional<List<Producto>> findByPrecioBetween(Double min,Double max);
//    Optional<Producto> findByNombre(String nombre);
//}
