/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.atividade.es.modelagem;

/**
 *
 * @author Jhonny
 */
public class Entrega extends Endereco {
    
    public Entrega(String rua, String numero, String bairro, String cidade) {
        super(rua, numero, bairro, cidade);
    }
    
    protected double distancia;
    protected double valorEntrega;
    protected Endereco endereco;
    
    
    
    public void caucularDistancia(double distancia){
        valorEntrega = distancia*4.50;
        
        System.out.println("\nValor da entrega: " + valorEntrega); 
    }
    
    public void infoEndereco(){
        System.out.println("Informações do endereço:");
        System.out.println("Rua: "+ getRua() + "\nNumero: " +getNumero() + "\nBairro: " + getBairro() + "\nCidade: " + getCidade());
    }
    
    
    
}
