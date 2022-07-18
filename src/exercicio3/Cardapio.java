package exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Cardapio {

    String nomedoPrato;
    ArrayList<String> ingredientes = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    public Cardapio(String nomedoPrato) {
        this.nomedoPrato = nomedoPrato;
        this.ingredientes = ingredientes;
    }

    void adicionarNIngredientes(){

        boolean adicionando = true;
        while (adicionando == true){
            System.out.println("Tem um novo ingrediente? Digite 1 para sim, 2 para não ");
            int maisIngrediente = scan.nextInt();
            if (maisIngrediente == 1){
                System.out.println("Qual o ingrediente do prato? ");
                String noveIngrediente = scan.next();
                ingredientes.add(noveIngrediente);
            } else if (maisIngrediente == 2){
                adicionando = false;
            }else {
                System.out.println("escolha nao aceita");
            }}

    }
    void verIngredientes(){
        for (int i = 0; i < ingredientes.size(); i++){
            System.out.println(ingredientes.get(i));
        }
    }

    void excluirIngredientes(){
        ingredientes.clear();
    }

    public String getNomedoPrato() {
        return nomedoPrato;
    }

    public void setNomedoPrato(String nomedoPrato) {
        this.nomedoPrato = nomedoPrato;
    }
}
