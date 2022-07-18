package exercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean rodar = true;
        Scanner scan = new Scanner(System.in);
        Candidatos candidatoInicial = new Candidatos(null, 0);

        while (rodar == true){
            System.out.println("|----------------Bem Vindo-------------------|");
            System.out.println("|                Candidatos                  |");
            System.out.println("| DIGITE 1 - para adicionar um candidato     |");
            System.out.println("| DIGITE 2 - para ver sua lista de candidatos|");
            System.out.println("| DIGITE 3 - para excluir um candidato       |");
            System.out.println("| DIGITE 4 - para sair                       |");
            System.out.println("|____________________________________________|");
            int escolhaMenu = scan.nextInt();

            switch (escolhaMenu){
                case 1:
                    candidatoInicial.adicionarCandidato();
                    break;
                case 2:
                    candidatoInicial.exibirCandidatos();
                    break;
                case 3:
                    candidatoInicial.excluirProduto();
                    break;
                case 4:
                    rodar = false;
                    break;
                default:
                    System.out.println("Escolha invalida");
                    break;
            }
    }
        }}
