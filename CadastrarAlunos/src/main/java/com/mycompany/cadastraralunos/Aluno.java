/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastraralunos;

/**
 *
 * @author Administrator
 */
public class Aluno {
    
    private String nome;
    private int cpf;
    private int idade;
    private int telefone;
    private String email;

    public Aluno(String anome, int acpf, int aidade, int atelefone, String aemail) {
        this.nome = anome;
        this.cpf = acpf;
        this.idade = aidade;
        this.telefone = atelefone;
        this.email = aemail;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    
    
    
}
