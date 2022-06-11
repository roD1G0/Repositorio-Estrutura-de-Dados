/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_e_dados;

/**
 *
 * @author 2110102369
 */
public class Main {
    public static void main(String args[]){
        Aluno al1 = new Aluno("Rodrigo", 19, 10.0);
        Aluno al2 = new Aluno("Pedro", 20, 9.7);
        Aluno al3 = new Aluno("João", 16, 6.5);
        Aluno al4 = new Aluno("Gustavoo", 32, 8.6);
        
        LSE lse = new LSE();
        
        
        lse.insereFim("Boa noite!");
        lse.insereFim(al2);
        lse.insereInicio(al1);
        System.out.println(lse.estaVazia());
        
        System.out.println(lse.imprime());
        
        

    }
    
}
