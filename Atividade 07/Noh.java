/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_e_dados;

/**
 *
 * @author 2110102369
 */
public class Noh {

    private Object info;
    private Noh  ant;
    private Noh prox;

    public Noh(Object obj) {
        this.info = obj;
        this.ant = null;
        this.prox = null;
    }

    public void setAnt(Noh ant) {
        this.ant = ant;
    }

    public Noh getAnt() {
        return ant;
    }
    public String toString() {
        if(this.info != null)
            return info.toString() + "\n";
        return "";
    }
    public void setProx(Noh prox) {
        this.prox = prox;
    }

    public Object getInfo() {
        return info;
    }

    public Noh getProx() {
        return prox;
    }

}
