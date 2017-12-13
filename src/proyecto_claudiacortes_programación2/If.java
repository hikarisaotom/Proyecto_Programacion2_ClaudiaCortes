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
public class If extends JLabel implements Serializable {
private JLabel si;
private JLabel no;
private String Condicion;
 private static final long SerialVersionUID=3695L;
 private ArrayList <JLabel> Contenido= new ArrayList();
    public ArrayList<JLabel> getContenido() {
        return Contenido;
    }

    public void setContenido(ArrayList<JLabel> Contenido) {
        this.Contenido = Contenido;
    }
    
    public void AgregarElemento(JLabel Label){
        Contenido.add(Label);
    }





    public String getCondicion() {
        return Condicion;
    }

    public void setCondicion(String Condicion) {
        this.Condicion = Condicion;
    }

  
    public String GenerarCodigo() {
        String Codigo = "";
        //System.out.println("EL ESTADO ES: " + this.isEstado());
System.out.println("EL NO"+this.getNo());
            Codigo += "if(" + this.getText() + "){\n";
            Codigo += Codigo(this.getSi(), Codigo);
            if (no == null) {
                Codigo += "\n}";
            } else {
                Codigo += "\n}else{\n";
                Codigo += Codigo(this.getNo(), Codigo);
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
        }
        return c;
    }

    @Override
    public String toString() {
        return "If{" +this.getName() +", Contenido=" + Contenido + '}';
    }
  
}
