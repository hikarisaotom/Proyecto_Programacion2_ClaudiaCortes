/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;

/**
 *
 * @author Claudia Cortes
 */
public class Propiedad{
   Object Valor;
     String Nombre;
    Object tipo;
    boolean Alcance;

    public boolean getAlcance() {
        return Alcance;
    }


    public void setAlcance(boolean Alcance) {
        this.Alcance = Alcance;
    }

    public Propiedad() {
        
    }
    
     public Propiedad(String n) {
         Nombre=n;      
    }

    public Object getValor() {
        return Valor;
    }

    public void setValor(Object Valor) {
        this.Valor = Valor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Object getTipo() {
        return tipo;
    }

    public void setTipo(Object tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "("+tipo+')'+Nombre;
    }
    
}
