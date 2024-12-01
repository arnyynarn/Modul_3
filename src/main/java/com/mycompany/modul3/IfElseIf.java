/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul3;

/**
 *
 * @author arniy
 */
public class IfElseIf {
     public static void main(String[] args) {
        int nilai = 6;
        char index;
        if(nilai >= 8){
            index = 'A';
        }else if(nilai >= 7){
            index = 'B';
        }else if(nilai >= 6){
            index = 'C';
        }else if(nilai >= 5){
            index = 'D';
        }else{
            index = 'E';
        }
        System.out.println(index);
    }
}
