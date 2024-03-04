
package pilhasaopaulo;

import javax.swing.JOptionPane;

public class Pilhasaopaulo {
    int topo; 
    int n;
    int vet[];


public Pilhasaopaulo(){
    topo = -1;
    n = Integer.parseInt(JOptionPane.showInputDialog("qual o tamanho da pilha?"));
    
    vet = new int[n];
           
}

public void push(int dado){
    if(topo== n-1){
        System.out.println("pilha cheia");
    }else{
            topo++;
            vet[topo] = dado;
    }
}

public int pop(){
    int dado = 0;
    if(topo == -1){
        System.out.println("pilha vazia");
    }else{
        
        dado = vet[topo];
        topo--;
 }
    return dado;
}

public static void main(String[] args) {
       
    Pilhasaopaulo pilhasaopaulo = new Pilhasaopaulo();
    pilhasaopaulo.push(7);
    pilhasaopaulo.push(5);
    pilhasaopaulo.push(-9);
    
    System.out.println("o dado retirado foi: " + pilhasaopaulo.pop());
    
 }
    
}
