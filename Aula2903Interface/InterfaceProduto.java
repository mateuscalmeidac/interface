package Aula2903Interface;

public class InterfaceProduto {// Interface Produto
    interface Produto {
        // Métodos que todas as classes de produtos devem implementar
        String getNome();
        double getPreco();
        void exibirDetalhes();
    }
}
