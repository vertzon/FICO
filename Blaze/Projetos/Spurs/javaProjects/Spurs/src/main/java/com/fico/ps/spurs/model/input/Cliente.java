/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fico.ps.spurs.model.input;

import java.io.Serializable;
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
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L;
    
    public int Cd_Score;
    public int Qt_Dependentes;
}
