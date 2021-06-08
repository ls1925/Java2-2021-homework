package com.mini;

import java.io.IOException;
import java.net.Socket;

public class Tester0608 {
    public static void main(String[] args) {
        //TELNET, RFC 854
        try{
            Socket socket = new Socket("ptt.cc",23);
                Socket socket1 = new Socket("tw.yahoo.com",88);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
