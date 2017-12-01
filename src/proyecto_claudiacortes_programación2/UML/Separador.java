/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2.UML;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Claudia Cortes
 */
public class Separador extends JLabel {
boolean POS;

    public boolean isPOS() {
        return POS;
    }

    public void setPOS(boolean POS) {
        this.POS = POS;
    }
    UML Dato1;
    UML Dato2;

    public Separador(int Num, int Num2) {
        super();
        if (Num2==1) {
            this.setOpaque(true);
        this.getName();
       this.setName("lbl_separador" + Num);
        this.setText("Separador");
        this.setBackground(Color.black);
         this.setHorizontalTextPosition(SwingConstants.CENTER);
         this.setIcon(new ImageIcon(".\\src\\Imagenes\\UML\\separador.png")); // NOI18N
        this.setSize(6, 100);
        }else{
        this.getName();
        this.setOpaque(true);
        this.setName("lbl_Vseparador" + Num);
         this.setText("VSeparador");
       this.setBackground(Color.BLACK);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        this.setIcon(new ImageIcon(".\\src\\Imagenes\\UML\\separadorV.png")); // NOI18N
             this.setSize(100, 6);
        }
         this.setLocation(10, 200);
        this.setMaximumSize(new java.awt.Dimension(100, 100));
        this.setMinimumSize(new Dimension(100, 100));
        this.setLocation(new Point(20, 20));
        this.setPreferredSize(new Dimension(50, 50));

    }

    public UML getDato1() {
        return Dato1;
    }

    public void setDato1(UML Dato1) {
        this.Dato1 = Dato1;
    }

    public UML getDato2() {
        return Dato2;
    }

    public void setDato2(UML Dato2) {
        this.Dato2 = Dato2;
    }

public void GenerarCodigo(){
        
    } 


}
