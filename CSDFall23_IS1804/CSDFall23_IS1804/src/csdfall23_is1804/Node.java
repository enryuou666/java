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
public class Node {
    int inf;
    Node next;

    public Node() {
    }

    public Node(int inf, Node next) {
        this.inf = inf;
        this.next = next;
    }
     public Node(int inf ) {
        this.inf = inf;
        this.next = null;
    }
    
}
