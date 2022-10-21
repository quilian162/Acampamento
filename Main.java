import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Acampamento vetor[] = new Acampamento[10];
        for(int i = 0; i < 3; i++){
            String nome = scan.next();
            int idade = scan.nextInt();
            vetor[i] = new Acampamento(nome, idade);
            vetor[i].definirEquipe();
        }
        for(int i = 0; i < 3; i++){
            System.out.println(vetor[i]);
        }
    }
}
    
