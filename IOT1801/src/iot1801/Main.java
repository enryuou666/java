/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot1801;

/**
 *
 * @author Quang Hai
 */
public class Main {
    public static void main(String[] args) {
        Linkedlist t= new Linkedlist();
        t.addTail(1);
        t.addHead(2);
        t.addHead(6);
        t.addTail(9);
        t.addTail(0);
        t.addHead(1);
        t.display();
        
    }
}
