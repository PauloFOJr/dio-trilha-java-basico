package com.dispositivos.base;

import com.funcionalidades.AparelhoTelefonico;
import com.funcionalidades.NavegadorInternet;
import com.funcionalidades.ReprodutorMusical;

public class Dispositivo implements
        ReprodutorMusical,
        AparelhoTelefonico,
        NavegadorInternet {
    private String marca;
    private String modelo;

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String ligar(String numero) {
        return "";
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Ouvindo correio de voz.");
    }

    @Override
    public String exibirPagina(String url) {
        return "";
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova página adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pause na música");
    }

    @Override
    public String selecionarMusica(String musica) {
        return "";
    }
}
