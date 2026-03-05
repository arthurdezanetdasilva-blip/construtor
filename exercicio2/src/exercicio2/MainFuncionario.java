/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author aluno.saolucas
 */
public class MainFuncionario {

    public static void main(String[] args) {

        Funcionario f = new Funcionario("Ana", 3000, "Gerente");

        f.aumentarSalario(10);

        f.exibirDados();
    }
}