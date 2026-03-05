/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author aluno.saolucas
 */
public class MainProduto {

    public static void main(String[] args) {

        Produto p = new Produto("Mouse", 100);

        p.entradaEstoque(10);
        p.saidaEstoque(3);

        System.out.println("Valor total estoque: " + p.valorTotalEstoque());
    }
}
