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

public class Linkedlist{
    Node head;
    Node tail;

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
if(isEmpty()){
    head=tail=newnode;
}
else
{
    newnode.next=head;
    head=newnode;    
        }
}
public void addTail(int x){
     Node newNode = new Node(x);
if(isEmpty()){
    head=tail=newNode;
}
else
{
    tail.next= newNode;
    tail= newNode;
        }
}
public void insertAt(int pos, int x){
    int count =0;
    Node p=head;
    if(pos<0) return;
    if(isEmpty()|| pos==0);
}
public void removeFrist(){

}
public void removeLast(){

}
public void display(){
    Node p=head;
    while (p!=null){
        System.out.print (p.info + ", ");
        p=p.next;
    }
}
}