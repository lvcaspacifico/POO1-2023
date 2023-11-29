package JogoAdivinharPalavras;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class AdivinharPalavras {
    public List<String> palavrasComLetraAleatoria = new ArrayList<String>();
    public List<String> palavrasDigitadas = new ArrayList<String>() ;
    public String caminhoArquivo = "C:\\Users\\lvcas\\palavras.txt"; // Adicionar aqui o caminho do arquivo palavras.txt

    public String letra;


    private static List<String> lerPalavrasDoArquivo(String caminhoArquivo) throws IOException {
        Path path = Paths.get(caminhoArquivo);
        List<String> linhas = Files.readAllLines(path, StandardCharsets.UTF_8);
        return linhas;
    }

    public void gerarListaDePalavras(String gerado){
        try {
            List<String> palavras = lerPalavrasDoArquivo(caminhoArquivo);
            for (String palavra : palavras){
                if(palavra.startsWith(gerado)){
                    palavrasComLetraAleatoria.add(palavra);
                }else{}
            }
            System.out.println("===========GUESS THE WORD!============");
            System.out.println("Letra Aleatória & Lista de Palavras Gerada!");
            System.out.println("Para ganhar digite palavras com a letra: " + letra);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void gerarLetra() {
        Random random = new Random();
        char letraAleatoria = (char) (random.nextInt(26) + 'a');
        String letra = String.valueOf(letraAleatoria);
        this.letra = letra;
    }
}

