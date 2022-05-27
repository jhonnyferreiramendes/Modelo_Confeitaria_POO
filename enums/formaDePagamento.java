/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Jhonny
 */
public enum formaDePagamento {
    
    DINHEIRO,CARTAO,PIX;
    
    public static formaDePagamento getDINHEIRO() {
        return DINHEIRO;
    }

    public static formaDePagamento getCARTAO() {
        return CARTAO;
    }

    public static formaDePagamento getPIX() {
        return PIX;
    }
}
