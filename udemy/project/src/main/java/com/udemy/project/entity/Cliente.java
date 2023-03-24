package com.udemy.project.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
    un cliente muchas facturas
    OneToMany

    estas anotaciones de validación son parte del api de validaciones de java
    cuya dependencia agregamos en el pom.xml
     */
@Entity
@Table(name = "clientes")
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Could not be empty")
    @Size(min = 3, max = 12, message = "Must be between 3 and 12 characters")
    @Column(nullable = false)
    private String nombre;
    @NotEmpty(message = "Could not be empty")
    @Size(min = 2, max = 12, message = "Must be between 3 and 12 characters")
    @Column(nullable = false)
    private String apellido;

    @Email(message = "Email format not valid, please check it")
    @NotEmpty(message = "Could not be empty")
    @Column(length = 150, nullable = false, unique = true)
    private String email;
    @Column(name = "create_at")
    private LocalDate createdAt;

    //este mappedBy es el nombre del atributo en la clase Factura
//    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Factura> facturas;
//
//    //creamos este constructor para la lista facturas
//    public Cliente() {
//        facturas = new ArrayList<Factura>();
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

//    public List<Factura> getFacturas() {
//        return facturas;
//    }
//
//    public void setFacturas(List<Factura> facturas) {
//        this.facturas = facturas;
//    }
//
//    //este metodo es para agregar cada factura al cliente
//    public void addFactura(Factura factura) {
//        facturas.add(factura);
//    }
}
