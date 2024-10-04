/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filha;

/**
 *
 * @author aluno
 */
public class Vagao {
 
        public int rodas;
        public int janelas;
       Vagao prox;
        
        
    public static void main (String args[]) {
       Vagao maquinista = new Vagao();
       maquinista = null;
        
        
        
        Vagao v1 = new Vagao();
        v1.rodas = 4;
        v1.janelas = 2;
        System.out.println(v1.toString());
      
        
        Vagao v2 = new Vagao();
        v2.rodas = 6;
        v2.janelas = 4;
        System.out.println(v2.toString());
        v2.prox = v1;
        maquinista = v2;
         System.out.println(v2.toString());
}

    @Override
    public String toString() {
        return "Vagao{" + "rodas=" + rodas + ", janelas=" + janelas + '}';
    }    
}



