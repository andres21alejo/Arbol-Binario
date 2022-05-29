/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinario;

/**
 *
 * @author User
 */
public class NodoArbol {
 int dato;
    NodoArbol hijoizquierdo;
    NodoArbol hijoderecho;

    public NodoArbol(int dato) {
        this.dato = dato;
        this.hijoderecho = null;
        this.hijoizquierdo = null;
    }

    @Override
    public String toString() {
        return " " + dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    public NodoArbol getHijoizquierdo() {
        return hijoizquierdo;
    }

    public void setHijoizquierdo(NodoArbol hijoizquierdo) {
        this.hijoizquierdo = hijoizquierdo;
    }

    public NodoArbol getHijoderecho() {
        return hijoderecho;
    }

    public void setHijoderecho(NodoArbol hijoderecho) {
        this.hijoderecho = hijoderecho;
    }   
}
