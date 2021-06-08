package com.mini;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Tester0608 {
    public static void main(String[] args) {
        //TELNET, RFC 854
        try{
            Socket socket = new Socket("ptt.cc",23);
//                Socket socket1 = new Socket("tw.yahoo.com",88);
            InputStream is = socket.getInputStream();
            for (int i = 0; i < 500; i++) {
                int data= is.read();
                System.out.println((char)data);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
