package exercicio2;
import java.util.ArrayList;
import java.util.Scanner;

public class Candidatos {
    String numeroDeMatricula;
    float nota;
    Scanner scan = new Scanner(System.in);
    ArrayList<Candidatos> listaDeCandidatos = new ArrayList<>();

    public Candidatos(String numeroDeMatricula, float nota) {
        this.numeroDeMatricula = numeroDeMatricula;
        this.nota = nota;
    }

    public void adicionarCandidato() {
        System.out.println("Qual o numero de matricula do candidato? ");
        String novaMatricula = scan.next();
        System.out.println("Qual a nota do candidato? ");
        float novaNota = scan.nextFloat();
        System.out.println("O novo Candidato " + novaMatricula + " teve nota  " + novaNota);
        Candidatos novoCandidato = new Candidatos(novaMatricula, novaNota);
        listaDeCandidatos.add(novoCandidato);
    }

    public void exibirCandidatos() {
        for (int i = 0; i < listaDeCandidatos.size(); i++) {
            System.out.println(listaDeCandidatos.get(i).getNumeroDeMatricula()+ " teve nota  " + listaDeCandidatos.get(i).getNota());
        }
    }

    public void excluirProduto() {
        System.out.println("Qual o numero de matricula do candidato que deseja excluir? ");
        exibirCandidatos();

        String excluirCandidatox = scan.next();
        for (int i = 0; i < listaDeCandidatos.size(); i++) {
            if (listaDeCandidatos.get(i).getNumeroDeMatricula().equals(excluirCandidatox)) {
                listaDeCandidatos.remove(i);
            }
        }}

    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
