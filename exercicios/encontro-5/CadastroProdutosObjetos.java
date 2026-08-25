import java.util.Locale;
import java.util.Scanner;
public class CadastroProdutosObjetos {
    static final int MAX_PRODUTOS = 5;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Produto[] produtos = new Produto[MAX_PRODUTOS];
        int quantidade = 0;
        int opcao;

        do {
            mostrarMenu();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    // TODO: ler dados e atualiz1ar quantidade com cadastrarProduto.
                    System.out.print("Digite o codigo do produto: ");
                    int codigo = entrada.nextInt();
                    System.out.print("Digite o preco do produto: ");
                    double preco = entrada.nextDouble();
                    quantidade = cadastrarProduto(produtos, quantidade, codigo, preco);
                    break;
                case 2:
                    // TODO: consultar.
                    System.out.print("Digite o codigo do produto para consultar: ");
                    int codigoConsulta = entrada.nextInt();
                    consultarProduto(produtos, quantidade, codigoConsulta);
                    break;
                case 3:
                    // TODO: alterar preco.
                    System.out.print("Digite o codigo do produto para alterar preco:");
                    int codigoAlterar = entrada.nextInt();
                    System.out.print("Digite o novo preco do produto: ");
                    double novoPreco = entrada.nextDouble();
                    int indice = buscarIndicePorCodigo(produtos, quantidade, codigoAlterar);
                    if (indice != -1) {
                        produtos[indice].alterarPreco(novoPreco);
                    } else {
                        System.out.println("Produto nao encontrado. ");
                    }
                    break;
                case 4:
                    // TODO: remover e atualizar quantidade.
                    System.out.print("Digite o codigo do produto para remover: ");
                    int codigoRemover = entrada.nextInt();
                    quantidade = removerProduto(produtos, quantidade, codigoRemover);
                    break;
                case 5:
                    listarProdutos(produtos, quantidade);
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

    static void mostrarMenu() { 
        System.out.print("\n1-Cadastrar 2-Consultar 3-Alterar 4-Remover 5-Listar 0-Sair\nOpcao: "); 
    }
    static int buscarIndicePorCodigo(Produto[] produtos, int quantidade, int codigo) { 
        for (int i = 0; i < quantidade; i++) {
            if (produtos[i].codigo == codigo) {
                return i;
            }
        }
        return -1; 
    }
    static int cadastrarProduto(Produto[] produtos, int quantidade, int codigo, double preco) { 
        Produto novoProduto = new Produto();
            if (quantidade < MAX_PRODUTOS) {
                    novoProduto.codigo = codigo;
                    novoProduto.preco = preco;
                    produtos[quantidade] = novoProduto;
                    quantidade++;
            } else { 
                System.out.println("Limite de produtos atingido.");
            }
        return quantidade; 
    }
    static void consultarProduto(Produto[] produtos, int quantidade, int codigo) {
                    int indice = buscarIndicePorCodigo(produtos, quantidade, codigo);
                    if (indice != -1) {
                        produtos[indice].exibir();
                    } else {
                        System.out.println("Produto nao encontrado.");
                    }
    }
    static int removerProduto(Produto[] produtos, int quantidade, int codigo) { 
        int indice = buscarIndicePorCodigo(produtos, quantidade, codigo);
        if (indice == -1) {
            System.out.println("Produto nao encontrado.");
            return quantidade;
        }

        for (int i = indice; i < quantidade - 1; i++) {
            produtos[i] = produtos[i + 1];
        }

        produtos[quantidade - 1] = null;

        return quantidade - 1; 
    }
    static void listarProdutos(Produto[] produtos, int quantidade) { 
        if (quantidade == 0) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (int i = 0; i < quantidade; i++) {
            produtos[i].exibir();              
        }
    }
}
