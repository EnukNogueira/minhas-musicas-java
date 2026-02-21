package br.com.enuk.minhasmusicas.modelos;

public class Podcast extends Audio implements Classificavel{
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getClassificacao(){
        if(this.getTotalReproducoes() > 2000){
            return 10;
        } else {
            return 8;
        }
    }
}
