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
public class MainAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Carlos", 7, 8);

        System.out.println("Média: " + aluno.calcularMedia());

        if (aluno.verificarAprovacao()) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
