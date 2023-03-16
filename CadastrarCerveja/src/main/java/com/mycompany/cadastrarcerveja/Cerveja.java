/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarcerveja;

/**
 *
 * @author Administrator
 */
public class Cerveja {
  
    public String marca;
    public String cheiro;
    public int idade;
    public int preco;
    private int codigo;
    private String localidade;

        public Cerveja(String amarca, String acheiro, int aidade, int apreco, int acodigo, String alocalidade){
            this.marca = amarca;
            this.cheiro = acheiro;
            this.idade = aidade;
            this.preco = apreco;
            this.codigo = acodigo;
            this.localidade = alocalidade;
        }
        public String getMarca(){
            
            return marca;
                    
        }
        public void setMarca(String marca) {
            
        this.marca = marca;
        
    }
        public String getCheiro (){
            
            return cheiro;
            
        }
        
        public void setCheiro (String cheiro){
            
            this.cheiro = cheiro;
            
        }
        
        public int getIdade (){
            
            return idade;
            
        }
        
        public void setIdade (int idade){
            
            this.idade = idade;
            
        }
        
        public int getPreco (){
            
            return preco;
            
        }
        
        public void setPreco (int preco){
            
            this.preco = preco;
            
        }
        
        public int getCodigo (){
            
            return codigo;
            
        }
        
        public void SetCodigo (int codigo){
            
            this.codigo = codigo;
        }
        
      public String getLocalidade(){
            
            return localidade;
                    
        }
        public void setLocalidade(String localidade) {
            
        this.localidade = localidade;
        }     
}
    



