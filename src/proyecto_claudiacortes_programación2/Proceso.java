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
public class Proceso extends JLabel{
   Propiedad p;

    public Propiedad getP() {
        return p;
    }

    public void setP(Propiedad p) {
        this.p = p;
    }
   
    public String GenerarCodigo() {
        String Codigo = "";
        if (p != null) {
            Codigo += " cout << \""+ this.getText() +"\" << "+ p.getNombre() + " << endl; //EL SOUT \n"; 
        }else{
                Codigo += " cout << \"" + this.getText()+"\"; //EL SOUT\n";
        }
        return Codigo;
    }
}
