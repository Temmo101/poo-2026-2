class Produto {
    int codigo;
    double preco;

    void exibir() {
        System.out.printf("Codigo: %d, preco: %.2f%n", codigo, preco);
    }

    void alterarPreco(double novoPreco) {
        if (novoPreco > 0) {
            preco = novoPreco;
        } else {
            System.out.println("Preco invalido.");
        }
    }
}