/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

public class SwitchCase {
    public static void main(String[] args) {
        int hari = 7;
        switch (hari){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Bukan Hari Libur");
                break;
            case 7:
                System.out.println("Hari Libur");
                break;
            default:
                System.out.println("Hari Tidak Diketahui");
                break;
    }
    }
}
