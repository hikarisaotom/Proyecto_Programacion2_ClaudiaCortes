/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Claudia Cortes
 */
public class Datos extends JLabel {
   Propiedad P;
ArrayList<Propiedad> Propiedades= new ArrayList();
public String  GenerarCodigo(){
    /*Integer
String
Double
Long
*/
        String Codigo = "";
        
      for (Propiedad P : Propiedades) {
        if (P.getTipo() == "Integer" || P.getTipo() == "Double" || P.getTipo() == "Long") {
            Codigo += "cout << \"Introduce un numero entero: \"; \n";
            Codigo += " cin >>" + P.getNombre() + ";";
            Codigo += "cin.ignore(numeric_limits<int>::max(),'\\n');\n";
        } else if (P.getTipo() == "String") {
            Codigo += "cout << \"Introduce una Palabra: \"; \n";
            Codigo += " cin >>" + P.getNombre() + ";\n";
            //Codigo += "  cin.get(c);";
        } else {
            Codigo += "cout << \"Ingrese un dato del tipo: "+ P.getTipo()+"\"; \n";
            Codigo += " cin >>" + P.getNombre() + ";\n";
            //Codigo += "  cin.get(c);";
        }
    }//FIN DEL FOR
        return Codigo;

   }
public void AgregarPropiedad(Propiedad p){
    Propiedades.add(p);
}

    public ArrayList<Propiedad> getPropiedades() {
        return Propiedades;
    }
    
public Propiedad getP() {
        return P;
    }

    public void setP(Propiedad P) {
        this.P = P;
    }

    @Override
    public String toString() {
        return "Datos{"+this.getName() + "P=" + P + '}';
    }

}
