package Aula2903Interface;

public class Main {
    public static void main(String[] args) {
        // Criar instâncias de Produto (ou diretamente Eletronico)
        Produto eletronico = new Eletronico("Smartphone", "Samsung", 2500.00);

        // Exibir detalhes do produto
        eletronico.exibirDetalhes();
    }
}