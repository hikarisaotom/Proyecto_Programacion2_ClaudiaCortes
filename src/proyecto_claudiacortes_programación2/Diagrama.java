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
        String Constructor="";
           String Constructor_1="";
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
        String Codigo="//----------------------------INICIO DE LA CLASE----------------------------\n"
                + "#include<iostream>\n"
                + " #include <string> \n"
                + " using namespace std;\n"
                + "";
        String Public="\n public:\n";
       String Private="\n private:\n";
       String Protected="\n protected: \n";
      
        Codigo+="class "+Clase.getNombre()+Heredados+"{";
        for (Propiedad propiedad : Clase.getPropiedades()) {
            if (propiedad.getAlcance()==1) {
                String Tipo=""+propiedad.getTipo();
                Public+=Tipo.toLowerCase()+" "+propiedad.getNombre()+";\n";
                
            }else if (propiedad.getAlcance()==2){
                 String Tipo=""+propiedad.getTipo();
                Private+=Tipo.toLowerCase()+" "+propiedad.getNombre()+";\n";
            }else if (propiedad.getAlcance()==3){
                 String Tipo=""+propiedad.getTipo();
                Protected+=Tipo.toLowerCase()+" "+propiedad.getNombre()+";\n";
            }
        }
        
        for (Metodo propiedad : Clase.getMetodos()) {
            String Parametros = "";
//            for (int i = 0; i < propiedad.getParametros().size(); i++) {
//                if (i == propiedad.getParametros().size()-1) {
//                    Parametros += propiedad.getParametros().get(i).getTipo()+");\n\n";
//                } else {
//                    Parametros += propiedad.getParametros().get(i).getTipo()+ ", ";
//                }
//            }
    
            for (int i = 0; i < propiedad.getParametros().size(); i++) {
                  String Tipo=""+propiedad.getParametros().get(i).getTipo();
                if (i == propiedad.getParametros().size() - 1) {
                  
                    Parametros +=  Tipo.toLowerCase()+ " " + propiedad.getParametros().get(i).getNombre() + ");\n";
                } else {
                    Parametros += Tipo.toLowerCase() + " " + propiedad.getParametros().get(i).getNombre() + ", ";
                }
            }
             String Tipo=""+propiedad.getT_return();
            if (propiedad.getAlcance() == 1) {
                Public += "//Metodo\n\n"+Tipo.toLowerCase() + " " + propiedad.getNombre() + "(" + Parametros;
            } else if (propiedad.getAlcance() == 2) {
                Private += "//Metodo\n\n" +Tipo.toLowerCase() + " " + propiedad.getNombre() + "(" + Parametros;
            } else if (propiedad.getAlcance() == 3) {
                Protected +=  "//Metodo\n\n"+Tipo.toLowerCase()+ " " + propiedad.getNombre() + "(" + Parametros;
            }
             
        }
      
        String Constructores="//CONSTRUCTORES: \n\n";
        Constructores+="//Simple\n"
                + Clase.getNombre()+"(){\n}\n";
        Constructores+="//SobreCargado\n";
        for (int i = 0; i <Clase.getPropiedades().size(); i++) {
            Constructor+=Clase.getPropiedades().get(i).getNombre()+"=D_"+i+"; \n";
            if (i==Clase.getPropiedades().size()-1) {
                String Tipo=""+Clase.getPropiedades().get(i).getTipo();
                Constructor_1+=Tipo.toLowerCase()+" D_"+i;
            }else{
                 Constructor_1+=Clase.getPropiedades().get(i).getTipo()+" D_"+i+", ";
            }
        }
        Constructores+=Clase.getNombre()+"("+Constructor_1+"){\n"+
                Constructor+"}\n\n";
            Constructores+="//Destructor\n ~"+Clase.getNombre()+"()\n\n}\n}\n";
        
        Codigo += Public + Private + Protected+Constructores+"\n//----------------------------FIN DE LA CLASE----------------------------";
        return Codigo;
    }
}
