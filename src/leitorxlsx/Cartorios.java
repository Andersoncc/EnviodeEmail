package leitorxlsx;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/*https://www.redspark.io/lendocriando-planilhas-excel-em-java-com-a-biblioteca-apache-poi*/
public class Cartorios {
    String cartorios;
    String datasolicitacao;
    int protocolo;
    String custasinformadas;
    
public Cartorios(){};
public Cartorios(String cartorios, String datasolicitacao,
    int protocolo, String custasinformadas){
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
    public String getData(){
        return datasolicitacao;}
    public void setData(String datasolicitacao){
        this.datasolicitacao = datasolicitacao;}
    public int getProtocolo(int protocolo){
        return protocolo;}
    public void setProtocolo(int protocolo){
        this.protocolo = protocolo;}
    public String getCustas(){
        return custasinformadas;}
    public void setCustas(String custasinformadas){
        this.custasinformadas = custasinformadas;}

    
}

