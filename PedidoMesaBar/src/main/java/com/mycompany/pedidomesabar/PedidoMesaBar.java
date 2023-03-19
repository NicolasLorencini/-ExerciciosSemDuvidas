/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedidomesabar;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class PedidoMesaBar {

    public static void main(String[] args) {
        Scanner ler;
         ler = new Scanner(System.in);
         
         CadastrarPedido [] CadastrarPedido1 = new CadastrarPedido[5];
       
       
        for(int i = 0; i < 5; i++){
       
      
            
        System.out.println("Qual o nome da do pedido:  ");
        String nome = ler.next();
        System.out.println ("O quanto deseja gastar:  ");
        int valor = ler.nextInt();
        System.out.println ("Quer quantas quantidades: ");
        int quantidade = ler.nextInt();
        System.out.println ("Qaul o número da mesa:  ");
        int numMesa = ler.nextInt();
        System.out.println ("Gostaria de dar gorgeta ao garçom: ");
        String gorgeta = ler.next();
            
       CadastrarPedido1[i] = new CadastrarPedido(valor, nome, quantidade, numMesa, gorgeta);
        
       
    }
         System.out.println("/n/nAQUI ESTÁ A LISTA DE PEDIDO QUE ESCOLHEU: ");
        
         for (int i=0; i<CadastrarPedido1.length ;i++) {
             System.out.println("/////////////////////////////////////////////////");
             System.out.println("\nNome do pedido: " + CadastrarPedido1[i].getNome());
             System.out.println("O quanto desejaria gastar: " + CadastrarPedido1[i].getValor());
             System.out.println("Quantidade total de itens pedido: " + CadastrarPedido1[i].getQuantidade());
             System.out.println("Número da mesa para ser entregue: " + CadastrarPedido1[i].getNumMesa());
             System.out.println("Gostaria de dar gorgeta ao garçom:  " + CadastrarPedido1[i].getGorgeta());
             
        
    }
}
}
