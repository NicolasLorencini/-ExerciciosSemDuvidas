/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarpaciente;

/**
 *
 * @author Administrator
 */
public class CadastrarSintoma {
   public boolean dorCabeca;
    public double temp;
    public String pressao;
    public  String nomeSin;
    public boolean cadastrado;
    
    public CadastrarSintoma(boolean aDorCabeca, double aTemperatura, String aPressao, String aNomeSin){
        this.dorCabeca = aDorCabeca;
        this.temp = aTemperatura;
        this.pressao = aPressao;
        this.nomeSin = aNomeSin;
        this.cadastrado = true;
    }
    
    public String getSintomas(){
        String retorno = "Com dor de cabeça: "+ dorCabeca+ "e com a temperatura: "+  temp + "O paciente tem: "+ nomeSin;
        return retorno;
    }
}
