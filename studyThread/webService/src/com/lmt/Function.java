package com.lmt;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Function {

    public String transWords(String message){
        String str = "";
        for (char ch:message.toCharArray()) {
            str+=ch+",";
        }
        return str;
    }


    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8089/service/function",new Function());
        System.out.println("Publish Success");
    }
}
