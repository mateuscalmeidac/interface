package Aula2903Interface;

public class Livro {// Classe Livro implementando a interface Produto
        // Atributos específicos de um livro
        private String nome;
        private String autor;
        private double preco;

        // Construtor para inicializar os atributos
        public Livro(String nome, String autor, double preco) {
            this.nome = nome;
            this.autor = autor;
            this.preco = preco;
        }

        // Implementação dos métodos da interface

        public String getNome() {
            return nome;
        }


        public double getPreco() {
            return preco;
        }

        public void exibirDetalhes() {
            System.out.println("Livro: " + nome);
            System.out.println("Autor: " + autor);
            System.out.println("Preço: R$" + preco);
        }
    }

