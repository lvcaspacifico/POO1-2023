package JogoAdivinharPalavras;
import java.util.Scanner;

/**
* <h3>Trabalho Final de POO I</h3>
 * Desenvolva um jogo das Quantas palavras diferentes eu conheço.
 * O jogo deve sortear uma letra e o jogador deve digitar todas as palavras
 * que conhece que comece com aquela determinada letra.
 * Apenas são permitidas palavras válidas e diferentes com 4 ou mais letras.
 * Caso o jogador informe uma palavra repetida, deve ser informado.
 * Após um determinado tempo, o jogo finaliza e mostra a quantidade e as palavras que o usuário informou.
 * <ul>
 *     <li>Utilizar a linguagem Java.</li>
 *     <li>Utilizar as coleções de dados.</li>
 *     <li>Utilizar o paradigma de programação Orientado a objetos</li>
 *     <li>Apresentar o diagrama de classe da UML</li>
 *     <li>Validar se a palavra informada é válida</li>
 * </ul>
 *
 * Se a pessoa desistir ou chegar no máximo, o jogo deve encerrar;
 */


public class Main {
    public static void main(String[] args) {
        boolean rodar = true;
        int op = 0;
        String digitado = "";
        Scanner scan = new Scanner(System.in);
        int score = 0;

        while (rodar) {
            AdivinharPalavras partida = new AdivinharPalavras();
            partida.gerarLetra();
            partida.gerarListaDePalavras(partida.letra);
               while(op != 3){
                   System.out.println("============GUESS THE WORD!============");
                   System.out.println("Op 1......Adivinhar palavra");
                   System.out.println("Op 2......Ver Score");
                   System.out.println("Op 3......Encerrar");
                   System.out.println("Digite sua opção: ");
                   op = scan.nextInt();
                   scan.nextLine();
                        if(op == 1){
                            boolean aceito = false;
                            while(aceito == false){
                                String palavra = "";
                                System.out.println("Digite a palavra: ");
                                palavra = scan.nextLine().toLowerCase(); // tratando entradas sempre input vira tudo minúscula
                                System.out.println(palavra);
                                if (partida.palavrasComLetraAleatoria.contains(palavra) &&
                                        !partida.palavrasDigitadas.contains(palavra) &&
                                        palavra.length() >= 4
                                ){
                                    partida.palavrasDigitadas.add(palavra);
                                    aceito = true;
                                    score += 1;
                                    System.out.println("Palavra válida! +1 Ponto! Você retornará ao Menu Inicial.");
                                }else{
                                    System.out.println("Palavra inválida.");
                                }
                            }
                        }
                        if(op == 2){
                            System.out.println("Sua pontuação é: " + score);
                            System.out.println("Você retornará ao Menu Inicial.");
                        }
               }
        }
    }
}