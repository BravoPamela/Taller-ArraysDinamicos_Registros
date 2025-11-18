/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

import com.mycompany.biblioteca.lectores.Lectores;
import com.mycompany.biblioteca.lectores.RegistroLectores;
import com.mycompany.biblioteca.libros.Estado;
import com.mycompany.biblioteca.libros.Estanterias;
import com.mycompany.biblioteca.libros.Libros;
import com.mycompany.biblioteca.tarjeta.RegistroTarjetas;
import com.mycompany.biblioteca.tarjeta.TipoTarjetas;

/**
 *
 * @author Admin
 */
public class Biblioteca {

    public static void main(String[] args) {
        
        // Estantería
        Estanterias est = new Estanterias(30);

        est.asignarLibro(new Libros("A1", "Cien años de soledad", "G. Márquez", "Novela", Estado.Disponible));
        est.asignarLibro(new Libros("B1", "El Principito", "Saint-Exupéry", "Infantil", Estado.Disponible));

        est.listar();

        // Registro de lectores
        RegistroLectores reg = new RegistroLectores();

        reg.registrarEntrada(new Lectores("08:00", 123456, TipoTarjetas.LECTOR, "Ana", "Centro"));
        reg.registrarEntrada(new Lectores("09:30", 789012, TipoTarjetas.VOLUNTARIO, "Luis", "Norte"));
        reg.registrarEntrada(new Lectores("10:15", 465789, TipoTarjetas.COORDINADOR, "Marta", "Sur"));

        reg.listar();
        
         // ejemplos de uso:
        System.out.println("\n Existe A1? " + est.consultarEstanteria("A1"));
        Lectores busc = reg.buscarPorCedula(123456);
        System.out.println("\nBuscado por cédula 123456: " + (busc != null ? busc : "no encontrado")); //operador ternario.
    }
}
        
        
   
