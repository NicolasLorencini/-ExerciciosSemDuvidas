/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatofutebol;

/**
 *
 * @author Administrator
 */
public class Time {
    private String nome;
    private String pais;
    private String estadio;
    private int jogosSemPerder;
    private Jogador jogador;

    public Time(String anome, String apais, String aestadio, int ajogosSemPerder, Jogador ajogador) {
        this.nome = anome;
        this.pais = apais;
        this.estadio = aestadio;
        this.jogosSemPerder = ajogosSemPerder;
        this.jogador = ajogador;
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public int relatorio(){
        return this.jogosSemPerder;
    }

    public void setJogosSemPerder(int jogosSemPerder) {
        this.jogosSemPerder = jogosSemPerder;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    
    

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
    
}
