package com.mycompany.minuscolo_oggetti;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lorenzo
 */

import java.util.Scanner;

public class procedimento {
    private final  int TANTI = 30;
    private String parola;
    private final char[] minuscolo = new char[TANTI];
    
    
    public void input_utente(){   
        Scanner in = new Scanner(System.in);    
        System.out.println("\nInserisci una parola : ");
        parola = in.next();
        
    }
    
    
    
    public void trasformazione_string_a_array(){ 
        for(int x = 0; x < parola.length(); x++){
             minuscolo[x] = parola.charAt(x);   
        }       
    }
    
    public void trasformazione_in_minuscolo(){
        //trasforma la parola in minuscolo
        for(int x = 0; x < parola.length(); x++){
            // in minuscolo
             minuscolo[x] = Character.toLowerCase(minuscolo[x]);
             
        }
    }
    
    public void visualizzazione_parola_minuscolo_array(){
        System.out.print("\nLa parola in minuscolo  : " );
         
        // visualizza la parola carattere per carattere
        for(int x = 0; x < minuscolo.length; x++){
            
            System.out.print(minuscolo[x]);
            
        }
    }
  
    public void visualizzazione_parola_minuscolo_oggetto(){
        String parolaMinu = new String(minuscolo);
        System.out.print("\nLa parola in minuscolo (oggetto): ");
        System.out.print(parolaMinu);
    }
}
