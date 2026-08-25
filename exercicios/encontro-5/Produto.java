class Produto {
    // TODO: declarar int codigo e double preco.
    int codigo;
    double preco;

    void exibir() {
        // TODO: exibir codigo e preco deste produto.
        System.out.printf("Codigo: %d, preco: %.2f%n", codigo, preco);
    }

    void alterarPreco(double novoPreco) {
        // TODO: validar e alterar o preco deste produto.
        if (novoPreco > 0) {
            preco = novoPreco;
        } else {
            System.out.println("Preco invalido.");
        }
    }
}