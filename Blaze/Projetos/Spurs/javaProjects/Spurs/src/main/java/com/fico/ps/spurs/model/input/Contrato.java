/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fico.ps.spurs.model.input;

import java.io.Serializable;
import java.util.Date;
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
public class Contrato implements Serializable{
    
  private static final long serialVersionUID = 1L;

   public int Id_Cliente;
   public Date Dt_Contrato;
   public Produto produto = new Produto();
   public Cliente cliente = new Cliente();
}
