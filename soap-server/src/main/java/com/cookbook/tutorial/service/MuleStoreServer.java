
package com.cookbook.tutorial.service;

import com.cookbook.tutorial.internal.service.CookBookDefaultBackEndImp;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.5.9
 * 2015-01-02T12:37:42.486-03:00
 * Generated source version: 2.5.9
 * 
 */
 
public class MuleStoreServer {

    private static final String address = "http://localhost:9090/cook-book";

    protected MuleStoreServer() throws Exception {
        System.out.println("Starting Server");
        MuleCookBookServiceImpl implementor = new MuleCookBookServiceImpl();
        implementor.setServiceDAL(new CookBookDefaultBackEndImp());

        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws Exception {
        new MuleStoreServer();
        System.out.println("Application started.\n" +
                "Try accessing " + address + "?wsdl in the browser.\n" +
                "Hit enter to stop the application...");
        System.in.read();
        System.out.println("Server terminated");
        System.exit(0);
    }
}