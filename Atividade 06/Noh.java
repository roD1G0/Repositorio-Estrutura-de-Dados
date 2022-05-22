/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_12_5_2022;

/**
 *
 * @author 2110102369
 */
public class Noh {

    private Object info;
    private Noh prox;

    public Noh(Object obj) {
        this.info = obj;
        this.prox = null;
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
