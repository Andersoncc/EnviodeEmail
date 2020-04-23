package leitorxlsx;


import java.util.Date;
/*https://www.redspark.io/lendocriando-planilhas-excel-em-java-com-a-biblioteca-apache-poi*/
public class Cartorios {
    String cartorios;
    Date datasolicitacao;
    String protocolo;
    Boolean custasinformadas;

public Cartorios(String cartorios, Date datasolicitacao,
    String protocolo, Boolean custasinformadas){
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
    public boolean getCustas(){
        return custasinformadas;}
    public void setCustas(boolean custasinformadas){
        this.custasinformadas = custasinformadas;}
}

