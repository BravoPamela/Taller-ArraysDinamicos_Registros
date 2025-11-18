/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.lectores;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class RegistroLectores {
    
    private ArrayList<Lectores> listaLectores;

    public RegistroLectores () {
        listaLectores = new ArrayList<>();
    }

    // Registrar entrada del lector
    public void registrarEntrada(Lectores lector) {
        listaLectores.add(lector);
    }

    // Eliminar un registro por cédula
    public boolean eliminarRegistro(int cedula) {
        return listaLectores.removeIf(l -> l.getCedula() == cedula);
    }

    // Buscar por cédula
    public Lectores buscarPorCedula(int cedula) {
        for (Lectores l : listaLectores) {
            if (l.getCedula() == cedula) {
                return l;
            }
        }
        return null;
    }

    // Filtrar por barrio
    public ArrayList<Lectores> buscarPorBarrio(String barrio) {
        ArrayList<Lectores> resultado = new ArrayList<>();
        for (Lectores l : listaLectores) {
            if (l.getBarrio().equalsIgnoreCase(barrio)) {
                resultado.add(l);
            }
        }
        return resultado;
    }

    // Depurar duplicados (mantener primero)
    public void depurarDuplicados() {
        ArrayList<Integer> cedulasVistas = new ArrayList<>();
        ArrayList<Lectores> depurado = new ArrayList<>();

        for (Lectores l : listaLectores) {
            if (!cedulasVistas.contains(l.getCedula())) {
                depurado.add(l);
                cedulasVistas.add(l.getCedula());
            }
        }

        listaLectores = depurado;
    }

    // Listar todos
    public void listar() {
        for (Lectores l : listaLectores) {
            System.out.println(l);
        }
    }
}
