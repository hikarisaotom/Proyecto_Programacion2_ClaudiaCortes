/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;

import javax.swing.JTree;

/**
 *
 * @author Claudia Cortes
 */
public class Diagrama extends JTree{
    Clase Clase;

    public Clase getClase() {
        return Clase;
    }

    public void setClase(Clase Clase) {
        this.Clase = Clase;
    }
    
    public String GenereraCodigo(){
        String Codigo="";
        String Public="\n public:";
       String Private="\n private:";
        Codigo+="class "+Clase.getNombre()+"{";
        for (Propiedad propiedad : Clase.getPropiedades()) {
            if (propiedad.getAlcance()) {
                Public+=propiedad.getTipo()+" "+propiedad.getNombre()+";\n";
            }else{
                Private+=propiedad.getTipo()+" "+propiedad.getNombre()+";\n";
            }
        }
        Codigo+=Public+Private+"};";
        return Codigo;
    }
}
