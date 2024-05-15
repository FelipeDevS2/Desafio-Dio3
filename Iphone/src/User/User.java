package User;

import Iphone.Iphone;


//Classe que simula as ações do usuário

public class User {

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();

        iphone1.exibirPagina();
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();

        iphone1.reproduzirMusica();
        iphone1.selecionarMusica();
        iphone1.pausarMusica();

        iphone1.ligar();
        iphone1.iniciarCorreioDeVoz();
        iphone1.atender();




    }
}
