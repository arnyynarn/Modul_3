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
public class Tugas2 {
    public static void main(String[] args) {
        int hasil = 1;
        int angka, pangkat;
        Scanner a = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        angka = a.nextInt();
        
        Scanner b = new Scanner(System.in);
        System.out.print("Masukkan Pangkat : ");
        pangkat = b.nextInt();
        
        for(int i = 1; i <= pangkat; i++){
            hasil = hasil*angka;
        }
        System.out.println("Hasil = "+angka+" Pangkat "+pangkat+" = "+hasil);
    }
}
