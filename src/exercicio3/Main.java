package exercicio3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean rodar = true;
        Scanner scan = new Scanner(System.in);
        Cardapio pratoInicial = new Cardapio(null);
        ArrayList<Cardapio> pratos = new ArrayList<>();

        while (rodar == true){
            System.out.println("|----------------Bem Vindo------------------|");
            System.out.println("|                 CARDAPIO:                 |");
            System.out.println("| DIGITE 1 - para adicionar um prato        |");
            System.out.println("| DIGITE 2 - para ver sua lista de pratos   |");
            System.out.println("| DIGITE 3 - para excluir um prato          |");
            System.out.println("| DIGITE 4 - para sair                      |");
            System.out.println("|___________________________________________|");

            int escolhaMenu = scan.nextInt();
            switch (escolhaMenu){
                case 1:
                    System.out.println("Qual o nome do prato a ser adicionado? ");
                    Cardapio novoPrato = new Cardapio(scan.next());
                    pratos.add(novoPrato);
                    novoPrato.adicionarNIngredientes();

                    break;
                case 2:
                    for (int i = 0; i < pratos.size(); i++){
                        System.out.println(pratos.get(i).nomedoPrato);
                        pratos.get(i).verIngredientes();
                        System.out.println("_____________________");
                    }
                    break;
                case 3:
                    System.out.println("Qual prato deseja excluir? ");
                    for (int i = 0; i < pratos.size(); i++){
                        System.out.println(pratos.get(i).nomedoPrato);
                        pratos.get(i).verIngredientes();
                        System.out.println("______________________");
                    }
                    String pratoExcluido = scan.next();
                    for (int i = 0; i < pratos.size(); i++) {
                        if (pratos.get(i).getNomedoPrato().equals(pratoExcluido)) {
                            pratos.get(i).ingredientes.clear();
                            pratos.remove(i);

                        }}

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
