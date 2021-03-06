/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tii.springboot.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "llegadas")
public class Llegada implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "idLlegada")
    private Long idLlegada;
    
    @NotEmpty
    private String nombreLlegada;
    
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name= "llegadaFecha")
    private Date llegadaFecha;
    
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern="HH:mm")
    @Column(name= "llegadaHora")
    private Date llegadaHora;
    
    @NotEmpty
    private String llegadaEstado;

    public Long getIdLlegada() {
        return idLlegada;
    }

    public void setIdLlegada(Long idLlegada) {
        this.idLlegada = idLlegada;
    }

    public String getNombreLlegada() {
        return nombreLlegada;
    }

    public void setNombreLlegada(String nombreLlegada) {
        this.nombreLlegada = nombreLlegada;
    }

    
    
    public Date getLlegadaFecha() {
        return llegadaFecha;
    }

    public void setLlegadaFecha(Date llegadaFecha) {
        this.llegadaFecha = llegadaFecha;
    }

    public Date getLlegadaHora() {
        return llegadaHora;
    }

    public void setLlegadaHora(Date llegadaHora) {
        this.llegadaHora = llegadaHora;
    }
    
    
    
    private static final long serialVersionUID = 1L;
}
