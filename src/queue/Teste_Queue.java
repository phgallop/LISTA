/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import queue.Queue;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Teste_Queue {
    public static void main(String[] args){
        Queue q = new Queue();
        System.out.println("Inserindo numeros na lista.");
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);        
        System.out.println("Numeros que estão na lista:");
        q.print();
        System.out.println("Quantidade de elemento na lista: "+q.size());
        
        System.out.println("Desenfila 1 elemento");
        q.dequeue();
        System.out.println("Numeros que estão na lista:");
        q.print();

        
        System.out.println("Quantidade de elemento na lista: "+q.size());
        
        
    }
    
    
}
