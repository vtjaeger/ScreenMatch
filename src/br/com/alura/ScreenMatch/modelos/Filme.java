import org.w3c.dom.ls.LSOutput;

public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDasAvaliacoes;
    int duracaoMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoLancamento);
    }
    int getTotalDasAvaliacoes(){
        return totalDasAvaliacoes;
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDasAvaliacoes++;
    }
    double retornaMedia(){
        if(totalDasAvaliacoes == 0){
            return 0;
        }
        return (somaDasAvaliacoes / totalDasAvaliacoes);
    }
}
