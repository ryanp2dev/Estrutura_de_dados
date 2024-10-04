/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filha;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Filha {

    /**
     * @param args the command line arguments
     */
    
    public static class PILHA {
        public int num;
        public PILHA prox;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PILHA aux;
        PILHA topo = null;

        
        
        int op ;
        
        do {

           

            
            System.out.println("--Opcoes-- ");            
            System.out.println("1 - INserir na Pilha");
            System.out.println("2 - Consultar toda pilha");
            System.out.println("3 - Remover Pilha");
            System.out.println("4 - Esvaziar Pilha");
            System.out.println("5 - Sair ");
            op = sc.nextInt();
            
            if(op < 1 || op >5 ) {
                System.out.println("Opcao invalida ");
            }
            
            
            if (op == 1 ) {
            
            PILHA novo = new PILHA();
            novo.num = sc.nextInt();
            
            novo.prox = novo;
            topo = novo;
            
                System.out.println("Numeros inseiresdos ");
            
            }
            
        }while(op != 5);
    
    }
}
