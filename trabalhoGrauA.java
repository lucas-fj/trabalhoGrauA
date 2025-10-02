import java.util.Scanner;

public class trabalhoGrauA {

    // Variáveis da maior venda
    static String maiorNome = "";
    static double maiorPreco = 0.0;
    static String listaItens = "";
    static String listaAtual = "";

    // Váriaveis para controle de estoque
    static int estoqueCalca = 20;
    static int estoqueCamisa = 18;
    static int estoqueBermuda = 23;
    static int estoqueSaia = 12;
    static int estoqueBlusa = 9;
    static int estoqueMoletom = 4;
    static int estoqueMeia = 17;
    static int estoqueTenis = 8;
    static int estoqueBota = 3;

    // Váriaveis para preço dos itens
    static double precoCalca = 112;
    static double precoCamisa = 95;
    static double precoBermuda = 49.90;
    static double precoSaia = 169;
    static double precoBlusa = 120;
    static double precoMoletom = 135;
    static double precoMeia = 12.99;
    static double precoTenis = 183;
    static double precoBota = 219.90;

    // Váriaveis para preço dos itens
    static double calcaVendida = 0;
    static double camisaVendida = 0;
    static double bermudaVendida = 0;
    static double saiaVendida = 0;
    static double blusaVendida = 0;
    static double moletomVendido = 0;
    static double meiaVendida = 0;
    static double tenisVendido = 0;
    static double botaVendida = 0;

    // Váriaveis para controle
    static double valorTotalItensVendidos = 0;
    static double maiorVenda = 0;
    static String nomeCliente = "";
    static double itemMaiorVenda = 0;
    static int quantidadeVendida = 0;

    // Função para mostrar maior venda
    public static void maiorVenda(Scanner scanner) {
        System.out.println(maiorNome);
        System.out.printf("Valor da compra: %.2f\n", maiorPreco);
        System.out.println(listaItens);
    }

    // Função para menu
    public static int menu(Scanner scanner) {
        // Menu com as opções de escolha
        System.out.println("1 - Calça");
        System.out.println("2 - Camisa");
        System.out.println("3 - Bermuda");
        System.out.println("4 - Saia");
        System.out.println("5 - Blusa");
        System.out.println("6 - Moletom");
        System.out.println("7 - Meia");
        System.out.println("8 - Tênis");
        System.out.println("9 - Bota");
        System.out.println("0 - Finalizar");

        System.out.print("Escolha uma opção: ");
        int item = scanner.nextInt();
        scanner.nextLine();
        return item;
    }

    // Menu para apresentação de relatório de vendas
    public static void historicoVendas() {
        System.out.format("Calças vendidas: %.0f. Por unidade o preço é R$%.2f. O total de vendas foi de R$%.2f\n",
                calcaVendida, precoCalca, (calcaVendida * precoCalca));
        System.out.format("Camisas vendidas: %.0f. Por unidade o preço é R$%.2f. O total de vendas foi de R$%.2f\n",
                camisaVendida, precoCamisa, (camisaVendida * precoCamisa));
        System.out.format("Bermudas vendidas: %.0f. Por unidade o preço é R$%.2f. O total de vendas foi de R$%.2f\n",
                bermudaVendida, precoBermuda, (bermudaVendida * precoBermuda));
        System.out.format("Saias vendidas: %.0f. Por unidade o preço é R$%.2f. O total de vendas foi de R$%.2f\n",
                saiaVendida, precoSaia, (saiaVendida * precoSaia));
        System.out.format("Blusas vendidas: %.0f. Por unidade o preço é R$%.2f. O total de vendas foi de R$%.2f\n",
                blusaVendida, precoBlusa, (blusaVendida * precoBlusa));
        System.out.format("Moletons vendidos: %.0f. Por unidade o preço é R$%.2f. O total de vendas foi de R$%.2f\n",
                moletomVendido, precoMoletom, (moletomVendido * precoMoletom));
        System.out.format("Meias vendidas: %.0f. Por unidade o preço é R$%.2f. O total de vendas foi de R$%.2f\n",
                meiaVendida, precoMeia, (meiaVendida * precoMeia));
        System.out.format("Tênis vendidos: %.0f. Por unidade o preço é R$%.2f. O total de vendas foi de R$%.2f\n",
                tenisVendido, precoTenis, (tenisVendido * precoTenis));
        System.out.format("Botas vendidas: %.0f. Por unidade o preço é R$%.2f. O total de vendas foi de R$%.2f\n",
                botaVendida, precoBota, (botaVendida * precoBota));
    }

    // Função para mostrar nomes dos integrantes
    public static void MostrarNomes() {
        System.out.println("Aryel Andrada Bergmann");
        System.out.println("Lucas Furquim Jardim");
        System.out.println("Magno Augusto Castro Braccini");
        System.out.println("Natan Victor Da Rosa De Oliveira");
    }

    // Mostrando o estoque atual
    public static void mostrarEstoqueCompleto() {
        System.out.format("1| Calça: %d, R$%.2f cada. Montante em estoque R$%.2f.\n", estoqueCalca, precoCalca,
                (precoCalca * estoqueCalca));
        System.out.format("\n2| Camisa: %d, R$%.2f cada. Montante em estoque R$%.2f.\n", estoqueCamisa, precoCamisa,
                (precoCamisa * estoqueCamisa));
        System.out.format("\n3| Bermuda: %d, R$%.2f cada. Montante em estoque R$%.2f.\n", estoqueBermuda, precoBermuda,
                (precoBermuda * estoqueBermuda));
        System.out.format("\n4| Saia: %d, R$%.2f cada. Montante em estoque R$%.2f.\n", estoqueSaia, precoSaia,
                (precoSaia * estoqueSaia));
        System.out.format("\n5| Blusa: %d, R$%.2f cada. Montante em estoque R$%.2f.\n", estoqueBlusa, precoBlusa,
                (precoBlusa * estoqueBlusa));
        System.out.format("\n6| Moletom: %d, R$%.2f cada. Montante em estoque R$%.2f.\n", estoqueMoletom, precoMoletom,
                (precoMoletom * estoqueMoletom));
        System.out.format("\n7| Meia: %d, R$%.2f cada. Montante em estoque R$%.2f.\n", estoqueMeia, precoMeia,
                (precoMeia * estoqueMeia));
        System.out.format("\n8| Tenis: %d, R$%.2f cada. Montante em estoque R$%.2f.\n", estoqueTenis, precoTenis,
                (precoTenis * estoqueTenis));
        System.out.format("\n9| Bota: %d, R$%.2f cada. Montante em estoque R$%.2f.\n", estoqueBota, precoBota,
                (precoBota * estoqueBota));
    }

    // Função que mostra o menu para reposição de estoque
    public static int reposicaoEstoque(Scanner scanner) {
        System.out.println("..:: ESTOQUE ::..");
        System.out.format("1| Calça: %d unidades restantes\n", estoqueCalca);
        System.out.format("2| Camisa: %d unidades restantes\n", estoqueCamisa);
        System.out.format("3| Bermuda: %d unidades restantes\n", estoqueBermuda);
        System.out.format("4| Saia: %d unidades restantes\n", estoqueSaia);
        System.out.format("5| Blusa: %d unidades restantes\n", estoqueBlusa);
        System.out.format("6| Moletom: %d unidades restantes\n", estoqueMoletom);
        System.out.format("7| Meia: %d unidades restantes\n", estoqueMeia);
        System.out.format("8| Tênis: %d unidades restantes\n", estoqueTenis);
        System.out.format("9| Bota: %d unidades restantes\n", estoqueBota);

        System.out.print("Escolha o produto que quer repor:");
        int item = scanner.nextInt();
        return item; // devolve o item escolhido
    }

    // Adicionando mais produtos ao estoque
    public static void AddEstoque(int codigo, int quantidade) {
        switch (codigo) {
            case 1:
                estoqueCalca += quantidade;
                break;
            case 2:
                estoqueCamisa += quantidade;
                break;
            case 3:
                estoqueBermuda += quantidade;
                break;
            case 4:
                estoqueSaia += quantidade;
                break;
            case 5:
                estoqueBlusa += quantidade;
                break;
            case 6:
                estoqueMoletom += quantidade;
                break;
            case 7:
                estoqueMeia += quantidade;
                break;
            case 8:
                estoqueTenis += quantidade;
                break;
            case 9:
                estoqueBota += quantidade;
                break;
            default:
                System.out.println("Código inválido");
                break;
        }
    }

    // Função que processa a venda
    public static int processarVenda(Scanner scanner, String nomeProduto, double precoProduto, int estoqueAtual) {
        System.out.printf("Você selecionou %s! Que legal!\n", nomeProduto);
        System.out.printf("O valor unitário é de R$%.2f\n", precoProduto);
        System.out.print("Informe a quantidade desejada: ");
        int quantidade = scanner.nextInt();

        if (estoqueAtual >= quantidade) {
            double valorVenda = quantidade * precoProduto;
            System.out.format("Sua compra ficou no total de R$%.2f\n", valorVenda);
            System.out.print("Você confirma a compra? (S/N): ");
            char prosseguir = scanner.next().charAt(0);

            if (prosseguir == 's' || prosseguir == 'S') {
                estoqueAtual -= quantidade;
                valorTotalItensVendidos += valorVenda;
                listaAtual += nomeProduto + " - Quantidade: " + quantidade + "\n";
                System.out.println("Compra confirmada!");
                quantidadeVendida = quantidade;
            } else if (prosseguir == 'n' || prosseguir == 'N') {
                System.out.println("Operação cancelada!");
            } else {
                System.out.println("Opção inválida!");
            }
        } else {
            System.out.format("Não temos estoque suficiente. Restam apenas %d unidades de %s.\n", estoqueAtual, nomeProduto);
            scanner.nextLine();
            System.out.print("Pressione ENTER para voltar ao menu anterior");
            scanner.nextLine();
        }

        return estoqueAtual; // devolve o novo valor do estoque
    }

    // Função que registra a venda
    public static double registrarVenda(Scanner scanner) {
        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("\nSelecione o item que deseja comprar\n");

        int codigoDoProduto = -1;
        while (codigoDoProduto != 0) {
            codigoDoProduto = menu(scanner);

            switch (codigoDoProduto) {
                case 1:
                    estoqueCalca = processarVenda(scanner, "Calça", precoCalca, estoqueCalca);
                    calcaVendida += quantidadeVendida;
                    break;
                case 2:
                    estoqueCamisa = processarVenda(scanner, "Camisa", precoCamisa, estoqueCamisa);
                    camisaVendida += quantidadeVendida;
                    break;
                case 3:
                    estoqueBermuda = processarVenda(scanner, "Bermuda", precoBermuda, estoqueBermuda);
                    bermudaVendida += quantidadeVendida;
                    break;
                case 4:
                    estoqueSaia = processarVenda(scanner, "Saia", precoSaia, estoqueSaia);
                    saiaVendida += quantidadeVendida;
                    break;
                case 5:
                    estoqueBlusa = processarVenda(scanner, "Blusa", precoBlusa, estoqueBlusa);
                    blusaVendida += quantidadeVendida;
                    break;
                case 6:
                    estoqueMoletom = processarVenda(scanner, "Moletom", precoMoletom, estoqueMoletom);
                    moletomVendido += quantidadeVendida;
                    break;
                case 7:
                    estoqueMeia = processarVenda(scanner, "Meia", precoMeia, estoqueMeia);
                    meiaVendida += quantidadeVendida;
                    break;
                case 8:
                    estoqueTenis = processarVenda(scanner, "Tênis", precoTenis, estoqueTenis);
                    tenisVendido += quantidadeVendida;
                    break;
                case 9:
                    estoqueBota = processarVenda(scanner, "Bota", precoBota, estoqueBota);
                    botaVendida += quantidadeVendida;
                    break;
                case 0:
                    System.out.format("%s, o valor total da sua compra é R$%.2f\n",
                            nomeCliente, valorTotalItensVendidos);
                    if (valorTotalItensVendidos > maiorPreco) {
                        maiorPreco = valorTotalItensVendidos;
                        maiorNome = nomeCliente;
                        listaItens = listaAtual;
                    }
                    listaAtual = "";
                    valorTotalItensVendidos = 0;
                    System.out.print("Pressione ENTER para voltar ao Menu Principal");
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("\nOpção desconhecida!\n");
            }
        }

        return valorTotalItensVendidos;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 7) {
            // Limpa a tela
            System.out.print("\033\143");
            // Menu com as opções de escolha
            System.out.println("\n..:: MERCADINHO BETA 0.2.4.7 ::..\n");
            System.out.println("1 - Registrar Venda");
            System.out.println("2 - Repor Estoque");
            System.out.println("3 - Mostrar Estoque");
            System.out.println("4 - Histórico de Vendas");
            System.out.println("5 - Maior Venda");
            System.out.println("6 - Integrantes");
            System.out.println("7 - Sair\n");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            // Switch usado para selecionar as opções do menu
            switch (opcao) {
                case 1:
                    System.out.println("\n**REGISTRAR VENDA**\n");
                    registrarVenda(scanner);
                    break;
                case 2:
                    System.out.println("\n**REPOR ESTOQUE**\n");
                    int item = reposicaoEstoque(scanner);
                    System.out.print("Digite a quantidade de reposições:");
                    int reposicao = scanner.nextInt();
                    scanner.nextLine();
                    AddEstoque(item, reposicao);
                    System.out.println("\n**REPOSIÇÃO EFETUADA COM SUCESSO**");
                    System.out.print("\nPressione ENTER para voltar ao Menu Principal");
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("\n**MOSTRAR ESTOQUE**\n");
                    mostrarEstoqueCompleto();
                    System.out.print("\nPressione ENTER para voltar ao Menu Principal");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("\n**HISTÓRICO DE VENDAS**\n");
                    historicoVendas();
                    System.out.print("\nPressione ENTER para voltar ao Menu Principal");
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("\n**MAIOR VENDA**\n");
                    maiorVenda(scanner);
                    System.out.print("\nPressione ENTER para voltar ao Menu Principal");
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("\n**INTEGRANTES**\n");
                    MostrarNomes();
                    System.out.print("\nPressione ENTER para voltar ao Menu Principal");
                    scanner.nextLine();
                    break;
            }
        }
        System.out.print("O mercadinho agradece a sua preferência!");
    }
}