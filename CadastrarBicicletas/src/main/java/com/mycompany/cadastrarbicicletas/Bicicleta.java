/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author Administrator
 */
public class Bicicleta {
    
    public String marca;
    public int preco;
    public String pneus; 
    private String corrente;
    private String carroceria;      
    private String cor;
    private String modelo;

    public Bicicleta(String marca, int preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getPneus() {
        return pneus;
    }

    public void setPneus(String pneus) {
        this.pneus = pneus;
    }

    public String getCorrente() {
        return corrente;
    }

    public void setCorrente(String corrente) {
        this.corrente = corrente;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
     public void MostrarBikes(){
        System.out.println("\nNome da marca: "+ marca+ "      Preço: "+preco);
        System.out.println("Qual tipo de pneu: "+getPneus()+ "     Corrente: "+ getCorrente());
        System.out.println("Carroceria "+getCarroceria()+ "                Cor: "+ getCor());
        System.out.println("Modelo: "+getModelo());
        
        
    }
}
