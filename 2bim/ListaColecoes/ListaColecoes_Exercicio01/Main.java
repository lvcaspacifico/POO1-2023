package ListaColecoes_Exercicio01;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conversor conv = new Conversor();
        // Criação de jogadores
        ArrayList<Jogador> listaJogadores = new ArrayList<>();
        int j = 1;
        for(int total = 0; total < 10; total++){
            System.out.println("Digite o nome do Jogador Nº" + (j) + ":");
            String nome = scan.nextLine();
            System.out.println("Digite os pontos do Jogador Nº" + (j) + ":");
            Double pontos = scan.nextDouble();
            scan.nextLine();
            j += 1;
            Jogador jogador = new Jogador(nome, pontos);
            listaJogadores.add(jogador);
        }
        // Ordenando a lista de jogadores com base nos pontos
        Collections.sort(listaJogadores);

        // Exibindo a lista ordenada
        System.out.println("---------- GAME  OVER ----------");
        System.out.println("---------- High Score ----------");
        for (Jogador jogador : listaJogadores) {
            System.out.print(jogador.nome);
            System.out.println(conv.converter(jogador.pontos));
        }
    }
}