/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana6;

/**
 *
 * @author admin
 */
public class animal {
    private String nombre;  // Encapsulación

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método que será sobrescrito (Polimorfismo)
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
    
}
