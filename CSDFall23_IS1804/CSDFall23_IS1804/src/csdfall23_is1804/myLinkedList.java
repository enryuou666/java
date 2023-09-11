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
public class myLinkedList {
    Node head,tail;

    public myLinkedList() {
        head=tail=null;
    }
    
    public void clear(){
        head=tail=null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addHead(int x){
        if (isEmpty()){
            head = tail = new Node(x);
        }
        else{
            Node newNode = new  Node(x);
            newNode.next=head;
            head=newNode;
        }
    }
    public void addTail(int x){
        if (isEmpty()){
            head=tail=new Node(x);
        }
        else{
            Node newnode = new Node(x);
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void remove(int pos){
        int count=0;
        Node p=head;
        if (isEmpty()) return;
        if (pos<0) return;
        //xoa node dau ds
        if (pos==0) {
            head=head.next;
            return;
        }
        //tim vi tri can xoa
        while (count<pos-1 && p!=null){
            count++;
            p=p.next;
        }
        if (p==null || p==tail) return;
//         xoa node cuoi ds
        if (p.next==tail){
            tail =p;
            tail.next=null;
            return;
        }
        //xoa node o giua ds
        p.next=p.next.next;
    }
    int findX(int x){
        Node p=head;
        int count=0;
        while (p!=null && p.inf!=x){
            p=p.next;
            count++;
        }
        return count;
    }
    public void update(int pos, int value){
        int count=0;
        Node p=head;
        while (p!=null && count<pos){
            p=p.next;
            count++;
        }
        if (p!=null) p.inf=value;
    }
    public void renovex(int x){
        int pos=findfirstMax();
        //System.out.println("pos = "+pos);
        remove(pos-1);
    }
    public void insertAtposition(int pos,int x){
        Node p=head;
        int count=0; 
        //chen o dau ds
        if(pos==0){
            addHead(x);
            return;
        }
        while (count<pos-1 && p!=null){             
            p=p.next;
            count++;
        }
        //vi tri khong ton tai
        if (p==null) {
            //System.out.println("KHong ton tai vi tri "+pos);
            return;
        }
//        chen o cuoi ds
        if (p==tail) {
            addTail(x);
            return;
        }
        //chen o giua ds
        Node newNode = new Node(x);
        newNode.next=p.next;        
        p.next=newNode;
        
      //  if (p==tail) tail=newNode;
        //ct bi sai truogn hop chen vao dau hoac cuoi cua ds
        
    }
    int findfirstMax(){
        int max=head.inf;
        Node p=head;
        int count=0,pos=0;
        while (p!=null){
            if (p.inf>max) {
                max=p.inf;
                pos=count;                
            }
            p=p.next;
            count++;
        }
        return pos;
    }
    int find2nd(int x){
        Node p=head;
        int count=0,pos=0;
        while (p!=null && count<2){
            if (p.inf==x) count++;
            pos++;
        }
        return pos;
    }
    public void remove2(int x){
        int pos = find2nd(x);
        remove(pos);
    }
    public void display(){
        Node p;
        p=head;
        while (p!=null){
            System.out.print (p.inf+" ");
            p=p.next;
        }
        System.out.println("");
    }
}
