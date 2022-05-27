/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.atividade.es.modelagem;

import enums.formaDePagamento;

/**
 *
 * @author Jhonny
 */
public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private formaDePagamento infoPagamento;

    public Cliente(String nome, String cpf, formaDePagamento infoPagemnto) {
        this.nome = nome;
        this.cpf = cpf;
        this.infoPagamento = infoPagamento;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public void infoCliente(){
        System.out.println("Informações do Cliente");
        System.out.println("Nome Cliente: " + nome + "\nCPF: " + cpf );
                
    }
    
    public void pagamento(formaDePagamento pagamento){
        System.out.println("Forma de Pagamento: $ "  + pagamento);
    }
    
}
