package exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {
    private String nome;
    private float preco;
    Scanner scan = new Scanner(System.in);
    ArrayList <Produtos> listaDeProdutos = new ArrayList<>();

    public Produtos(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void adicionarProdutos(){
       System.out.println("Qual produto deseja adicionar? ");
       String novoNome = scan.next();
       System.out.println("Qual o preço deste produto? ");
       float novoPreco = scan.nextFloat();
       System.out.println("O novo produto " +novoNome +" custa " +novoPreco);
       Produtos novoProduto = new Produtos(novoNome, novoPreco);
       listaDeProdutos.add(novoProduto);
    }

     public void exibirProdutos(){
        for (int i = 0; i < listaDeProdutos.size(); i++){
            System.out.println(listaDeProdutos.get(i).getNome() + " custa " +listaDeProdutos.get(i).getPreco());
        }
     }

     public void excluirProduto(){
         System.out.println("Qual produto deseja excluir? ");
         exibirProdutos();

         String excluirProdutox = scan.next();
         for (int i = 0; i < listaDeProdutos.size(); i++){
            if (listaDeProdutos.get(i).getNome().equals(excluirProdutox)){
                listaDeProdutos.remove(i);
            }
         }
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public ArrayList<Produtos> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(ArrayList<Produtos> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }
}
