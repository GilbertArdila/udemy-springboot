//package com.udemy.project.entity;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * muchas facturas un solo cliente
// * ManyToOne
// * la factura puede contener muchos items
// * OneToMany
// */
//@Entity
//@Table(name = "facturas")
//public class Factura {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @NotEmpty(message = "Could not be empty")
//    @Size(max = 120, message = "Must not be bigger than 120 characters")
//    @Column(nullable = false)
//    private String descripcion;
//    @Column(nullable = false)
//    @NotEmpty(message = "Could not be empty")
//    @Size(max = 50, message = "Must not be bigger than 50 characters")
//    private String observacion;
//    @Column(nullable = false, name = "create_at")
//    private LocalDate createAt;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Cliente cliente;
//
//    /*este join nos crea un campo factura_id en la tabla ItemFactura,
//     * por que es relaión en un solo sentido, no bidireccional
//     * si hubiera una relación bidireccional lo que hariamos
//     * sería poner un mappedBy en lugar de un joinColumn*/
//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "factura_id")
//    private List<ItemFactura> items;
//
//
//    /**********************************************************************************************************/
//
//    //constructor para agregar items a la factura
//    public Factura() {
//        this.items = new ArrayList<ItemFactura>();
//    }
//
//    //nos crea la fecha automaticamente cada vez que se crea un registro
//    @PrePersist
//    public void prePersist() {
//        createAt = LocalDate.now();
//    }
//
//    //metodo para agregar items a la factura
//    public void addItemFactura(ItemFactura item) {
//        this.items.add(item);
//    }
//
//
//    /*retornamos el total de la factura
//     *utilizando el metodo  calcularImporte de la clase itemFactura
//     *que nos retorna el valor de cada item*/
//    public Double getTotal() {
//        Double total = 0.0;
//        int size = items.size();
//        for (int i = 0; i < size; i++) {
//            total += items.get(i).calculatImporte();
//        }
//        return total;
//
//    }
//
//    /**********************************************************************************************************/
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getDescripcion() {
//        return descripcion;
//    }
//
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }
//
//    public String getObservacion() {
//        return observacion;
//    }
//
//    public void setObservacion(String observacion) {
//        this.observacion = observacion;
//    }
//
//    public LocalDate getCreateAt() {
//        return createAt;
//    }
//
//    public void setCreateAt(LocalDate createAt) {
//        this.createAt = createAt;
//    }
//
//    public Cliente getCliente() {
//        return cliente;
//    }
//
//    public void setCliente(Cliente cliente) {
//        this.cliente = cliente;
//    }
//
//    public List<ItemFactura> getItems() {
//        return items;
//    }
//
//    public void setItems(List<ItemFactura> items) {
//        this.items = items;
//    }
//
//
//}
