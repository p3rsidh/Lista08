package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean rodar = true;
        Scanner scan = new Scanner(System.in);
        Produtos produtoInicial = new Produtos(null, 0);

        while (rodar == true){
            System.out.println("|----------------Bem Vindo------------------|");
            System.out.println("| PARA ORGANIZAR SEU ESTOQUE:               |");
            System.out.println("| DIGITE 1 - para adicionar um produto      |");
            System.out.println("| DIGITE 2 - para ver sua lista de produtos |");
            System.out.println("| DIGITE 3 - para excluir um produto        |");
            System.out.println("| DIGITE 4 - para sair                      |");
            System.out.println("|___________________________________________|");

            int escolhaMenu = scan.nextInt();
            switch (escolhaMenu){
                case 1:
                    produtoInicial.adicionarProdutos();
                    break;
                case 2:
                    produtoInicial.exibirProdutos();
                    break;
                case 3:
                    produtoInicial.excluirProduto();
                    break;
                case 4:
                    rodar = false;
                    break;
                default:
                    System.out.println("Escolha invalida");
                    break;
            }
        }
    }
}
