package leitorxlsx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


 
public class LeitorXlsx {
    public  void main(String[] args){
        
        FileInputStream filplanilha = null;
        String processa = new String();
        
        
        
                  
        try{
            File arq = new File(processa);
            
            filplanilha = new FileInputStream(arq);
            //*Cria um workbook com todas as abas da planilha*//
            XSSFWorkbook workbook = new XSSFWorkbook(filplanilha);
            
            //*Recuperar a aba 1*//
            XSSFSheet resul = workbook.getSheetAt(0);
            
            //*recupera todas as linhas da planilha*//
            Iterator<Row> rowIterator = resul.iterator();      
            
            //*Varre todas as ilnhas da planilha//*
            while(rowIterator.hasNext()){
                //*recebe cada linha recuperada*//
                Row row = rowIterator.next();
                
                //*retorna todas as células da linha selecionada*//
                Iterator<Cell> cellIterator = row.iterator();
                
                while(cellIterator.hasNext()){
                
                //*recebe cada celula recuperada*//
                Cell cel = cellIterator.next();
                
                switch(cel.getCellType()){
                    case Cell.CELL_TYPE_STRING:
                        System.out.println(cel.getStringCellValue());
                }}
                  
                
            }
        
        } catch (FileNotFoundException ex){
            Logger.getLogger(LeitorXlsx.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeitorXlsx.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try{
                filplanilha.close();
            } catch (IOException ex) {
                Logger.getLogger(LeitorXlsx.class.getName()).log(Level.SEVERE, null, ex);
            
            }
            
            }            

    }
    
    
    
}
