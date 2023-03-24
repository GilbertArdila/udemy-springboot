//package com.udemy.project.dao_repository;
//
//import com.udemy.project.entity.Factura;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.Optional;
//
//public interface IfacturaDao extends CrudRepository<Factura,Long> {
//    Optional<List<Factura>>findByObservacion(String observacion);
//    Optional<List<Factura>> findByCreateAt(LocalDate date);
//
////    @Query("SELECT a.descripcion,a.observacion,a.createAt," +
////            "b.nombre," +
////            "b.apellido,b.email,c.cantidad," +
////            "d.nombre,d.precio " +
////            "FROM Factura  a " +
////            "INNER JOIN Cliente  b " +
////            "ON a.cliente_id = b.id " +
////            "INNER JOIN ItemFactura  c " +
////            "ON a.id = c.factura_id " +
////            "INNER JOIN Producto  d " +
////            "ON c.producto_id = d.id " +
////            "WHERE  b.id =:idCliente")
////    Optional<List<Factura>>findByCliente(@Param("idCliente") Long idCliente);
//
//
//
//
//
//}
