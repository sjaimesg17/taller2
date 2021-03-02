
package taller2;
import java.util.Scanner;

public class Taller2 {

    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        
        System.out.println("Ingrese el numero : ");
        long dec=ss.nextLong();
        long aux=dec;
        String bin="";
        
        while(aux>0){
            bin=aux%2+bin;
            aux=aux/2;
            
        }
        
        
        System.out.println("El numero decimal "+dec+" en binario es : "+bin);
        
        long nbin= Long.parseLong(bin);
        long ndec=0;
        int con=1;
        long auxdec;
        
        while(nbin>0){
            auxdec=nbin%2;
            ndec=ndec+auxdec*con;
            nbin=nbin/10;
            con=con*2;
        
        }
        
        System.out.println("El numero binario "+bin+" en decimal es : "+ndec);
        System.out.println("Santiago Jaimes");
        System.out.println("Psdt: profe se me ha hecho complicado el entender este tema, apenas di para hacer este punto, me esforzare mas con el otro taller.");
        
    }
    
}
