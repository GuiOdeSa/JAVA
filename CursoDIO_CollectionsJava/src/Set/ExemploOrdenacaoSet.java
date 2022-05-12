package Set;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        Set<Series> minhasSeries = new HashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that 70s show", "comedia", 25));
        }};
        for (Series series: minhasSeries) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());

        System.out.println("--\tOrdem inserção\t--");
        Set<Series> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that 70s show", "comedia", 25));
        }};
        for (Series series: minhasSeries1) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());

        System.out.println("--\tOrdem natural (tempo de episódio)\t--");
        Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Series series: minhasSeries2) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());

        System.out.println("--\tOrdem Nome/Gênero/Tempo de Episódio\t--");
        Set<Series> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Series series: minhasSeries3) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());

        System.out.println("--\tOrdem Gênero\t--");
        Set<Series> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Series series: minhasSeries4) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());

        System.out.println("--\tOrdem Tempo de Episódio\t--");
        Set<Series> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries);
        for (Series series: minhasSeries5) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());

    }
}

class Series implements Comparable <Series>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series serie = (Series) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Series series) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), series.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(series.getGenero());

    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Series>{

    @Override
    public int compare(Series s1, Series s2) {
        int nome = s1.getNome().compareTo(s2.getNome());;
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());;
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Series>{

    @Override
    public int compare(Series s1, Series s2) {
        int genero = s1.getGenero().compareTo(s2.getGenero());;
        if (genero != 0) return genero;

        int nome = s1.getNome().compareTo(s2.getNome());;
        if (nome != 0) return nome;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}

class ComparatorTempoEpisodio implements Comparator<Series>{

    @Override
    public int compare(Series s1, Series s2) {
        int tempoEpisodio = s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());;
        if (tempoEpisodio != 0) return tempoEpisodio;

        int nome = s1.getNome().compareTo(s2.getNome());;
        if (nome != 0) return nome;

        return s1.getGenero().compareTo(s2.getGenero());
    }
}