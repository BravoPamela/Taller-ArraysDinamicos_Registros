/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.libros;

/**
 *
 * @author Admin
 */
public class Estanterias {

    private Libros[] libros;
    private int total;

    public Estanterias(int dimension) {
        libros = new Libros[dimension];
        total = 0;
    }

    // asignar al primer compartimento libre
    public boolean asignarLibro(Libros libro) {
        if (total == libros.length) return false;
        libros[total++] = libro;
        return true;
    }

    // consultar si existe un libro por código
    public boolean consultarEstanteria(String codigo) {
        if (codigo == null) return false;
        for (int i = 0; i < total; i++) {
            if (libros[i] != null && codigo.equals(libros[i].getCodigo())) return true;
        }
        return false;
    }

    // listar todos los compartimentos
    public void listar() {
        System.out.println("\n--- ESTANTERÍA ---");
        for (int i = 0; i < libros.length; i++) {
            System.out.println("Compartimento " + (i + 1) + ": " +
                    (libros[i] == null ? "VACÍO" : libros[i].toString()));
        }
    }

    // obtener libro por posicion 1..n
    public Libros obtenerLibro(int posicion) {
        if (posicion < 1 || posicion > libros.length) return null;
        return libros[posicion - 1];
    }

    // reemplazar libro en posicion 1..n
    public boolean reemplazarLibro(int posicion, Libros nuevo) {
        if (posicion < 1 || posicion > libros.length) return false;
        libros[posicion - 1] = nuevo;
        // mantener total consistente: si reemplazamos un null, actualizar total
        if (posicion - 1 >= total) {
            total = posicion; // asumimos que estamos llenando hacia delante
        }
        return true;
    }

}
