//package com.udemy.project.entity;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;
//
///**
// * la clase itemFactura no tiene relación con factura
// * porque no queremos ver cada factura en donde este este item relacionado
// * el itemFactura tiene una relación con la clase Producto muchos itemFactura
// * un producto, ManyToOne
// * relación uniDireccional
// */
//@Entity
//@Table(name = "facturas_items")
//public class ItemFactura {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(nullable = false)
//    @NotEmpty(message = "Could not be empty")
//    private Integer cantidad;
//
//    /*este joinColumn nos crea el campo producto_id en la tabla itemFactura
//     * por cuanto no es relación bidireccional sino unidireccional,
//     * si hubiera una lista de itemsFactura en producto
//     * lo que haríamos sería usar un mappedBy en la tabla producto
//     * y le pondriamos el nombre de este campo para crear la relación
//     * */
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "producto_id")
//    private Producto producto;
//
//    /**************************************************************/
//    //en este metodo multiplicamos el precio del producto
//    // por la cantidad del mismo que se genera en el item
//    public Double calculatImporte() {
//        return cantidad.doubleValue() * this.producto.getPrecio();
//    }
//
//    /****************************************************************/
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getCantidad() {
//        return cantidad;
//    }
//
//    public void setCantidad(Integer cantidad) {
//        this.cantidad = cantidad;
//    }
//
//
//}
