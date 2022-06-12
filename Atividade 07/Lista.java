/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aula_e_dados;

/**
 *
 * @author 2110102369
 */
public interface Lista {
    public void insereInicio(Object obj);
    public void insereFim(Object obj);
    public boolean estaVazia();
    public boolean remove(Object obj);
    public int tamanho();
}
