/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedidomesabar;

/**
 *
 * @author Administrator
 */
public class CadastrarPedido {
    public int valor;
    public String nome;
    public int quantidade;
    public int numMesa;
    public String gorgeta;

    public CadastrarPedido(int avalor, String anome, int aquantidade, int anumMesa, String agorgeta) {
        this.valor = avalor;
        this.nome = anome;
        this.quantidade = aquantidade;
        this.numMesa = anumMesa;
        this.gorgeta = agorgeta;
    }
    
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public String getGorgeta() {
        return gorgeta;
    }

    public void setGorgeta(String gorgeta) {
        this.gorgeta = gorgeta;
    }
    
    
}
