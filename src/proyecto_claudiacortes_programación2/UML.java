/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;

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
    
    
    /**METODOS DE ADMINISTRACION */
       public void PropiedadDatos(int Num, JLabel D) {
        D.setOpaque(true);
        D.getName();
        D.setName("lbldatos" + Num);
        D.setBackground(Color.red);
        D.setHorizontalTextPosition(SwingConstants.CENTER);
        D.setText("Datos");
        D.setLocation(10, 200);
        D.setIcon(new ImageIcon(".\\src\\Imagenes\\UML\\datos.png")); // NOI18N
        D.setMaximumSize(new java.awt.Dimension(100, 100));
        D.setMinimumSize(new Dimension(100, 100));
        D.setLocation(new Point(20, 20));
       D.setPreferredSize(new Dimension(50, 50));
       D.setSize(100, 55);
    }
    public void Documento(int Num, JLabel D) {
        D.setBackground(Color.GREEN);
        D.setLocation(10, 200);
        D.setIcon(new ImageIcon(".\\src\\Imagenes\\UML\\documentos.png"));
        D.setMaximumSize(new java.awt.Dimension(100, 100));
        D.setMinimumSize(new Dimension(100, 100));
        D.setLocation(new Point(20, 20));
        D.setPreferredSize(new Dimension(50, 50));
        D.setSize(100, 68);
        D.setText("Documento");
        D.setOpaque(true);
        D.setHorizontalTextPosition(SwingConstants.CENTER);
        D.setName("lbl_documento" + Num);

    }
     public void If(int Num,JLabel D) {
       D.setOpaque(true);
        D.getName();
       D.setName("lbo_if" + Num);
       D.setText("If");
        D.setHorizontalTextPosition(SwingConstants.CENTER);
        D.setBackground(Color.GRAY);
        D.setLocation(10, 200);
        D.setIcon(new ImageIcon(".\\src\\Imagenes\\UML\\if.png")); // NOI18N
        D.setMaximumSize(new java.awt.Dimension(100, 100));
        D.setMinimumSize(new Dimension(100, 100));
        D.setLocation(new Point(20, 20));
        D.setPreferredSize(new Dimension(50, 50));
        D.setSize(100, 64);
    }
     public void Inicio_Fin(int Num,JLabel D) {
         D.setOpaque(true);
         D.getName();
         D.setName("lbl_inicio_fin" + Num);
         D.setHorizontalTextPosition(SwingConstants.CENTER);
         if (Num == 0) {
           D.setText("Inicio");
             D.setBackground(Color.MAGENTA);
         } else {
             D.setText("Fin");
             D.setBackground(Color.RED);
         }
//             String Nombre =  this.getName();
       D.setLocation(10, 200);
        D.setIcon(new ImageIcon(".\\src\\Imagenes\\UML\\in_fin.png")); // NOI18N
        D.setMaximumSize(new java.awt.Dimension(100, 100));
        D.setMinimumSize(new Dimension(100, 100));
       D.setLocation(new Point(20, 20));
        D.setPreferredSize(new Dimension(50, 50));
       D.setSize(100, 61);
        
    }
     public void Proceso(int Numero, JLabel D) {

       D.setOpaque(true);
       D.getName();
        D.setName("Proceso" + Numero);
       D.setHorizontalTextPosition(SwingConstants.CENTER);
       D.setBackground(Color.BLUE);
        D.setLocation(10, 200);
        D.setIcon(new ImageIcon(".\\src\\Imagenes\\UML\\proceso.png")); // NOI18N
        D.setText("proceso");
       D.setMaximumSize(new java.awt.Dimension(100, 100));
       D.setMinimumSize(new Dimension(100, 100));
       D.setLocation(new Point(20, 20));
        D.setPreferredSize(new Dimension(50, 50));
        D.setSize(100, 65);
    }
     
    public void Separador(int Num, int Num2, JLabel D) {
        if (Num2 == 1) {
            D.setOpaque(true);
            D.getName();
            D.setName("lbl_separador" + Num);
            D.setText("Separador");
            D.setBackground(Color.black);
            D.setHorizontalTextPosition(SwingConstants.CENTER);
            D.setIcon(new ImageIcon(".\\src\\Imagenes\\UML\\separador.png")); // NOI18N
            D.setSize(6, 100);
        } else {
             D.getName();
            D.setName("lbl_Vseparador" + Num);
            D.setText("VSeparador");
            D.setBackground(Color.black);
          
            D.setHorizontalTextPosition(SwingConstants.CENTER);
            D.setIcon(new ImageIcon(".\\src\\Imagenes\\UML\\separadorV.png")); // NOI18N
            D.setSize(100, 6);
        }
        D.setLocation(10, 200);
        D.setMaximumSize(new java.awt.Dimension(100, 100));
        D.setMinimumSize(new Dimension(100, 100));
        D.setLocation(new Point(20, 20));
        D.setPreferredSize(new Dimension(50, 50));

    }
    public void SubProceso(int Num, JLabel D) {
        D.setOpaque(true);
        D.getName();
        D.setName("lbl_subpro" + Num);
        D.setBackground(Color.ORANGE);
        D.setHorizontalTextPosition(SwingConstants.CENTER);
        D.setLocation(10, 200);
        D.setText("Subproceso");
        D.setIcon(new ImageIcon(".\\src\\Imagenes\\UML\\subpro.png")); // NOI18N
        D.setMaximumSize(new java.awt.Dimension(100, 100));
        D.setMinimumSize(new Dimension(100, 100));
        D.setLocation(new Point(20, 20));
        D.setPreferredSize(new Dimension(50, 50));
        D.setSize(100, 64);

    }
    
     public void Copiar(JLabel D, JLabel doc) {
        D.setBackground(doc.getBackground());
        D.setText(doc.getText());
        D.setLocation(10, 200);
        D.setFont(doc.getFont());
        D.setOpaque(true);
        D.setIcon(doc.getIcon());
        D.setHorizontalTextPosition(SwingConstants.CENTER);
        D.setName(doc.getText() + "-copia");
        D.setSize(doc.getWidth(), doc.getHeight());
    }
}
