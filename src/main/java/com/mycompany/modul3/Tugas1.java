/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

import javax.swing.JOptionPane;

/**
 *
 * @author arniy
 */
public class Tugas1 {
    public static void main(String[] args) {
        int[] data = new int[10];

        int i;
        for (i=0; i<10; i++){
            String bilangan = JOptionPane.showInputDialog("Masukkan Nilai = ");
            data[i] = Integer.parseInt(bilangan);
            System.out.println("Input Angka = "+bilangan);
        }
        double total = 0;
        int nilaiMax = data[0];
        for(int nilai : data){
            total += nilai;
            if(nilai > nilaiMax){
                nilaiMax = nilai;
            }
        }       
        double nilaiRata = total / i;
        
            System.out.println("--------------------------------------");
            System.out.println("Nilai Rata - Rata = "+nilaiRata);
            System.out.println("Nilai Maksimum = "+nilaiMax);

            System.exit(0);

    }
}
