/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author miche
 */
@WebService(serviceName = "FuncionesMatematicas")
public class FuncionesMatematicas {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ElevarCuadrado")
    public String ElevarCuadrado(@WebParam(name = "numero") int numero) {
        //TODO write your implementation code here:
        return Math.pow(numero, 2)+"";
    }
}
