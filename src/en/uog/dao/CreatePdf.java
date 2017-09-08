/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.dao;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.ElementList;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author aziz
 */
public class CreatePdf {
    
    public static String title;
	public static String name;
	public static Double price;
	

	 public static void createPdf(String userName,String movieTitle,Double moviePrice) throws DocumentException, URISyntaxException, IOException{
	        title = movieTitle;
	        name = userName;
	        price = moviePrice;
		 	Document document = new Document();
	        System.out.println(System.getProperty("user.dir"));
	        String home = System.getProperty("user.home");
	        String file = new String(home+"/Downloads/" + userName + ValidationProvider.generateImageName() + ".pdf"); 
	        PdfWriter.getInstance(document  , new FileOutputStream(file));
	        document.open();
	        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
	        Chunk chunkOwner = new Chunk("Owner : "+name, font);
	        Paragraph paragraphMovie = new Paragraph();
	        Chunk chunkMovie = new Chunk("Movie : "+title, font);
	        paragraphMovie.add(chunkMovie);
	        Paragraph paragraph = new Paragraph();
	        Image img = Image.getInstance("Images/titi_logo.png");
			img.scalePercent(10);
			paragraph.add(new Paragraph(new Chunk(" ", font)));
			paragraph.add(new Paragraph(new Chunk(" ", font)));
			document.add(paragraph);
			document.add(img);
			
	        paragraph = new Paragraph();
	        paragraph.setLeading(80, 0);
	        PdfPTable table = new PdfPTable(2);
	        
	        paragraph.add(chunkOwner);
	        //paragraph.add(new Paragraph(new Chunk(" ", font)));
	        paragraph.add(new Paragraph(new Chunk(" ", font)));
	        
	        paragraph.add(new Paragraph(new Chunk("Movie : "+title, font)));
	        paragraph.add(new Paragraph(new Chunk(" ", font)));
	        paragraph.add(new Paragraph(new Chunk(" ", font)));
	      //  addRows(table);
	        addCustomRows(table);
	        document.add(paragraph);
	        document.add(table);


	        document.close();
	    }
 	
	 	private static void addCustomRows(PdfPTable table) throws URISyntaxException, BadElementException, IOException {
	 			    //Path path = Paths.get(ClassLoader.getSystemResource("titi_logo.png").toURI());
	 			    Image img = Image.getInstance("images/titi_logo.png");
	 			    img.scalePercent(10);
	 			   Font font = FontFactory.getFont(FontFactory.COURIER, 20, BaseColor.BLACK);
	 			    PdfPCell imageCell = new PdfPCell(img);
	 			    //table.addCell(imageCell);
	 			   PdfPCell cell;
	 			   cell = new PdfPCell(new Phrase(new Chunk("ABSTRACT", font)));
	 		        cell.setColspan(3);
	 		        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	 		        table.addCell(cell);
	 		       cell = new PdfPCell(new Phrase("Quantity"));
	 		        cell.setRowspan(1);
	 		        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	 		        table.addCell(cell);
		        
	 		        cell = new PdfPCell(new Phrase("Price"));
	 		        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	 		       table.addCell(cell);
	 		       
	 		       cell = new PdfPCell(new Phrase((new Chunk("1", FontFactory.getFont(FontFactory.COURIER,18)))));
	 		        cell.setRowspan(1); 
	 		       cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	 		        table.addCell(cell);
	 		        // we add the four remaining cells with addCell()
	 		        cell = new PdfPCell(new Phrase((new Chunk(price+"$", FontFactory.getFont(FontFactory.COURIER,18)))));
	 		        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
	 		        table.addCell(cell);
	 		       cell = new PdfPCell(new Phrase((new Chunk("Total", FontFactory.getFont(FontFactory.COURIER_BOLD,18)))));
	 		        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	 		        table.addCell(cell);
	 		       cell = new PdfPCell(new Phrase((new Chunk(price+"$", FontFactory.getFont(FontFactory.COURIER_BOLD,18)))));
	 		        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
	 		       table.addCell(cell); 			    
     }
}
