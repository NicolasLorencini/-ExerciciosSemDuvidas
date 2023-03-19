/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrarbicicletas;

/**
 *
 * @author Administrator
 */
public class CadastrarBicicletas {

    public static void main(String[] args) {
      
        Bicicleta bicicleta1 = new Bicicleta("Caloi", 500);
        Bicicleta bicicleta2 = new Bicicleta("Cannondale", 965);
        Bicicleta bicicleta3 = new Bicicleta("Cervélo", 369);
        Bicicleta bicicleta4 = new Bicicleta("SCOTT", 258);
        
        bicicleta1.setCarroceria("Boa");
        bicicleta1.setCor("Roxa");
        bicicleta1.setPneus("Estáveis");
        bicicleta1.setModelo("Dragon");
        bicicleta1.setCorrente("Farpadas");
        
        bicicleta2.setCarroceria("Ruim");
        bicicleta2.setCor("Vermelho");
        bicicleta2.setPneus("Furados");
        bicicleta2.setModelo("Lion");
        bicicleta2.setCorrente("Ok");
        
        bicicleta3.setCarroceria("Ótima");
        bicicleta3.setCor("Azul");
        bicicleta3.setPneus("Estáveis");
        bicicleta3.setModelo("Berserk");
        bicicleta3.setCorrente("Sujas");
        
        bicicleta4.setCarroceria("Quebrada");
        bicicleta4.setCor("Vermelho e Branco");
        bicicleta4.setPneus("1 furado");
        bicicleta4.setModelo("KingsBane");
        bicicleta4.setCorrente("Ótimo estado");
        
        bicicleta1.MostrarBikes();
        bicicleta2.MostrarBikes();
    }
}
