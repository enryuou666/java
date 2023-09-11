/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdfall23_is1804;

/**
 *
 * @author thangnv75
 */
public class Main {

    public static void main(String[] args) {
        myLinkedList mylist = new myLinkedList();
        mylist.clear();
        mylist.addHead(7);
        mylist.addHead(6);
        mylist.addHead(7);
        mylist.addHead(5);
        mylist.addHead(7);
        System.out.println("List of my list:");
        mylist.display();
        mylist.renovex(5);
        System.out.println("after remove 50");
        mylist.display();
        mylist.update(3, 10);
        System.out.println("After update");
        mylist.display();
        mylist.remove2(7);
        mylist.display();
//System.out.println("\nAfter add Head");
//         mylist.display();
//         mylist.addTail(90);
//         mylist.addTail(10);
//         System.out.println("\nafter add tail");
//         mylist.display();
//         mylist.insertAtposition(5, 99);
//         System.out.println("\nAfter insert ");
//         mylist.display();
//         
//         mylist.remove(6);
//         System.out.println("\nAfter remove ");
//         mylist.display();
//         mylist.addTail(0); 
//         System.out.println("\nafter add tail");
//         mylist.display();
//         
         //xoa node dau tien co gia tri = x
         
//         int pos = mylist.findfirstMax();
//         mylist.insertAtposition(pos, 999);
//         System.out.println("after insert at "+pos);
//         mylist.display();
    }

}
