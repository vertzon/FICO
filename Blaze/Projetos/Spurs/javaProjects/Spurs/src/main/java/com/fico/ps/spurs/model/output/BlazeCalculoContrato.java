/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fico.ps.spurs.model.output;

import java.io.Serializable;
import java.util.HashMap;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author GuilhermeCavalcante
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BlazeCalculoContrato implements Serializable{
    
     private static final long serialVersionUID = 1L;
     
     public double percentualIOF;
     public double custoApolice;
     public HashMap<String,String> listaMemoria;
     
     
     public void adicionaItem(String key, String value){
        if(listaMemoria == null){
            listaMemoria = new HashMap<>();
        } 
        listaMemoria.put(key,value);
    }
}
