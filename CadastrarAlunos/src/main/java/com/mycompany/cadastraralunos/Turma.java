/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastraralunos;

/**
 *
 * @author Administrator
 */
public class Turma {
    
public int numSala;
public int horario;
public int vagas;
public String sala;
        
        
    Aluno alunoNovo1;
    Aluno alunoNovo2;
    Aluno alunoNovo3;
    
    
    Turma(Aluno Aluno) {
        alunoNovo1 = Aluno;
        alunoNovo2 = Aluno;
        alunoNovo3 = Aluno;
    }
    

    public Aluno getAlunoNovo1() {
        System.out.println("O nome do primeiro aluno é" + alunoNovo1);
           return alunoNovo1;
    }

    public Aluno getAlunoNovo2() {
       System.out.println("O nome do segundo aluno é" + alunoNovo2);
       return alunoNovo2;
    }
    
     public Aluno getAlunoNovo3() {
       System.out.println("O nome do terciro aluno é" + alunoNovo3);
       return alunoNovo3;
    }
    

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
    
   

   
    
    
}
