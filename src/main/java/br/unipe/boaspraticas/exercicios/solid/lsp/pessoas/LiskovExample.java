package br.unipe.boaspraticas.exercicios.solid.lsp.pessoas;

public class LiskovExample {
    public static void main(String[] args) {
        // Usando polimorfismo
        Pessoa pessoa = new Pessoa("João");
        pessoa.fazerSom(); // Oi!

        // Usando polimorfismo
        pessoa = new Funcionario("Maria", 4000);
        pessoa.fazerSom(); // Oi!

    }
}
