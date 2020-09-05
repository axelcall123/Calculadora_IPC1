
package calculadora;

public class ParaAlmacen {
    private String resultado;
    private String operacion;
    private int Fdia;
    private int Fmes;
    private int hora;
    private int minutos;
    private int otro;
    private int favoritos;
    
    public ParaAlmacen(){
        resultado="";
        operacion="";
        Fdia=0;
        Fmes=0;
        otro=0;
        favoritos=0;
    }
    public ParaAlmacen(String res, String op,int fd,int fm,int hor,int min, int ot,int favo){
        resultado=res;
        operacion=op;
        Fdia=fd;
        Fmes=fm;
        hora=hor;
        minutos=min;
        otro=ot;
        favoritos=favo;
    }
    public String getResultado(){
        return resultado;
    }
    public String getOperacion(){
        return operacion;
    }
    public int getFdia(){
        return Fdia;
    }
    public int getFmes(){
        return Fmes;
    }
    public int getHour(){
        return hora;
    }
    public int getMinute(){
        return minutos;
    }
    public int getOther(){
        return otro;
    }
    public int getFav(){
        return favoritos;
    }
    ///////////////////
    public void setResultado(String resultado){
        this.resultado= resultado;  
    }
    public void setOperacion(String operacion){
        this.operacion= operacion;  
    }
    public void setFdias(int Fdia){
        this.Fdia= Fdia;  
    }
    public void setFmes(int Fmes){
        this.Fmes= Fmes;  
    }
    public void setHour(int hora){
        this.hora= hora;  
    }
    public void setMinute(int minutos){
        this.minutos= minutos;  
    }
    public void setOther(int otro){
        this.otro=otro;
    }
    public void setFav(int fav){
        this.favoritos=fav;
    }
    public String devulve(){
        String res="resultado ="+getResultado()+" operacion igual "+getOperacion()+" fecha= "+getFdia()+"/"+getFmes()+" : "+getHour()+" con "+ getMinute();
        return res;
    }
    public void mostrar(){
        System.out.println("resultado ="+getResultado()+" operacion igual "+getOperacion()+" fecha= "+getFdia()+"/"+getFmes()+" : "+getHour()+" con "+ getMinute());
    }
}
