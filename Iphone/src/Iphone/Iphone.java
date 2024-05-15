package Iphone;


import Devices.ReprodutorMusical;
import Devices.Telefone;
import Devices.Navegador;

public class Iphone implements ReprodutorMusical, Navegador, Telefone {
    @Override
    public void reproduzirMusica(){
        System.out.println("Reproduzindo musica");
    }

    @Override
    public void pausarMusica(){
        System.out.println("Pausando musica");
    };

    @Override
    public void selecionarMusica(){
        System.out.println("Selecionando musica");
    };

    @Override
    public void ligar() {
        System.out.println("Lingando...");
    }

    @Override
    public void atender() {
        System.out.println("chamada atendida");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado.");

    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina da web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("pagina atualizada!");
    }
}
