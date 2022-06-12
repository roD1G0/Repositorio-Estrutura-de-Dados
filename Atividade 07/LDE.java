/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_e_dados;

/**
 *
 * @author rodrigo
 */
public class LDE implements Lista{
    private Noh inicio;
    private Noh fim;

    @Override
    public void insereInicio(Object obj) {
        Noh novo = new Noh(obj);
            if (inicio == null){
            inicio = novo;
            fim = novo;
        }else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }    
    }

    @Override
    public void insereFim(Object obj) {
        Noh novo = new Noh(obj);
        if (fim == null){
        inicio = novo;
        fim = novo;
        } else {
        novo.setAnt(fim);
        fim.setProx(novo);
        fim = novo;
        }    
    }

    @Override
    public boolean estaVazia() {
        if(this.inicio == null && this.fim == null)
            return true;
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        Noh p = inicio;
        while (p!=null && p.getInfo() != obj)
            p = p.getProx();
        if (p==null)
            return false;
        if (p == inicio){
            inicio = p.getProx();
            if (inicio != null) inicio.setAnt(null);
            else fim = null;
        } else if (p.getProx() == null){
        p.getAnt().setProx(null);
        fim = p.getAnt();
        } else {
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        return true;    
    }

    @Override
    public int tamanho() {
        int qtd = 0;
        for(Noh i = inicio; i != null; i = i.getProx())
            qtd++;
        return qtd;
    }
    
    public int maximoRec(int vet[], int inicio, int fim){
        if(inicio == fim)
            return vet[inicio];
        else{
            int meio = (inicio + fim) / 2;
            int max1 = maximoRec(vet, inicio, meio);
            int max2 = maximoRec(vet, meio+1, fim);
            if(max1 > max2)
                return max1;
            else
                return max2;
        }
    }
    public int maximoRecIt(int vet[], int inicio, int fim){
        if(inicio == fim)
            return vet[inicio];
        else{
            int max1 = vet[inicio];
            for(int i = 0; i <= vet.length-1; i++){
                if(vet[i] > max1)
                    max1 = vet[i];
            }
            return max1;
        }
    }
}
