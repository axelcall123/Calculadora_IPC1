
package calculadora;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import static calculadora.JVistaPrincipal.datos;
public class NOSE {
    JTemp temp = new JTemp();
    

    String decimales(double a) {
        DecimalFormatSymbols simbolo = new DecimalFormatSymbols();//FORMATO DECIMAL .
        simbolo.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("########################.##", simbolo);//NUMERO DE DIGITOS MOSTRADOS
        return formateador.format(a);
    }
    
    double elevacion(double numero, double elevado) {//ELEVAR A LA a^N
        double respuesta = 1;
        for (double i = 1; i <= elevado; i++) {
            respuesta = respuesta * numero;//PARA ELVARRLO
        }
        return respuesta;
    }

    double factorial(double valor) {//FACTORIAL
        if (valor > 0) {
            double mult = valor * factorial(valor - 1);//HACE QUE EL FACOTRIAL DIMINUYA 4*3*2*1
            return mult;
        } else {
            return 1;
        }
    }

    double raizn(double radicando, double radical) {//radicando=el numero evaluar radical=raiz de radical
        NOSE ns = new NOSE();
        double c = 0;
        double x = 0;
        while (ns.elevacion(c, radical) <= radicando) {//K=RAIZ DE N, K ES EL VALOR COMPARADO ns.elevacion PARA VER EL NUMERO DE LA RAIZ
            c = c + 0.001;//AUMENTA UN NUMERO DE 0.001 HASTA ENCONTRAR ALGO EQUIVALENTE
            x = c;
        }
        return x;
    }

    double Mac(double n, double numero, double cs) {//MACLAURIN n es el ciclo de 0 a 100 numero ES EL NUMERO EVALUADO EN RAD O GRAD cs RECONOCE SI ES COSENO O SENO
        NOSE ns = new NOSE();
        if (n % 2 == 0) {
            double res = (1 * ns.elevacion(numero, 2 * n + cs)) / (ns.factorial(2 * n + cs));//SI ES PAR ES +
            return res;//DEVUELVE EL NUMERO
        } else {
            double res = (-1 * ns.elevacion(numero, 2 * n + cs)) / (ns.factorial(2 * n + cs));//SI ES IMPAR ES -
            return res;//DEVUELVE EL NUMERO
        }
    }

    double CosSen(double a, double cs) {//SERIE PRAR MCLAURIN a NUMERO EVALUADO cs ES SI ES COSENO O SENO
        NOSE ns = new NOSE();
        double res = 0;
        for (int i = 0; i <= 100; i++) {
            res = res + ns.Mac(i, a, cs);//SUMA LOS RESULTADOS DE KA SERIE
        }
        return res;//DEVULEVE LA SUMA TOTAL
    }

    double Disminuir(double num) {//DIMINUYE EL NUMERO A UNO EQUIVALENTE DE UN RANGO DE 0 A 2PI
        double pi = 3.14159265358979323846;
        for (int a = 0; a < 1000; a++) {
            if (num > 2 * pi) {
                num = num - 2 * pi;
            }else if(num<-2*pi){//AUMENTAR EL NUMERO A UNO EQUIVALENTE DE UN RANGO DE 0 A -2PI
                num=num+2*pi;
            }else{
                break;//SE ROMPER EL CICLO PARA NO HACER ALGO IMNESESARIO
            }
        }
        return num;
    }
    double Matriz_2(double[][] a){//DETERMINANTE
        double deter=0;
        if(a.length==2){
            deter=a[0][0]*a[1][1]-a[0][1]*a[1][0];
        }else if(a.length==3){
            deter=
            a[0][0]*a[1][1]*a[2][2]+
            a[0][1]*a[1][2]*a[2][0]+
            a[0][2]*a[1][0]*a[2][1]
            -a[0][2]*a[1][1]*a[2][0]
            -a[0][0]*a[1][2]*a[2][1]
            -a[0][1]*a[1][0]*a[2][2]
                ;
        }else if(a.length==4){
           deter=
                 a[0][0]*a[1][1]*a[2][2]*a[3][3]//1
                -a[0][0]*a[1][1]*a[2][3]*a[3][2]//2
                -a[0][0]*a[1][2]*a[2][1]*a[3][3]//3
                +a[0][0]*a[1][2]*a[2][3]*a[3][1]//4
                +a[0][0]*a[1][3]*a[2][1]*a[3][2]//5
                -a[0][0]*a[1][3]*a[2][2]*a[3][1]//6
                -a[0][1]*a[1][0]*a[2][2]*a[3][3]//7
                +a[0][1]*a[1][0]*a[2][3]*a[3][2]//8
                +a[0][1]*a[1][2]*a[2][0]*a[3][3]//9
                -a[0][1]*a[1][2]*a[2][3]*a[3][0]//10
                -a[0][1]*a[1][3]*a[2][0]*a[3][2]//11
                +a[0][1]*a[1][3]*a[2][2]*a[3][0]//12
                +a[0][2]*a[1][0]*a[2][1]*a[3][3]//13
                -a[0][2]*a[1][0]*a[2][3]*a[3][1]//14
                -a[0][2]*a[1][1]*a[2][0]*a[3][3]//15
                +a[0][2]*a[1][1]*a[2][3]*a[3][0]//16
                +a[0][2]*a[1][3]*a[2][0]*a[3][1]//17
                -a[0][2]*a[1][3]*a[2][1]*a[3][0]//18
                -a[0][3]*a[1][0]*a[2][1]*a[3][2]//19
                +a[0][3]*a[1][0]*a[2][2]*a[3][1]//20
                +a[0][3]*a[1][1]*a[2][0]*a[3][2]//21
                -a[0][3]*a[1][1]*a[2][2]*a[3][0]//22
                -a[0][3]*a[1][2]*a[2][0]*a[3][1]//23
                +a[0][3]*a[1][2]*a[2][1]*a[3][0]//24
                ;
        }
          //System.out.println(deter+" el determinante");
         return deter;       
    }
    double[] matriz(double[][] z,int tempoY,int tempoX,int V_repita,int tamaño_res){//DESCOMPONE LA MATRIZ EN PARTES
        //Z MATRIZ ENVIADA//TEMPO TAMAÑO DE LA MATRIZ EVALUADA X,y//RES TAMAÑO DEL RESULTADO PUESTA EN UNA MATRIZ,V REPITA VESCE QUE SE REPITE EL CICLO EVALUADO OSEA EL TAMAÑO
        double[][] MatVOl = new double[tempoY][tempoX];
        double[] res= new double[tamaño_res];
        NOSE ns= new NOSE();
        for (int convertir = 0; convertir < V_repita; convertir++) {
            for (int a = 0; a < tempoY; a++) {//PASA LOS TEXFIELD A UNA MATRIZ
                for (int b = 0; b < tempoX + 1; b++) {
                    if (convertir == tempoX) {//IF LA POSICION ES IGUAL A LA ULTIMO TRAMO ES
                        if (b == convertir) {//SALTAR UNA COLUMNA
                            continue;
                        } else {
                            MatVOl[a][b] = z[a][b];
                        }
                    } else {
                        if (b == convertir) {//SALTAR UNA COLUMNA
                            continue;
                        } else {
                            if (b < convertir) {//SI ES MENOR A LA POSCION QUE SE QUIERE SALTAR ENTONCES 
                                MatVOl[a][b] = z[a][b];
                            } else {//SI ES MAYOR ENTONCES LE RESTAS UNA POSICION PARA QUE SEA N*N
                                MatVOl[a][b - 1] = z[a][b];
                            }
                        }
                    }
                }
            }
            res[convertir]=ns.Matriz_2(MatVOl);//PASAR LOS RESULTADOS A UNA MATRIZ
            //System.out.println(res+" resultado");
        }
        return res;
    }
    double cuadrado(double a, double b){
        double res=a*a*(b-a)+a*(b-a)*(b-a)+((b-a)*(b-a)*(b-a))/(6);
        return res;
    }
    double cubica(double a, double b){
        double res=a*a*a*(b-a)+1.5*a*a*(b-a)*(b-a)+0.5*a*(b-a)*(b-a)*(b-a)+0.25*(b-a)*(b-a)*(b-a)*(b-a);
        return res;
    }double expo(double a, double b){
        NOSE ns= new NOSE();
        double expo=2.718281828;
        double res=ns.elevacion(expo, a)-ns.elevacion(expo, b);
        return res;
    }
  
}
