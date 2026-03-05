/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 *
 * @author aluno.saolucas
 */
public class Aluno {

    private final String nome;
    private final double nota1;
    private final double nota2;

    public Aluno(String nome, double nota1, double nota2) {

        this.nome = nome;

        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            this.nota1 = 0;
        }

        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            this.nota2 = 0;
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean verificarAprovacao() {
        return calcularMedia() >= 6;
    }
}
