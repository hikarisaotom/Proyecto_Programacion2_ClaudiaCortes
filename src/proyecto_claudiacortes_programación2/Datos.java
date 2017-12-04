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
public class Datos extends JLabel{
   Propiedad P;

public String  GenerarCodigo(){
    /*Integer
String
Double
Long
*/
        String Codigo = "";
        Codigo += "cout << \"Introduce un numero entero: \"; \n";
        if (P.getTipo() == "Integer" || P.getTipo() == "Double" || P.getTipo() == "Long") {
            Codigo += " cin >>" + P.getNombre() + ";";
            Codigo += "cin.ignore(numeric_limits<int>::max(),'\\n');\n";
        } else if (P.getTipo() == "String") {
            Codigo += " cin >>" + P.getNombre() + ";\n";
            Codigo += "  cin.get(c);";
        }else{
              Codigo += " cin >>" + P.getNombre() + ";\n";
            Codigo += "  cin.get(c);";
        }
        return Codigo;

   }

    
public Propiedad getP() {
        return P;
    }

    public void setP(Propiedad P) {
        this.P = P;
    }

}
