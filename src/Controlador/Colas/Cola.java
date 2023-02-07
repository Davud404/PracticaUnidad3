/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.Colas;

import Controlador.Colas.Excepciones.CimaException;
import Controlador.Colas.Excepciones.ColaVaciaException;
import Controlador.ListaEnlazada.Excepciones.ListaVaciaExcepcion;
import Controlador.ListaEnlazada.Excepciones.PosicionNoEncontradaException;
import Controlador.ListaEnlazada.ListaEnlazada;

/**
 *
 * @author David Campoverde
 */
public class Cola<E> extends ListaEnlazada<E>{
    private Integer cima;
    
    public Cola(Integer cima) {
        this.cima = cima;
    }
    
    public Boolean estaLleno(){
        return cima == getSize();
    }
    
    public void queue(E dato) throws PosicionNoEncontradaException, CimaException{
        if(!estaLleno()){
            insertar(dato);
        } else throw new CimaException();
    }
    
    public E dequeue() throws ColaVaciaException, ListaVaciaExcepcion, PosicionNoEncontradaException {
        if (!estaVacia()){
            E dato = eliminar(0);
            return dato;
            
        } else throw new ColaVaciaException();
    }
}
