/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.tarjeta;

public class RegistroTarjetas {
    
     public static Tarjetas datosTarjeta(TipoTarjetas tipo) {

        return switch (tipo) {
            case LECTOR ->
                    new Tarjetas("L", ZonasPermitidas.Lectura, TipoTarjetas.LECTOR, 3);

            case VOLUNTARIO ->
                    new Tarjetas("V", ZonasPermitidas.Deposito, TipoTarjetas.VOLUNTARIO, 5);

            case COORDINADOR ->
                    new Tarjetas("C", ZonasPermitidas.Administracion    , TipoTarjetas.COORDINADOR, 10);
        };
    }
    
}
