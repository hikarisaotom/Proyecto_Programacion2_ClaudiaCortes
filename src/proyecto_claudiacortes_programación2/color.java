/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.TransferHandler;

/**
 *
 * @author Claudia Cortes
 */
public class color extends JLabel{

    public color() {
        System.out.println("CREO LA ETIQUETA");
    }
    
     MouseListener ml=new  MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                System.out.println("CLICK!");
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
}
