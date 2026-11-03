import java.util.Locale;
import java.util.Scanner;

// Classe reutilizada do Projeto 1: ela ja protege codigo e preco.
class Produto {
    private final int codigo;
    private double preco;

    Produto(int codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    int getCodigo() { return codigo; }
    double getPreco() { return preco; }

    boolean alterarPreco(double novoPreco) {
        if (novoPreco <= 0) return false;
        preco = novoPreco;
        return true;
    }
}

class ItemPedido {
    // TODO 1: declare os atributos que representam o produto escolhido e a quantidade.

    private Produto produto;
    private int quantidade;

    ItemPedido(Produto produto, int quantidade) {
        // TODO 2: guarde a referencia recebida e a quantidade nos atributos desta classe.
        this.produto = produto;
        this.quantidade = quantidade;
    }

    boolean alterarQuantidade(int novaQuantidade) {
        // TODO 3: recuse valor menor ou igual a zero; em caso valido, atualize a quantidade.
        if (novaQuantidade <= 0) {
            return false;
        }
        this.quantidade = novaQuantidade;
        return true;
    }

    double calcularSubtotal() {
        // TODO 4: consulte o preco do Produto e calcule preco x quantidade.
        return this.produto.getPreco() * this.quantidade;
    }

    void exibir() {
        // TODO 5: mostre codigo, preco, quantidade e subtotal deste item.
        System.out.printf("Codigo: %d, Preco: %.2f, Quantidade: %d, Subtotal: %.2f\n",
            this.produto.getCodigo(), this.produto.getPreco(), this.quantidade, this.calcularSubtotal()
        );
    }
}

class Pedido {
    // TODO 6: declare o numero do pedido e o ItemPedido que pertence a ele.

    private int numero;
    private ItemPedido itemPedido;
    Pedido(int numero, Produto produto, int quantidade) {
        // TODO 7: guarde o numero e crie internamente o ItemPedido.
        this.numero = numero;
        this.itemPedido = new ItemPedido(produto, quantidade);
    }

    boolean alterarQuantidade(int novaQuantidade) {
        // TODO 8: delegue a alteracao para o ItemPedido.
        return this.itemPedido.alterarQuantidade(novaQuantidade);
    }

    double calcularTotal() {
        // TODO 9: delegue o calculo para o ItemPedido.
        return this.itemPedido.calcularSubtotal();
    }

    void exibir() {
        // TODO 10: mostre o numero, os dados do item e o total do pedido.
        System.out.printf("Pedido numero: %d\n", this.numero);
        this.itemPedido.exibir();
        System.out.printf("Total do pedido: %.2f\n", this.calcularTotal());
    }
}

public class ProjetoPedidoInicial {
    static void mostrarMenu() {
        System.out.print("\n1-Exibir pedido 2-Alterar preco 3-Alterar quantidade 0-Sair\nOpcao: ");
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Produto cafe = new Produto(101, 5.50);
        Pedido pedido = new Pedido(10, cafe, 3);
        int opcao;

        do {
            mostrarMenu();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    pedido.exibir();
                    break;
                case 2:
                    System.out.print("Novo preco: ");
                    if (cafe.alterarPreco(entrada.nextDouble())) {
                        System.out.println("Preco alterado.");
                    } else {
                        System.out.println("O preco deve ser maior que zero.");
                    }
                    break;
                case 3:
                    System.out.print("Nova quantidade: ");
                    if (pedido.alterarQuantidade(entrada.nextInt())) {
                        System.out.println("Quantidade alterada.");
                    } else {
                        System.out.println("A quantidade deve ser maior que zero.");
                    }
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);

        entrada.close();
    }
}
