/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

/**
 *
 * @author aluno.saolucas
 */
public class MainPessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana", 20);
        Pessoa p2 = new Pessoa("Carlos", 25);
        Pessoa p3 = new Pessoa("Julia", 30);

        p1.fazerAniversario();
        p2.setIdade(26);
        p3.setNome("Juliana");

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
    }
}