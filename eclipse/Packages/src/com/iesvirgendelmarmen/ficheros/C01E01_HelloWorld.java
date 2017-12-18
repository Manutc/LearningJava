package com.iesvirgendelmarmen.ficheros;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
//import com.itextpdf.test.annotations.WrapToTest;
 
import java.io.File;
import java.io.IOException;

public class C01E01_HelloWorld {
	 
    public static final String DEST = "ficherosPDF/hello_world.pdf";
 
    public static void main(String args[]) throws IOException {
        File file = new File(DEST);
        //file.getParentFile().mkdirs();
        new C01E01_HelloWorld().createPdf(DEST);
    }
 
    public void createPdf(String dest) throws IOException {
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(dest);
 
        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);
 
        // Initialize document
        Document document = new Document(pdf);
 
        //Add paragraph to the document
        document.add(new Paragraph("Hola mundo"));
        document.add(new Paragraph("Siguiente parrafo"));
 
        //Close document
        document.close();
    }
}