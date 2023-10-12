import br.com.alura.ScreenMatch.calculos.CalculadoraDeTempo;
import br.com.alura.ScreenMatch.calculos.FiltroRecomendacao;
import br.com.alura.ScreenMatch.modelos.Episiodio;
import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Serie;

import java.security.spec.ECParameterSpec;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Panico 6", 2023);
        filme1.setDuracaoMinutos(180);
        filme1.setIncluidoNoPlano(true);
//        filme1.exibeFichaTecnica();
        //

        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
//        System.out.println("Total de avalicoes: " + filme1.getTotalDasAvaliacoes());
//        System.out.println(filme1.retornaMedia());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
//        System.out.println(calculadora.getTempoTotal());
//

        Filme filme2 = new Filme("Avatar", 2022);
        filme2.setDuracaoMinutos(200);
        filme2.setIncluidoNoPlano(true);
//        filme2.exibeFichaTecnica();
//        calculadora.inclui(filme2);
//        System.out.println("Duracao total: " + calculadora.getTempoTotal());

        Serie lost = new Serie("Lost", 2000);
        lost.setAnoLancamento(2000);
//        lost.exibeFichaTecnica();
        //
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
//        lost.getDuracaoMinutos();
        //

        calculadora.inclui(lost);
//        System.out.println("Duracao total: " + calculadora.getTempoTotal());
//
        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(filme1);
//
        Episiodio episiodio = new Episiodio();
        episiodio.setNumero(1);
        episiodio.setSerie(lost);
        episiodio.setTotalVisualizacoes(300);
        // filtro.filtra(episiodio);
//

        // curso array

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeDoPaulo);
        listaDeFilme.add(filme1);
        listaDeFilme.add(filme2);
        System.out.println(listaDeFilme);
        System.out.println("To String: " + listaDeFilme.get(0).toString());


    }
}
