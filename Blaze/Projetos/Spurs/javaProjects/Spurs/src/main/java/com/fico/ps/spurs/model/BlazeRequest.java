/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fico.ps.spurs.model;

import com.fico.ps.spurs.model.input.Contrato;
import java.io.Serializable;
import javax.swing.text.StyledEditorKit;
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
public class BlazeRequest implements Serializable{
    
       private static final long serialVersionUID = 1L;
        
        public boolean returnLog = true;
        public Contrato contrato = new Contrato();
}
