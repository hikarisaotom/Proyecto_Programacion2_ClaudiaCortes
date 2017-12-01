/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Claudia Cortes
 */
public class Clase implements Serializable{
    String  Nombre;
     private static final long SerialVersionUID=242424L;
    ArrayList<Propiedad> Propiedades= new ArrayList();
     ArrayList<Clase> Heredados= new ArrayList();
    ArrayList<Metodo> Metodos = new ArrayList();
    public Clase() {
    }
      public Clase(String n ) {
    Nombre=n;
      }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return Propiedades;
    }

    public void setPropiedades(ArrayList<Propiedad> Propiedades) {
        this.Propiedades = Propiedades;
    }
    
       public void AgregarPropiedad(Propiedad Propiedades) {
        this.Propiedades.add(Propiedades);
    }

    public ArrayList<Clase> getHeredados() {
        return Heredados;
    }

    public void setHeredados(ArrayList<Clase> Heredados) {
        this.Heredados = Heredados;
    }
 
    public void AgregarHerencia(Clase C){
        Heredados.add(C);
    }

    public ArrayList<Metodo> getMetodos() {
        return Metodos;
    }

    public void setMetodos(ArrayList<Metodo> Metodos) {
        this.Metodos = Metodos;
    }
public void AgregarMetodo(Metodo M){
    Metodos.add(M);
}
    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
