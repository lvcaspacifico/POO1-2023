package ListaColecoes_Exercicio01;

import java.text.NumberFormat;
import java.util.Locale;
/**
*<h2>Conversor: Alinha o valor double do atributo "pontos" à Direita</h2>
 * <ul>
 *     <li><b>NumberFormat:</b> localiza o número</li>
 *     <li><b>String numeroformatado:</b> transforma o número em String</li>
 *     <li><b>String nume:</b> troca os pontos por virgulas</li>
 *     <li><b>return:</b> retorna o valor bonitinho alinhado a direita</li>
 * </ul>
 */
public class Conversor {
    public String converter(Double oTalDuhGetzin){

        NumberFormat formatoComVirgula = NumberFormat.getNumberInstance(Locale.getDefault());
        String numeroFormatado = formatoComVirgula.format(oTalDuhGetzin);
        String nume = numeroFormatado.replace(".", ",");
        return String.format("%34s", nume);
    }
}
