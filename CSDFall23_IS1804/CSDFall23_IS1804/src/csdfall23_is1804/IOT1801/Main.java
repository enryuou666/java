/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdfall23_is1804.IOT1801;

/**
 *
 * @author thangnv75
 */
public class Main {
    public static void main(String[] args) {
       Linkedlist lt = new Linkedlist();
       lt.addHead(70);
       lt.addHead(4);
       lt.addHead(6);
       lt.addHead(8);
       lt.addHead(70);
       lt.addHead(5);
       lt.addHead(10);
       
       lt.addTail(6);
       lt.addTail(7);
        System.out.println("\nDS la");
        lt.display();
        int x=99;
        int pos=9;
        lt.insertAt(pos, x);
        System.out.println("After insert "+x +" at "+pos);
        lt.display();
        lt.addTail(999);
        System.out.println("After add Tail 999");
        lt.display();
       //chen gia tri x vao sau node co gia tri lon nhat dau tien
      // pos=lt.findfirstmax();
       
    }
}
