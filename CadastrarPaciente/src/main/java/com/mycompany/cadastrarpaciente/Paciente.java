/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarpaciente;

/**
 *
 * @author Administrator
 */
public class Paciente {
    private String nome;
    private int idade;
    private String sexo;
    private String sobrenome; 
    public CadastrarSintoma sintoma;
    
    
    public void setPaciente(String aNome, int aIdade, String aSexo, String asobrenome){
        this.nome = aNome;
        this.idade = aIdade;
        this.sexo = aSexo;
        this.sobrenome = asobrenome;
    }
    
    public void setSintoma(CadastrarSintoma asintoma){
        this.sintoma = asintoma;
    }
}
