/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;

import java.io.Serializable;
import javax.swing.JTree;

/**
 *
 * @author Claudia Cortes
 */
public class Diagrama extends JTree implements Serializable{
    Clase Clase;
 private static final long SerialVersionUID=240214L;
    public Clase getClase() {
        return Clase;
    }

    public void setClase(Clase Clase) {
        this.Clase = Clase;
    }
    
    public String GenereraCodigo(){
        String Heredados="";
        if (Clase.getHeredados().size()>0) {
            Heredados+=":";
            for (int i = 0; i <Clase.getHeredados().size(); i++) {
                if (i==Clase.getHeredados().size()-1) {
                    Heredados+= "Public "+Clase.getHeredados().get(i).getNombre();
                }else{
                     Heredados+= "Public "+Clase.getHeredados().get(i).getNombre()+", ";
                }
            }
        }
        String Codigo="#Include<IOStream>\n";
        String Public="\n public:\n";
       String Private="\n private:\n";
       String Protected="\n protected: \n";
      
        Codigo+="class "+Clase.getNombre()+Heredados+"{";
        for (Propiedad propiedad : Clase.getPropiedades()) {
            if (propiedad.getAlcance()==1) {
                Public+=propiedad.getTipo()+" "+propiedad.getNombre()+";\n";
            }else if (propiedad.getAlcance()==2){
                Private+=propiedad.getTipo()+" "+propiedad.getNombre()+";\n";
            }else if (propiedad.getAlcance()==3){
                Protected+=propiedad.getTipo()+" "+propiedad.getNombre()+";\n";
            }
        }
        for (Metodo propiedad : Clase.getMetodos()) {
            String Parametros = "";
            for (int i = 0; i < propiedad.getParametros().size(); i++) {
                if (i == propiedad.getParametros().size()-1) {
                    Parametros += propiedad.getParametros().get(i).getTipo() + " " + propiedad.getParametros().get(i).getNombre() + "){\n";
                } else {
                    Parametros += propiedad.getParametros().get(i).getTipo() + " " + propiedad.getParametros().get(i).getNombre() + ", ";
                }
            }
            if (propiedad.getAlcance() == 1) {
                Public += propiedad.getT_return() + " " + propiedad.getNombre() + "(" + Parametros;
            } else if (propiedad.getAlcance() == 2) {
                Private += propiedad.getT_return() + " " + propiedad.getNombre() + "(" + Parametros;
            } else if (propiedad.getAlcance() == 3) {
                Protected += propiedad.getT_return() + " " + propiedad.getNombre() + "(" + Parametros;
            }
        }
        Codigo += Public + Private + Protected + "};\n";
        return Codigo;
    }
}
