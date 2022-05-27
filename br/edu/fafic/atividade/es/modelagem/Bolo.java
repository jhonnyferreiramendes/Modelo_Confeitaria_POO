/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.atividade.es.modelagem;

import enums.Sabor;



/**
 *
 * @author Jhonny
 */
public class Bolo {

    private double peso;
    private Sabor sabor;
    private double preco;
    

    /*public Bolo(double peso, Sabor sabor, double preco) {
        this.peso = peso;
        this.sabor = sabor;
        this.preco = preco;
        
    }*/

    public void cacucularValorBaunilha(double peso, double preco, Sabor sabor) {
        System.out.println("Sabor: " + sabor);
        double recheioBaunilha = peso *( 10 * 2.50);
        double precoBoloBaunilha =  (preco + recheioBaunilha);
        System.out.println("Valor do recheio de baunilha: " + recheioBaunilha);
        System.out.println("Valor total do bolo de baunilha: "+ precoBoloBaunilha);
        
    }
       
    
    public void cacucularValorChocolate(double peso, double preco, Sabor sabor) {
        System.out.println("Sabor: " + sabor);
        double recheioChocolate = peso *(1.80* 10);
        double precoBoloChocolate =  preco + recheioChocolate;
        System.out.println("Valor do recheio de chocolate: " + recheioChocolate);
        System.out.println("Valor do produto: "+ precoBoloChocolate);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    

}
