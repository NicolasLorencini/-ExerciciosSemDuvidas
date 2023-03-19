/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrarpaciente;

/**
 *
 * @author Nicolas Esse exercicio e recebi bastante ajuda do Matheus, ele me mostrou o dele e foi me guiando pra fazer o meu
 */
public class CadastrarPaciente {

    public static void main(String[] args) {
      
        CadastrarSintoma sin1 = new CadastrarSintoma(true,42.6,"17/9","Gonorréia");
        CadastrarSintoma sin2 = new CadastrarSintoma(false,33.9,"18/9","Hepatite C");
        CadastrarSintoma sin3 = new CadastrarSintoma(false,24.9,"18/9","Tuberculose");
        
        
        Paciente pac = new Paciente();
        pac.setPaciente("Carlos", 25, "Masculino", "Jes");
        pac.setSintoma(sin1);
        
        
        Paciente pac2 = new Paciente();
        pac2.setPaciente("Sérgio", 18, "Masculino", "Soares");
        pac2.setSintoma(sin2);
        
        
        Paciente pac3 = new Paciente();
        pac3.setPaciente("Luana", 25, "Feminino", "Valderir");
        pac3.setSintoma(sin3);
        
        
        Paciente pac4 = new Paciente();
        pac4.setPaciente("Katrina", 25, "Feminino", "Joanas");
        pac4.setSintoma(sin1);
        
        
        Paciente pac5 = new Paciente();
        pac5.setPaciente("Jonas", 25, "Masculino", "Mephis");
        pac5.setSintoma(sin2);
        
        
        Paciente pac6 = new Paciente();
        pac6.setPaciente("Mendiger", 25, "Masculino", "Liona");
        pac6.setSintoma(sin3);
    }
    }

