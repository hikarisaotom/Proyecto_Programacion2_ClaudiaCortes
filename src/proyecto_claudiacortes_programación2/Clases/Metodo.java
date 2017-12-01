/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2.Clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Claudia Cortes
 */
public class Metodo implements Serializable{
    private String Nombre;
    private ArrayList<Propiedad>Parametros=new ArrayList();
    private String T_return ;
    private int Alcance;
 private static final long SerialVersionUID=252525L;
    public int getAlcance() {
        return Alcance;
    }

    public void setAlcance(int Alcance) {
        this.Alcance = Alcance;
    }

    public String getT_return() {
        return T_return;
    }

    public void setT_return(String T_return) {
        this.T_return = T_return;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Propiedad> getParametros() {
        return Parametros;
    }

    public void setParametros(ArrayList<Propiedad> Parametros) {
        this.Parametros = Parametros;
    }

    public Metodo() {
    }
public void AgregarAparametro(Propiedad p){
}
    @Override
    public String toString() {
        return "("+T_return+")"+Nombre;
    }


    
}
