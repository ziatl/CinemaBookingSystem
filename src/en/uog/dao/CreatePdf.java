/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package en.uog.dao;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
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
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Date;

/**
 *
 * @author aziz
 */
public class CreatePdf {
    
    public static String title;
	public static String name;
	public static Double price;
	

	 public static String createPdf(String userName,String movieTitle,Double moviePrice) throws DocumentException, URISyntaxException, IOException, WriterException{
	        title = movieTitle;
	        name = userName;
	        price = moviePrice;
		 	Document document = new Document();
	        System.out.println(System.getProperty("user.dir"));
	        String home = System.getProperty("user.home");
	        String file = new String(home+"/Downloads/" + userName + ValidationProvider.generateImageName() + ".pdf"); 
	        //Create QrCode
                String data = userName+" "+movieTitle+" "+ new Date();
                int size = 400;

                // encode
                BitMatrix bitMatrix = generateMatrix(data, size);
                System.out.println("code"+bitMatrix.toString());
		String imageFormat = "png";
                String outputFileName = home+"/Downloads/"+"qrcode-01." + imageFormat;   
                writeImage(outputFileName, imageFormat, bitMatrix);
                Image imgQR = Image.getInstance(home+"/Downloads/qrcode-01.png");
		        imgQR.scalePercent(30);
                //
                
                PdfWriter.getInstance(document  , new FileOutputStream(file));
	        document.open();
	        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
	        Chunk chunkOwner = new Chunk("Owner : "+name, font);
	        Paragraph paragraphMovie = new Paragraph();
	        Chunk chunkMovie = new Chunk("Movie : "+title, font);
	        paragraphMovie.add(chunkMovie);
	        Paragraph paragraph = new Paragraph();
                System.out.println(new File("").getAbsolutePath());
	        Image img = Image.getInstance("images/titi_logo.png");
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
                
                paragraph.add(new Paragraph(new Chunk(" ", font)));
                paragraph.add(new Paragraph(new Chunk(" ", font)));
                document.add(imgQR);


	        document.close();
                return file;
	    }
 	
	 	private static void addCustomRows(PdfPTable table) throws URISyntaxException, BadElementException, IOException {
	 			//Path path = Paths.get(ClassLoader.getSystemResource("titi_logo.png").toURI());
	 			Font font = FontFactory.getFont(FontFactory.COURIER, 20, BaseColor.BLACK);
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
	 		        cell = new PdfPCell(new Phrase((new Chunk(price+"‎£", FontFactory.getFont(FontFactory.COURIER,18)))));
	 		        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
	 		        table.addCell(cell);
	 		       cell = new PdfPCell(new Phrase((new Chunk("Total", FontFactory.getFont(FontFactory.COURIER_BOLD,18)))));
	 		        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
	 		        table.addCell(cell);
	 		       cell = new PdfPCell(new Phrase((new Chunk(price+"‎£", FontFactory.getFont(FontFactory.COURIER_BOLD,18)))));
	 		        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
	 		       table.addCell(cell); 			    
     }
                
     private static void writeImage(String outputFileName, String imageFormat, BitMatrix bitMatrix) throws IOException  {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(outputFileName));
         MatrixToImageWriter.writeToStream(bitMatrix, imageFormat, fileOutputStream);
        fileOutputStream.close();
    }
	private static BitMatrix generateMatrix(String data, int size) throws WriterException {
        BitMatrix bitMatrix = new QRCodeWriter().encode(data, BarcodeFormat.QR_CODE, size, size);
        return bitMatrix;
    }
}
