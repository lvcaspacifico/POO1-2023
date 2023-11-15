package ListaColecoes_Exercicio01;
/**
 *<h2>Jogador: Implementa Comparable e serve de "lista dentro da lista"</h2>
 * <p>Para poder ter um n&uacute;mero e um nome por input</p>
 * <ul>
 *     <li><b>@Override:</b> Daria erro de execu&ccedil;&atilde;o se n&atilde;o sobreposse</li>
 * </ul>
 */
class Jogador implements Comparable<Jogador> {
    public String nome;
    public double pontos;
    public Jogador(String nome, double pontos){
        this.nome = nome;
        this.pontos = pontos;
    }

    @Override
    public int compareTo(Jogador outroJogador) {
        // Ordenando em ordem decrescente (do maior para o menor)
        return Double.compare(outroJogador.pontos, this.pontos);
}


}