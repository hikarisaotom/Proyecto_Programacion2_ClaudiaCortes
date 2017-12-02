/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_claudiacortes_programación2;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

/**
 *
 * @author Claudia Cortes
 */
public class GenerarPDF {

    public GenerarPDF() {
    }

    private Font fuenteb = new Font(Font.FontFamily.COURIER, 10, Font.BOLD);
    private Font fuenten = new Font(Font.FontFamily.COURIER, 10, Font.NORMAL);
    private Font fuentei = new Font(Font.FontFamily.COURIER, 10, Font.ITALIC);

    public void GenerarPDF(String header, String info, String Footer, String rutaimg,String Salida) {
try{
    Document doc=new Document(PageSize.A4,36,36,10,10);
     PdfWriter.getInstance(doc, new FileOutputStream(Salida));
    doc.open();
    doc.add(getHeader(header));
    Image imagen=Image.getInstance(rutaimg);
    imagen.scaleAbsolute(100, 100);
    imagen.setAlignment(Element.ALIGN_CENTER);
    doc.add(imagen);
    doc.add(getinfo(info));
     doc.add(getFooter(Footer));
    doc.close();
}catch(Exception e){
    
}
    }

    private Paragraph getHeader(String Texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(Texto);
        c.setFont(fuenteb);
        p.add(c);
        return p;
    }

    private Paragraph getFooter(String Texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_RIGHT);
        c.append(Texto);
        c.setFont(fuentei);
        p.add(c);
        return p;
    }

    private Paragraph getinfo(String Texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_JUSTIFIED);
        c.append(Texto);
        c.setFont(fuenten);
        p.add(c);
        return p;
    }

}
