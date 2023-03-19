/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastraradvogados;

/**
 *
 * @author Administrator
 */
public class CadastrarAdvogados {

    public static void main(String[] args) {
        Advogado adv1 = new Advogado("Carlos",38);
        Advogado adv2 = new Advogado("Leonardo", 29);
        Advogado adv3 = new Advogado("Maria", 51);
        Advogado adv4 = new Advogado("Nilton", 32);
        Advogado adv5 = new Advogado("Jorge", 60);
        Advogado adv6 = new Advogado("Alife", 41);
        Advogado adv7 = new Advogado("Joana", 37);
        Advogado adv8 = new Advogado("Marcos", 19);
        
        adv1.setSobrenome("leando");
        adv1.setSexo('M');
        adv1.setSetor("A1");
        adv1.setSalario(2356.6);
        adv1.setNumTelefone(998355641);
        
        adv2.setSobrenome("Micael");
        adv2.setSexo('M');
        adv2.setSetor("A1");
        adv2.setSalario(4562.3);
        adv2.setNumTelefone(998355641);
        
        adv3.setSobrenome("Carlson");
        adv3.setSexo('F');
        adv3.setSetor("A3");
        adv3.setSalario(5553.3);
        adv3.setNumTelefone(268947526);
        
        adv4.setSobrenome("Lindia");
        adv4.setSexo('M');
        adv4.setSetor("A1");
        adv4.setSalario(12133.2);
        adv4.setNumTelefone(996594123);
        
        adv5.setSobrenome("Menes");
        adv5.setSexo('M');
        adv5.setSetor("A2");
        adv5.setSalario(2100.1);
        adv5.setNumTelefone(993678125);
        
        adv6.setSobrenome("Santiago");
        adv6.setSexo('M');
        adv6.setSetor("A4");
        adv6.setSalario(3258.3);
        adv6.setNumTelefone(998752369);
        
        
        adv7.setSobrenome("Munique");
        adv7.setSexo('F');
        adv7.setSetor("A2");
        adv7.setSalario(69841.1);
        adv7.setNumTelefone(994851478);

        
        adv8.setSobrenome("Marcos");
        adv8.setSexo('M');
        adv8.setSetor("A3");
        adv8.setSalario(1900.5);
        adv8.setNumTelefone(996321478);
        
        
        
        adv6.MostrarRelatorio();
        adv7.MostrarRelatorio();
        adv8.MostrarRelatorio();
        
        
    }
}
