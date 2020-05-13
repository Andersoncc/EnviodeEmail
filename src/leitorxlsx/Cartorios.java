package leitorxlsx;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.apache.poi.ss.usermodel.DataFormatter;
/*https://www.redspark.io/lendocriando-planilhas-excel-em-java-com-a-biblioteca-apache-poi*/
public class Cartorios {
    String cartorios;
    Date datasolicitacao;
    String protocolo;
    int custasinformadas;
    DataFormatter df = new DataFormatter();
    
public Cartorios(){};
public Cartorios(String cartorios, Date datasolicitacao,
    String protocolo, int custasinformadas){
    super();
    this.cartorios = cartorios;
    this.datasolicitacao = datasolicitacao;
    this.protocolo = protocolo;
    this.custasinformadas = custasinformadas;
}    
    public String getCartorio(){
        return cartorios;}
    public void setCartorio(String cartorios){
        this.cartorios = cartorios;}
    public Date getData(){
        return datasolicitacao;}
    public void setData(Date datasolicitacao){
        this.datasolicitacao = datasolicitacao;}
    public String getProtocolo(String protocolo){
        return protocolo;}
    public void setProtocolo(String protocolo){
        this.protocolo = protocolo;}
    public int getCustas(){
        return custasinformadas;}
    public void setCustas(int custasinformadas){
        this.custasinformadas = custasinformadas;}

    
}

