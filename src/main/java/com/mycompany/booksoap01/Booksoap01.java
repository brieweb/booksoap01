/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.booksoap01;


//import com.mycompany.generated.TimeServer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author BRBLAVE
 */
public class Booksoap01 {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:9876/ts?wsdl");

        // Qualified name of the service:
        //   1st arg is the service URI
        //   2nd is the service name published in the WSDL
        QName qname = new QName("http://ts.ch01/", "TimeServerImplService");

        // Create, in effect, a factory for the service.
        Service service = Service.create(url, qname);

        // Extract the endpoint interface, the service "port".
//        TimeServer eif = service.getPort(TimeServer.class);
//        String timeString = eif.getTimeAsString();
//        System.out.println("Time as string " + timeString);
//        long l = eif.getTimeAsElapsed();
//        System.out.println("Time as long " + Long.toString(l));
        
        
    }
}
