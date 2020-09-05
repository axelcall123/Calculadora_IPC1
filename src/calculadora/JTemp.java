package calculadora;
public class JTemp {
    static int CA,EC,SDE,BC,DDC,SDDC,SEN,COS,TAN,LA,SR,D;
    public int REG_CA(){return CA;} 
    public int REG_EC(){return EC;}
    public int REG_SDE(){return SDE;} 
    public int REG_BC(){return BC;}
    public int REG_DDC(){return DDC;} 
    public int REG_SDDC(){return SDDC;} 
    public int REG_SEN(){return SEN;} 
    public int REG_COS(){return COS;}
    public int REG_TAN(){return TAN;} 
    public int REG_LA(){return LA;} 
    public int REG_SR(){return SR;} 
    public int REG_D(){return D;}
    //////////////////////////////
    public void IN_CA(int CA){this.CA = CA;}
    public void IN_EC(int EC){this.EC = EC;}
    public void IN_SDE(int SDE){this.SDE =SDE ;}
    public void IN_BC(int BC){this.BC = BC;}
    public void IN_DDC(int DDC){this.DDC = DDC;}
    public void IN_SDDC(int SDDC){this.SDDC = SDDC;}
    public void IN_SEN(int SEN){this.SEN = SEN;}
    public void IN_COS(int COS){this.COS = COS;}
    public void IN_TAN(int TAN){this.TAN = TAN;}
    public void IN_LA(int LA){this.LA = LA;}
    public void IN_SR(int SR){this.SR = SR;}
    public void IN_D(int D){this.D = D;}
    /*static int histo;
    public int Reg_HIS(){
        return histo;
    }
    public void In_HIS(int histos){
        this.histo=histo;
    }*/
    static int favo;
    public int Reg_FAV(){
        return favo;
    }
    public void In_FAV(int favo){
        this.favo=favo;
    }
    
    static int n;
    
    public int REG_tamañoo(){
    //PARA DEVOLVER EL TAMAÑO DEL TABLERO
        return n; 
    }
    public void IN_tamaño(int n){
       ////GUARDA EL TAMÑAO DEL TABLERO
       this.n=n;
    }
    
    
    static int au;
    static int bu;
    
    public int Reg_XU(){
        return au;
    }
    public void IN_XU(int au){
        this.au=au;
    }
    ///////////////////////
    public int Reg_YU(){
        return bu;
    }
    public void IN_YU(int bu){
        this.bu=bu;
    }

    static int ad;
    static int bd;

    public int Reg_XD(){
        return ad;
    }
    public void IN_XD(int ad){
        this.ad=ad;
    }
    ///////////////////////
    public int Reg_YD(){
        return bd;
    }
    public void IN_YD(int bd){
        this.bd=bd;
    }
    
    
    static double[][] a;
    static double[][] b;
    
    public double[][] Reg_Ma(){
        return a;
    }
    public void In_Ma(double[][] a){
        this.a=a;
    }
    
    public double[][] Reg_Mb(){
        return b;
    }
    public void In_Mb(double[][] b){
        this.b=b;
    }
    ////////////////////////////////
    
    
}
