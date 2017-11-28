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
                   /*0-Package
                    1-Public
                    2-Private
                    3-Protected*/
                 //System.out.println(propiedad.getAlcance());
            if (propiedad.getAlcance()==1) {
                Public+=propiedad.getTipo()+" "+propiedad.getNombre()+";\n";
            }else if (propiedad.getAlcance()==2){
                Private+=propiedad.getTipo()+" "+propiedad.getNombre()+";\n";
            }else if (propiedad.getAlcance()==3){
                Protected+=propiedad.getTipo()+" "+propiedad.getNombre()+";\n";
            }
        }
        Codigo+=Public+Private+Protected+"};\n";
        return Codigo;
    }
}
