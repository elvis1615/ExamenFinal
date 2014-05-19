/**
 * @(#)Examen_Final.java
 *
 * Examen_Final application
 *
 * @author 
 * @version 1.00 2014/5/18
 */
 import java.io.*;
public class Examen_Final_201212602 {
    
    public static void main(String[] args) {
    File f;
    	f=new File(args[0]);
    	System.out.println("\n\n data(1) \n\n");
    	try{
    		
    		FileReader f1=new FileReader(f);
    		BufferedReader bufer=new BufferedReader(f1);
    		int x=Integer.parseInt(bufer.readLine());
    		int inicio, fin;
    		for(int in=1;in<=x;in++){
    			    			
    			String a=bufer.readLine();
    			String[] p= a.split(" ");
    			if(p[0].length()==p[1].length()){
    				
    				String h=p[0];
					String i=p[1];
        String j;
       
        for(int o=0;o<h.length();o++){
            j=""+i.charAt(i.length()-1);
               
       for(int m=0;m<h.length()-1;m++){
       j=j+i.charAt(m);
       }
       
       if(j.equals(h)){
       
           System.out.println(" caso"+in+" \t"+j+"\t si es reciclado");
           break;
       }
       else{
       i=j;
       
       }
       if(o==h.length()-1){
           System.out.println("caso"+in+"\t no es reciclable");
       }
               
        }
    				
    				}
    			if(p[0].length()!=p[1].length()){
    				System.out.println("no cumple con la longitud igual");
    				}
    			
    			}
    		
    		
    		}
    	catch(Exception e){
    		System.out.println("no se lee el archivo");
    		}
    	
    }
}
