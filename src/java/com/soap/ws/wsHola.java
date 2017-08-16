/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soap.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ivette.lara
 */
@WebService(serviceName = "wsHola")
public class wsHola {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hola")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hola " + txt + " !";
    }
}
