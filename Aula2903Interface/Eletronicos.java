package Aula2903Interface;

// Classe Eletronico implementando a interface Produto
    class Eletronico implements Produto {
        // Atributos específicos de um eletrônico
        private String nome;
        private String marca;
        private double preco;

        // Construtor para inicializar os atributos
        public Eletronico(String nome, String marca, double preco) {
            this.nome = nome;
            this.marca = marca;
            this.preco = preco;
        }

        // Implementação dos métodos da interface
        @Override
        public String getNome() {
            return nome;
        }

        @Override
        public double getPreco() {
            return preco;
        }

        @Override
        public void exibirDetalhes() {
            System.out.println("Eletrônico: " + nome);
            System.out.println("Marca: " + marca);
            System.out.println("Preço: R$" + preco);
        }
    }

