/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatofutebol;

/**
 *
 * @author Administrator
 */
public class Jogador {
    
    private String nome;
    private int idade;
    private String posicao;
    private int tamanho;
    private String time;
    private boolean cadastro = false;

    public Jogador(String anome, int aidade, String aposicao,int atamanho, String atime) {
        this.nome = anome;
        this.idade = aidade;
        this.posicao = aposicao;
        this.tamanho = atamanho;
        this.time = atime;
    }

   

    public void getNomeIdade() {
        System.out.println(" Idade: "+idade + " Anos");
    }

    public void getPosicao() {
        System.out.println("o jogador joga de "+posicao);
    }
    
    public void getTime() {
        System.out.println("O Jogador: " + nome + " Joga no time: " + time);
    }
    
    public boolean isCadastrado(){
        return this.cadastro;
    }
}

   
       
       
    

   
   

    

    

