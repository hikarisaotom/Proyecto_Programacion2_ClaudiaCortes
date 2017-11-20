/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 *
 * @author Claudia Cortes
 */
public class Lab extends JFrame{
    JLabel pic1,pic2,pic3;
    public Lab(){
        super("Prueba de Imagenes DRag And drop");
        pic1 = new JLabel();
        pic2 = new JLabel();
        pic3 = new JLabel();
        pic1.setBounds(20, 30, 100, 100);
        pic2.setBounds(250, 30, 100, 100);
        pic3.setBounds(20, 140, 100, 100);
        pic1.setIcon(new ImageIcon("C:\\Users\\Claudia Cortes\\Desktop\\Proyecto_ClaudiaCortes_Programacion2\\Proyecto_ClaudiaCortes_Programación2\\src\\Imagenes\\avatar-1.png"));
        pic2.setIcon(new ImageIcon("C:\\Users\\Claudia Cortes\\Desktop\\Proyecto_ClaudiaCortes_Programacion2\\Proyecto_ClaudiaCortes_Programación2\\src\\Imagenes\\bar-chart.png"));
        pic3.setIcon(new ImageIcon("C:\\Users\\Claudia Cortes\\Desktop\\Proyecto_ClaudiaCortes_Programacion2\\Proyecto_ClaudiaCortes_Programación2\\src\\Imagenes\\battery-1.png"));
       MouseListener ml=new  MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                
            }

            @Override
            public void mousePressed(MouseEvent me) {
               JComponent jc=( JComponent)me.getSource();
               TransferHandler th = jc.getTransferHandler();
               th.exportAsDrag(jc, me, TransferHandler.COPY);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        };
       
        pic1.addMouseListener(ml);
        pic2.addMouseListener(ml);
        pic3.addMouseListener(ml);
        pic1.setTransferHandler(new TransferHandler("icon"));
        pic2.setTransferHandler(new TransferHandler("icon"));
        pic3.setTransferHandler(new TransferHandler("icon"));


        add(pic1);
        add(pic2);
        add(pic3);
        setLayout(null);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
