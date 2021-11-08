package com.example.prueba.models;
import javax.persistence.*;

@Entity
@Table(name = "t01_solicitud")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private Integer estado;
    private Integer fecha_ingreso;
    private Integer monto;
    private long id_cliente;

    public void setMonto(Integer monto){
        this.monto = monto;
    }

    public Integer getMonto(){
        return monto;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setFecha_ingreso(Integer fecha_ingreso){
        this.fecha_ingreso = fecha_ingreso;
    }

    public Integer getFecha_ingreso(){
        return fecha_ingreso;
    }

    public void setEstado(Integer estado){
        this.estado = estado;
    }

    public Integer getEstado(){
        return estado;
    }
    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }
    public Long getId_cliente() {
        return id_cliente;
    }

}