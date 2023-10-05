/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.model;

import java.util.Date;

/**
 *
 * @author Cris
 */
public class Empleado {
    private Integer id;
    private String nombre;
    private Date fecha_contrato;
    private String profesion;
    private Double sueldo;

    public Empleado() {
    }

    public Empleado(Integer id, String nombre, Date fecha_contrato, String profesion, Double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_contrato = fecha_contrato;
        this.profesion = profesion;
        this.sueldo = sueldo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(Date fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
    
}
