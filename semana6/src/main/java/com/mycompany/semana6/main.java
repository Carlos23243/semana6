/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana6;

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) {
        Animal miPerro = new Perro("Rocky");
        Animal miGato = new Gato("Michi");

        // Demostración de polimorfismo
        hacerSonarAnimal(miPerro);
        hacerSonarAnimal(miGato);
    }

    // Polimorfismo: método que acepta cualquier tipo de Animal
    public static void hacerSonarAnimal(Animal animal) {
        animal.hacerSonido();  // Comportamiento polimórfico
    }
}
