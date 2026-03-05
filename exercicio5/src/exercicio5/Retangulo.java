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
public class Retangulo {

    private final double largura;
    private final double altura;

    public Retangulo(double largura, double altura) {

        if (largura > 0 && altura > 0) {
            this.largura = largura;
            this.altura = altura;
        } else {
            this.largura = 1;
            this.altura = 1;
        }
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public boolean ehQuadrado() {
        return largura == altura;
    }
}