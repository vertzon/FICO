/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fico.ps.spurs.model.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;
import javax.xml.ws.ServiceMode;
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
@NoArgsConstructor
@ToString
public class MemoriaCalculo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    public Map<String,String> listaMemoria;
    
    
    public void adicionaItem(String key, String value){
        if(listaMemoria == null){
            listaMemoria = new HashMap<>();
        } 
        listaMemoria.put(key,value);
    }
}
