package br.com.enuk.minhasmusicas.modelos;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Take on me");
        minhaMusica.setArtista("a-ha");

        //Simular reproduções e curtidas
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        //Configuração Podcast
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Inteligencia");
        meuPodcast.setApresentador("Ben 10");

        //Simulando curtidas no podcast
        for (int i = 0; i < 100; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 10; i++) {
            meuPodcast.curte();
        }
        System.out.println("total de reproduções da música: " + minhaMusica.getTotalReproducoes());
        System.out.println("total de reproduções do podcast: " + meuPodcast.getTotalReproducoes());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(minhaMusica);
        filtro.filtra(meuPodcast);
    }
}
