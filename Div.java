/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

//import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Div {
    int a,b,q,r;
    Scanner scan= new Scanner (System.in);
   void initialize (){
       a=scan.nextInt();
       b=scan.nextInt();
       q=0;
       if(a<0){
           r = -a;
       }
       else
           r =a;
      
   }
    void setReminderQuotient(){
        while (r>=b){
            r=r-b;
            q=q-1;
            if(a<0 && r>0){
            r=b-r;
            q=-(q+1);
            }
            
        }
    }
    
    int getReminder(){
        return r;
    }
    int getQuotient(){
        return b;
    }
}
