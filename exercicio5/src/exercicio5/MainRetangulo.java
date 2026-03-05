/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author aluno.saolucas
 */
public class MainRetangulo {

    public static void main(String[] args) {

        Retangulo r = new Retangulo(5, 5);

        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
        System.out.println("É quadrado? " + r.ehQuadrado());
    }
}
