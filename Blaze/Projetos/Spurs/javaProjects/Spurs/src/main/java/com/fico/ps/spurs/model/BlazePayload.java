/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fico.ps.spurs.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author GuilhermeCavalcante
 */
@ToString
public class BlazePayload implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    public BlazeRequest request;
    public BlazeResponse response = new BlazeResponse();
    
    public static BlazePayload createInstance(){
        return new BlazePayload();
    }
    
    public BlazePayload(){
    }
    
    public BlazeRequest getRequest(){
        return request;
    }
    
    public void setRequest(BlazeRequest request){
        this.request = request;
    }
    
     public BlazeResponse getResponse(){
        return response;
    }
    
    public void setResponse(BlazeResponse request){
        this.response = response;
    }
}
