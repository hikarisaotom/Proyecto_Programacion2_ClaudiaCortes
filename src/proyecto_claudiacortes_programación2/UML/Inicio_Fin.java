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
public class Inicio_Fin extends JLabel{

public void GenerarCodigo(){
        
    } 

    public Inicio_Fin(int Num) {
        this.setOpaque(true);
        this.getName();
        this.setName("lbl_inicio_fin" + Num);
        this.setHorizontalTextPosition(SwingConstants.CENTER);
        if (Num == 0) {
            this.setText("Inicio");
            this.setBackground(Color.MAGENTA);
        } else {
            this.setText("Fin");
            this.setBackground(Color.RED);
        }
//             String Nombre =  this.getName();
        this.setLocation(10, 200);
        this.setIcon(new ImageIcon(".\\src\\Imagenes\\UML\\in_fin.png")); // NOI18N
        this.setMaximumSize(new java.awt.Dimension(100, 100));
        this.setMinimumSize(new Dimension(100, 100));
        this.setLocation(new Point(20, 20));
        this.setPreferredSize(new Dimension(50, 50));
        this.setSize(100, 61);
    }
}
