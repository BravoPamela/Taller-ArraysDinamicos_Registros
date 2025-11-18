/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.lectores;

import com.mycompany.biblioteca.tarjeta.TipoTarjetas;

/**
 *
 * @author Admin
 */
public class Lectores {
    private String horaLLegada;
    private int cedula;
    private TipoTarjetas tipoTarjetas;
    private String nombre; 
    private String barrio;

    public Lectores(String horaLLegada, int cedula, TipoTarjetas tipoTarjetas, String nombre, String barrio) {
        this.horaLLegada = horaLLegada;
        this.cedula = cedula;
        this.tipoTarjetas = tipoTarjetas;
        this.nombre = nombre;
        this.barrio = barrio;
    }

    public String getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(String horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public TipoTarjetas getTipoTarjetas() {
        return tipoTarjetas;
    }

    public void setTipoTarjetas(TipoTarjetas tipoTarjetas) {
        this.tipoTarjetas = tipoTarjetas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    
    

    public boolean LectoresEntrada(TipoTarjetas tipoTarjetas){
      return true;  
    }

    @Override
    public String toString() {
        return "Lectores{" + "horaLLegada=" + horaLLegada + ", cedula=" + cedula + ", tipoTarjetas=" + tipoTarjetas + ", nombre=" + nombre + ", barrio=" + barrio + '}';
    }
   
    
    
}
