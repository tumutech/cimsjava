package com.bse2.projects;
import com.itextpdf.text.Document;

import com.itextpdf.text.Paragraph;

import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.cj.xdevapi.Table;

import java.io.FileOutputStream;
import java.util.Scanner;
public class printpdf {
    Tableviewupdate mytable = new Tableviewupdate();
    public void pdf(){
        Document document = new Document();
        Scanner filename = new Scanner(System.in);
        System.out.println("enter file name:");
        String infilename = filename.nextLine();
        try
        {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(infilename+".pdf"));
            document.open();
            document.add(new Tableviewupdate().data.size());
            //Set attributes here
            document.addAuthor("Tumutech");
            document.addCreationDate();
            document.addCreator("admin");
            document.addTitle("Report ");
            document.addSubject("Pdf Generation");

            document.close();
            writer.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
