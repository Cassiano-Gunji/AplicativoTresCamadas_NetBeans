/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import fronteira.TelaCadastroDePessoa;
/**
 *
 * @author Cassiano
 */
public class Programa {
    
    public static void main(String [] args){
        // Criação do objeto tratador de eventos da janela:
        ICadastroPessoa tratador = new CadastroPessoa();
        
        // Criação da janela com o seu tratador de eventos:
        TelaCadastroDePessoa tela = new TelaCadastroDePessoa(tratador);
        
        // A janela é feita visível:
        tela.setVisible(true);
    }
}

