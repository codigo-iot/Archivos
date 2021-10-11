package com.sic;

import java.io.FileWriter;

public class App {
    public static void main(String[] args) {
        try {
            FileWriter archivo = new FileWriter("archivo.txt");
            for(int i=0; i< 100;i++){
                archivo.append("Linea: "+ Integer.toString(i)+'\n');
            }
            archivo.flush(); 
            archivo.close(); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}