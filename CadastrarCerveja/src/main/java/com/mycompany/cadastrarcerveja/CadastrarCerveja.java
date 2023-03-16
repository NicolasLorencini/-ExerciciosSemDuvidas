/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrarcerveja;
import java.util.Scanner;
/**
 *
 * @author Nicolas Leandro
 */
public class CadastrarCerveja {

     public static void main(String[] args) {
        Scanner ler;
         ler = new Scanner(System.in);
        
        Cerveja [] cadastrarCerveja1 = new Cerveja[5];
       
       
        for(int i = 0; i < 5; i++){
       
        System.out.println("Qual o nome da marca da cerveja: ");
        String marca = ler.next();
        System.out.println("Qual o cheiro da cerveja: ");
        String cheiro = ler.next();
        System.out.println ("Qaual a idade da cerveja: ");
        int idade = ler.nextInt();
        System.out.println ("Qaul o preço da cerveja: ");
        int preco = ler.nextInt();
        System.out.println ("Qaul o teor alcólico da cerveja: ");
        int codigo = ler.nextInt();
        System.out.println ("Qual a localidade da cerveja: ");
        String localidade = ler.next();
       
       cadastrarCerveja1[i] = new Cerveja(marca, cheiro, idade, preco, codigo, localidade );
       
       
       
        
    }
        System.out.println("\n\n\n\n LISA DO QUE VOCÊ ESCOLHEU:  ");
        
         for (int i=0; i<cadastrarCerveja1.length ;i++) {
             System.out.println("--------------------------------------------");
             System.out.println("\nnome: " + cadastrarCerveja1[i].getMarca());
             System.out.println("cheiro: " + cadastrarCerveja1[i].getCheiro());
             System.out.println("idade: " + cadastrarCerveja1[i].getIdade());
             System.out.println("Preço: " + cadastrarCerveja1[i].getCheiro());
             System.out.println("Qual o teor alcólico da cerveja:  " + cadastrarCerveja1[i].getCodigo());
             System.out.println("De onde veio a cerveja:  " + cadastrarCerveja1[i].getLocalidade());
         }
     }
       }

