/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all_of_knowledge_javabasic;

/**
 *
 * @author Quang Hai
 */
public class ALL_OF_KNOWLEDGE_JAVABASIC {

    /**
     * @param args the command line arguments
     */
    //static : tinh, khi lam viec voi nhung thuat toan
    //public static void printHello(){
    public void printHello(){
       //sout +tab
       //ln: new line
        System.out.println("Hello ");
    }
    public static void main(String[] args) {
        //name Intansce = ten doi tuong se duoc tao ra( vi du nhu la 1 class)
        BasicJava bj = new BasicJava();
        // in ra mot cai gi day
        System.err.println("enrror");
        System.out.println("Hello World");
        //printHello();
        bj.printHello();
               
    }
    
}
