/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_12_5_2022;

/**
 *
 * @author 2110102369
 */
public class LSE implements Lista{
    private Noh inicio;
    
    public LSE(){
        Object noh = null;
        this.inicio = new Noh(noh);
    }

    public void insereInicio(Object obj) {
        Noh novo = new Noh(obj);
        if(this.inicio == null)
            this.inicio = novo;
        else{
            novo.setProx(this.inicio);
            this.inicio = novo;
        }
    }

    public void insereFim(Object obj) {
        Noh novo = new Noh(obj);
        if(inicio == null)
            inicio = novo;
        else{
            Noh ultimo = null;
            for(Noh i = inicio; i != null; i=i.getProx())
                ultimo = i;
            ultimo.setProx(novo);
        }
    }

    public boolean estaVazia() {
        if(this.inicio == null)
            return true;
        return false;
    }

    public boolean remove(Object obj) {
        Noh ant = null, p;
        p = inicio;
        while(p !=null && p.getInfo() != obj){
            ant = p;
            p = p.getProx();
        }
        if(p == null)
            return false;
        if(ant == null)
            this.inicio = p.getProx();
        else
            ant.setProx(p.getProx());
        return true;
    }

    public int tamanho() {
        int qtd = 0;
        for(Noh i = inicio; i != null; i = i.getProx())
            qtd++;
        return qtd;
    }
    public String imprime(){
        Object obj;
        String impressao = "";
        for(Noh i = this.inicio; i != null; i = i.getProx())
            impressao = i.toString();
        return impressao;
    }
}
