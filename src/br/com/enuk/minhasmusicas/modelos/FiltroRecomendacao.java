package br.com.enuk.minhasmusicas.modelos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >=9){
            System.out.println("Está entre os favoritos do momento");
        } else if (classificavel.getClassificacao() >=7){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Colocar na lista para ouvir depois");
        }
    }
}
