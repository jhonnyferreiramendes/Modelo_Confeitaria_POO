/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.atividade.es.modelagem;

import enums.Sabor;
import enums.formaDePagamento;

/**
 *
 * @author Jhonny
 */
public class AtividadeModelagemDeSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Bolo boloChocolate = new Bolo();
        Bolo boloBaunilha = new Bolo();
        
        Entrega entrega1 = new Entrega("Samuel Duarte", "1041","Esperença","Cajazeiras");
        Entrega entrega2 = new Entrega("Jose Pedro Quirino", "214","Esperença","Cajazeiras");
        
        Cliente cliente1 = new Cliente("Jhonny Ferreira Mendes", "084.870.694-36", formaDePagamento.PIX);
        Cliente cliente2 = new Cliente("Damiana Vieira da Silva", "892.478.254-31", formaDePagamento.getDINHEIRO());
        
        boloBaunilha.cacucularValorBaunilha(1.8, 19.99, Sabor.BAUNILHA);
        
        entrega1.caucularDistancia(10);
        
        
        System.out.println("**********************************************");
        
        cliente1.infoCliente();
        cliente1.pagamento(formaDePagamento.getPIX());
        
        
        System.out.println("**********************************************");
        entrega1.infoEndereco();
        
        System.out.println("**********************************************");
        System.out.println("**********************************************");
        
        boloChocolate.cacucularValorChocolate(2.5, 19.99, Sabor.getCHOCOLATE());
        entrega2.caucularDistancia(15);
        
        System.out.println("**********************************************");
        
        cliente2.infoCliente();
        cliente2.pagamento(formaDePagamento.getDINHEIRO());
        
        
        System.out.println("**********************************************");
        entrega2.infoEndereco();
        
        System.out.println("**********************************************");
        System.out.println("**********************************************");
        
    }
    
}
