/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_01;

/**
 *
 * @author aluno
 */
public class Lista_01 {
    
    
    
    /**
    *Dados dois números inteiros x e n, calcular o valor de xn
    *Exemplo fun(3,2) retorna
    *de resultado 9.
     *
     * 
     */
    public static int eleavado(int x,int y) {
        if(y == 0) {
            return 1;
        }
      return x * (eleavado(x,y-1));
    }
    
    
    
    public static int soma(int x,int y) {
        if(y == 0) {
            return 0;
        }
      return x + soma(x,y-1);
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(soma(4,3));
    }
    
}
