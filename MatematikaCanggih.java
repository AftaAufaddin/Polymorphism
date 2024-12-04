/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author ADVAN
 */
public class MatematikaCanggih extends Matematika {
    public double operasiPecahan(double a, double b, double c) {
        double hasil = a + b + c;
        System.out.println("Hasil operasi pecahan : " + hasil);
        return hasil;
    }
}