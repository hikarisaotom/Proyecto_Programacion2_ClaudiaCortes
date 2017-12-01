/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Claudia Cortes
 */
public class Adm_UML {

    private ArrayList<JLabel> listaelementos = new ArrayList();
    private File archivo = null;

    public Adm_UML(String path) {
        archivo = new File(path);
    }

    public void AgregarUML(JLabel UML) {
        listaelementos.add(UML);
    }

    public ArrayList<JLabel> getListaelementos() {
        return listaelementos;
    }

    public void setListaelementos(ArrayList<JLabel> listaelementos) {
        this.listaelementos = listaelementos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void CargarArchivo() {
        try {
            listaelementos = new ArrayList();
            JLabel temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (JLabel) objeto.readObject()) != null) {
                        listaelementos.add(temp);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }

    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Object UML : listaelementos) {
                bw.writeObject(UML);
            }
            bw.flush();
        } catch (Exception e) {

        }
        bw.close();
        fw.close();
    }

}
