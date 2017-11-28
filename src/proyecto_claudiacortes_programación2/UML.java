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
public class UML extends JLabel{
    private String Tipo = "";
    protected int POSx;
    protected int POSy;
        
    public UML() {
         
         
    }


    
 
    public String getTipo() {
        return Tipo;
    }

    public void setTipo() {
        //this.Tipo = this.getText();
    }
    
    public void GenerarCodigo(){
        
    }
    
    public void AgarrarDatos(UML Label) {
        POSx = Label.getX();
        POSy = Label.getY();
    }
}
