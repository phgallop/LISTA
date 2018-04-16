/*
            ====================================================
            TIPO:       CLASS
            NAME:       Queue
            DESCRÇÃO:   implementação de fila
            ----------------------------------------------------
            001     enqueue
            002     dequeue
            003     size
            004     isEmpty
            005     print

            ====================================================

 */
package queue;

public class Queue {

    public int num, totalElementos;
    public Queue prox;

    Queue inicio = null;    
    Queue fim = null;       
    Queue aux;              
    Queue anterior;
    int op = 0, numero = 0, achou;

//------------------------------------------------------------------------------
//  001
//------------------------------------------------------------------------------
    public void enqueue(int n) {
        Queue novo = new Queue();
        novo.num = n;
        if (inicio == null) {
            inicio = novo;
            fim = novo;
            novo.prox = null;

        } else {
            fim.prox = novo;
            fim = novo;
            fim.prox = null;
        }
        System.out.println("O numero " + novo.num + " foi adicionado");
        totalElementos++;
    }
//------------------------------------------------------------------------------
//  002
//------------------------------------------------------------------------------
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            aux = inicio;
            inicio = aux.prox;
            totalElementos--;
            return aux.num;
        }
        return -1;
    }
//------------------------------------------------------------------------------
//  003
//------------------------------------------------------------------------------
    public int size() {
        return this.totalElementos;
    }
//------------------------------------------------------------------------------
//  004
//------------------------------------------------------------------------------
    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
//------------------------------------------------------------------------------
//  005
//------------------------------------------------------------------------------
    public void print() {
        if (isEmpty()) {
            System.out.println("");
        } else {
            //System.out.println("");
            aux = inicio;
            while (aux != null) {
                System.out.println(aux.num + " ");
                aux = aux.prox;
            }
            
        }
    }
}
