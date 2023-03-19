/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.campeonatofutebol;

/**
 *
 * @author Nicolas     Esse exercicio foi feito com ajuda do Mathues.
 */
public class CampeonatoFutebol {
 static void proximoJogo(Time time1, Time time2) {
    
 System.out.println("Jogo de hoje: " + time1.getNome() + " Contra " + time2.getNome() + "/ O " + time1.getNome() + " esta a " + time1.relatorio() + " jogos sem perder e o time do " 
         + time2.getNome() + " está a " + time2.relatorio() + " jogos sem perder");
 }
    public static void main(String[] args) {
        
        Jogador j1 = new Jogador ("Messi", 34, "atacante",  155, "manchester");
        Jogador j2 = new Jogador ("Ronaldo", 32, "meio-Campista",  178, "Flamengo");
        Jogador j3 = new Jogador ("Halland", 20, "atacante",  190, "Palmeiras");
        Jogador j4 = new Jogador ("Son", 25, "Lateral Direito",  181, "Corinthias");
        Jogador j5 = new Jogador ("Mbappe", 21, "Lateral Esquerdo",  176, "Santosd");

        Time time1 = new Time("Eichenwalde", "Russía", "Ethihad Stadium", 12, j1);

        Time time2 = new Time("Flamengo", "Brasil", "Itaquera", 62, j3);
         
        proximoJogo(time1, time2);
        
        time1.getNome();
        time2.getNome();
        
        j1.getTime();
        j1.getPosicao();
        j1.getNomeIdade();
        j4.getTime();
        j4.getPosicao();
        j4.getNomeIdade();
        
        
        
       
    }
}
