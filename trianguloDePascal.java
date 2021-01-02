
package prueba3;

import javax.swing.JOptionPane;

public class prueba3 {
   public static void main(String[] args) {
         int m,n,f=1,f2=1,a,b;
        m=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de m: "));
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n: "));
        for(int i=1;i<m+1;i++){
            f*=i;
        }
        for(int i=1;i<n+1;i++){
            f2*=i;
        }
        a=f;
        b=f2*(m-n);
        JOptionPane.showMessageDialog(null,"El resultado es: "+a+"/"+b);
    }
    
}