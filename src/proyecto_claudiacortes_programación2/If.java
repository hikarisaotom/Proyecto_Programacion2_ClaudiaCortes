/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;

import javax.swing.JLabel;

/**
 *
 * @author Claudia Cortes
 */
public class If extends JLabel{
JLabel si;
JLabel no;
String Condicion;

    public String getCondicion() {
        return Condicion;
    }

    public void setCondicion(String Condicion) {
        this.Condicion = Condicion;
    }

  
    public String GenerarCodigo() {
        String Codigo = "";
        Codigo += "If(" + this.getText() + "){\n";
        if (si instanceof Datos) {
            Datos P=(Datos) si; 
            Codigo += P.GenerarCodigo();
        } else if (si instanceof Proceso) {
             Proceso P=(Proceso) si; 
            Codigo += P.GenerarCodigo();
        }
        if (no == null) {
            Codigo += "\n}";
        } else {
             Codigo += "\n}else{\n";
            if (no instanceof Datos) {
                Datos P=(Datos) no; 
                Codigo += P.GenerarCodigo();
            } else if (no instanceof Proceso) {
                   Proceso P=(Proceso) no; 
                Codigo += P.GenerarCodigo();
            }
             Codigo += "\n}";
        }
       
        return Codigo;
    }

    public JLabel getSi() {
        return si;
    }

    public void setSi(JLabel si) {
        this.si = si;
    }

    public JLabel getNo() {
        return no;
    }

    public void setNo(JLabel no) {
        this.no = no;
    }

}
