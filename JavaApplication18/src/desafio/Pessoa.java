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
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {

        if (!nome.isEmpty()) {
            this.nome = nome;
        } else {
            this.nome = "Sem nome";
        }

        if (idade >= 0) {
            this.idade = idade;
        } else {
            this.idade = 0;
        }
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public void fazerAniversario() {
        idade++;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}