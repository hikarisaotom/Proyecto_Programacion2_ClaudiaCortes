/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Claudia Cortes
 */
public class SubProceso extends JLabel implements Serializable{

    public ArrayList<JLabel> getContenido() {
        return Contenido;
    }

    public void setContenido(ArrayList<JLabel> Contenido) {
        this.Contenido = Contenido;
    }
    public void AgregarElemento(JLabel Etiqueta){
        Contenido.add(Etiqueta);
    }
     private static final long SerialVersionUID=3696L;
     private ArrayList <JLabel> Contenido= new ArrayList();
    public String GenerarCodigo(){
        String Codigo="";
        Codigo += "while(" + this.getText() + "){\n";
            for (int i = 0; i < Contenido.size(); i++) {
                Codigo += Codigo(Contenido.get(i), Codigo);
            }
             Codigo +="}";
        return Codigo;
    }  
     private String Codigo(JLabel Tipo, String Codigo) {
      String c="";
        if (Tipo instanceof Datos) {
           Datos P=((Datos) Tipo);
            c= P.GenerarCodigo();
        } else if (Tipo instanceof Proceso) {
         Proceso P=((Proceso) Tipo);
            c= P.GenerarCodigo();
        } else if (Tipo instanceof SubProceso) {
         SubProceso P=((SubProceso) Tipo);
             c= P.GenerarCodigo();
        } else if (Tipo instanceof Documento) {
         Documento P=((Documento) Tipo);
            c= P.GenerarCodigo();
        }else if (Tipo instanceof If){
            If P = ((If) Tipo);
            c = P.GenerarCodigo();
        }
        return c;
    }
}
