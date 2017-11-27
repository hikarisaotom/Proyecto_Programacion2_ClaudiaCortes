/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;

import java.util.ArrayList;

/**
 *
 * @author Claudia Cortes
 */
public class Clase {
    String  Nombre;
    ArrayList<Propiedad> Propiedades= new ArrayList();

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


    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
