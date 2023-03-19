/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastraradvogados;

/**
 *
 * @author Administrator
 */
public class Advogado {
    public String nome;
    public int idade;
    private double salario;
    private String sobrenome;
    private char sexo;
    private int numTelefone;
    private String setorAdvogado;
  
    
    public Advogado(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setSetor(String setorAdvogado){
        this.setorAdvogado = setorAdvogado;
    }
    
    public String getSetor(){
        return setorAdvogado;
    }
    
    public void setSalario(double salarioAdvogado){
        this.salario = salarioAdvogado;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSexo(char sexoAdvogado){
        this.sexo = sexoAdvogado;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public void setSobrenome(String sobrenomeAdvogado){
        this.sobrenome = sobrenomeAdvogado;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }
    
    
  
    
    public void MostrarRelatorio(){
        System.out.println("\nNome do advogado: "+ nome);
        System.out.println("Idade do advogado: "+ idade );
        System.out.println("Sobrenome do advogado: "+getSobrenome());
        System.out.println("Gênero do advogado: "+getSexo());
        System.out.println("Setor do advogado: "+getSetor());
        System.out.println("Salário do advogado: R$"+getSalario());
         System.out.println("telefone do advogado"+getNumTelefone());
        
        
    }
    
}

