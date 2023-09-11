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
public class Linkedlist {
   Node head,tail;

    public Linkedlist() {
        head=tail=null;
    }
    public void clear(){
        head=tail=null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addHead(int x){
        Node newnode = new Node(x);
        if (isEmpty()){
            head=tail=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void display(){
        Node p=head;
        while (p!=null){
            System.out.print (p.info+" ");
            p=p.next;
        }
        System.out.println("");
    }
    public void addTail(int x){
        Node newnode = new  Node(x);
        if (isEmpty()){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void insertAt(int pos,int x){
        int count=0;
        Node p=head;
        if (pos<0) return ;
        if (isEmpty() || pos==0){
            addHead(x);
            return;
        }
        
        while (count<pos-1 && p!=null){
            count++;
            p=p.next;
        }
        if (p==null) return;
        if (p==tail){
            addTail(x);
            return;
        }
        Node newnNode = new Node(x);
        newnNode.next=p.next;
        p.next=newnNode;
        
    }
    public  int findfirstmax(){
        int count=1,pos=0;
        Node p=head;
        int max = head.info;
        while (p!=null){
            if (p.info>max){
                max=p.info;
                pos=count;
            }
            count++;
            p=p.next;
        }
        return pos;
    }
    public void removeFirst(){
        
    }
    public void removeLast(){
        
    }
    public int findfisrtX(int x){
        Node p=head;
        int pos=0;
        
       return pos;
        
    }
}
