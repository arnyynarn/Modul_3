/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

import java.util.Scanner;

/**
 *
 * @author arniy
 */
public class Tugas3 {
    public static void main(String[] args) {
        String a = "Tahun Kabisat";
        String b = "Bukan Tahun Kabisat";
        int tahun;
        
        Scanner input=new Scanner(System.in);
        //penginputan tahun dibatasi dari 1900 sampai 2005
        System.out.print("Masukan Tahun (1900-2005): ");
        tahun=input.nextInt();
        if (tahun<1900){
            System.out.println("Maaf, Tahun Input Dibawah 1900");
        }
        else if (tahun>2005){
            System.out.println("Maaf, Tahun Input Diatas 2005");
        }
        else if((tahun%4==0 && tahun%100!=0)||(tahun%400==0)){
            System.out.println("Tahun " + tahun + " Adalah " + a);
        }else{
            System.out.println("Tahun " + tahun + " " + b);
        }       
    }
}
