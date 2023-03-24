//package com.udemy.project.entity;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;
//import java.time.LocalDate;
//
///**
// * el producto no tiene una relación
// * con la clase itemFactura, no queremos
// * listar los items donde se encuentre el producto
// */
//@Entity
//@Table(name = "productos")
//public class Producto {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @NotEmpty(message = "Could not be empty")
//    @Size(min = 5, max = 150, message = "Must be between 5 and 150 characters")
//    @Column(nullable = false)
//    private String nombre;
//    @NotEmpty(message = "Could not be empty")
//    @Column(nullable = false)
//    private Double precio;
//    @Column(name = "create_at", nullable = false)
//    private LocalDate createAt;
//
//    /*******************************************************************/
//
//
//    //le asignamos la fecha antes de crear un nuevo objeto de producto
//    @PrePersist
//    public void prePersist() {
//        createAt = LocalDate.now();
//    }
//
//    /*******************************************************************/
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public Double getPrecio() {
//        return precio;
//    }
//
//    public void setPrecio(Double precio) {
//        this.precio = precio;
//    }
//
//    public LocalDate getCreateAt() {
//        return createAt;
//    }
//
//    public void setCreateAt(LocalDate createAt) {
//        this.createAt = createAt;
//    }
//}
