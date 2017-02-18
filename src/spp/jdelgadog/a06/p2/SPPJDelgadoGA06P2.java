/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jdelgadog.a06.p2;
import java.util.Scanner;
/**
 *
 * @author GILDARDO
 */
public class SPPJDelgadoGA06P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int num, factorial=1;
        System.out.println("Ingrese un número");
        num=kb.nextInt(); 
        for(int i=1;i<=num;i++){
            factorial=factorial*i;
            if(num>10){
            System.out.println("El número está fuera de rango");
        }
        }
        System.out.println("El factorial es:  "+factorial);
    
    } 
}
