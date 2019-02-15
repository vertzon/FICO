/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fico.ps.spurs.model;

import com.fico.ps.spurs.model.output.BlazeCalculoContrato;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
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
public class BlazeResponse implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    public BlazeCalculoContrato calculoContrato = new BlazeCalculoContrato();
    public List<BlazeRuleServiceError> erros = new LinkedList<>();
}
