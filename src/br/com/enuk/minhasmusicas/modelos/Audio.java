package br.com.enuk.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;


    public String getTitulo() {
        return titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTotalcurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;


    }

    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduz(){
        this.totalReproducoes++;
    }

}
