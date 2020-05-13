package leitorxlsx;


import java.util.Date;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import view.Inicial;
import view.Saida;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*---------------------------------------------------*/
               /*teste groupby*/
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.poi.ss.usermodel.DataFormatter;
/*---------------------------------------------------*/
/**
 *
 * @author Anderson Cardoso
 */
public class TaskTime {
    public static void main(String[] args) throws InterruptedException, IOException{
    Inicial main = new Inicial();
    main.setVisible(true);
    int index = 0;
    DataFormatter formatter = new DataFormatter();
   
    try{
        for (int i = 0;i<=1;i++ ){
        Thread.sleep(-0,001);
        main.lblPcn.setText(Integer.toString(i)+"%");
        JFileChooser chooser = new JFileChooser();
        if (i==1) {
        main.dispose();
        chooser.show();
        chooser.setDialogTitle("Selecione o arquivo");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".xlsx","xlsx");
        chooser.setFileFilter(filter);
        chooser.showOpenDialog(null);
        File p = chooser.getSelectedFile().getAbsoluteFile();
        String filename = p.getAbsolutePath();
        String processa = filename;
        Saida texto = new Saida();
        
        
                  
        try{
            //*cria o file com a variável que o carrega*//
            FileInputStream file = new FileInputStream(new File(processa));
            //*Cria um workbook com todas as abas da planilha*//
            Workbook workbook = new XSSFWorkbook(file);
            XSSFSheet sh = (XSSFSheet) workbook.getSheetAt(index);
            //*declarando o arraylist que irá armazenar os dados compilados*//
            //*ArrayList cartoriosgr = new ArrayList<>();*//
            //*recupera todas as linhas da planilha*//
            Iterator<Row> rowIterator = sh.iterator();
            //*Varre todas as ilnhas da planilha//*
            while(rowIterator.hasNext()){
                //*recebe cada linha recuperada*//
                Row row = rowIterator.next();
                if (row.getRowNum()<2){
                continue;                
                }                //*retorna todas as células da linha selecionada*//
                Iterator<Cell> cellIterator = row.iterator();
                /*Monta a tabela virtual da classe cartórios com os dados coletados da planilha*/
                
                ArrayList<Cartorios> cartorios = new ArrayList<Cartorios>();
                Cartorios cartorio = new Cartorios();
                cartorios.add(cartorio);
                while(cellIterator.hasNext()){
                //*recebe cada celula recuperada*//
                Cell cel = cellIterator.next();
                switch (cel.getColumnIndex()) {
                case 0:
                cartorio.setCartorio(cel.getStringCellValue());
                break;
                case 1:
                cartorio.setData(cel.getStringCellValue());
                break;
                case 2:
                cartorio.setProtocolo((int)cel.getNumericCellValue());
                break;
                case 3:
                cartorio.setCustas (cel.getStringCellValue());
                break;
                }
                
                /*switch(cel.getCellType()){
                 case Cell.CELL_TYPE_STRING:
                 break;}*/
               texto.show();
               texto.txtSaida.setLineWrap(true);
               /*texto.txtSaida.append(cel+"\n");*/
               
               
               for (Cartorios compilado :cartorios) {
               texto.txtSaida.append(compilado.getCartorio()); /*+ ” – ” + compilado.getData() + ” – ” + compilado.getProtocolo()+ ” – ” + compilado.getCustas());*/
               System.out.println(cartorios);
               } 
                file.close();
                }
                
                }
              }catch (FileNotFoundException e) {
                e.printStackTrace();}
        }
            
            } 
        }catch (FileNotFoundException e) {
                e.printStackTrace();}
}
    
}