package Reto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) 
    {
 
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
         System.out.println("Por favor ingrese  cual punto del taller desea mostrar, para el punto a escriba el numero 1 y para el punto b escriba el numero 2");
         String point = "";
 		try 
 		{
 			point = br.readLine();
 		} 
 		catch (IOException e) 
 		{
 			System.out.println("Error al cargar el punto ");
 			e.printStackTrace();
 		}      
      
 		if (point.equals("1"))
 		{
 			PointA();
 			
 		}
 		else if(point.equals("2")) 
 		{
 			PointB();
 			
 		}
    }

   

    public static void PointA()
    {
    	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
          System.out.println("Por favor ingrese  'Tipo A' para tipo A o 'Tipo B' para tipo B");
          String type = "";
  		try 
  		{
  			type = br.readLine();
  		} 
  		catch (IOException e) 
  		{
  			System.out.println("Porfavor ingrese el 'Tipo A' o 'Tipo B' exclusivamente");
  			e.printStackTrace();
  		}      
  		
          String cadena = null;
          
  		try 
  		{
  			cadena = ChainGenerator(type);
  		}
  		
  		catch (Exception e) 
  		{
  			e.printStackTrace();
  		}
          System.out.printf("Cadena aleatoria de 10 caracteres: %s\n", cadena);
    }
    
    public static String ChainGenerator(String type) 
    {
    	String chain="";
       if(type.equals("Tipo A"))
       {
    	   chain="54";
    	   for (int i = 0; i <8; i++) 
    	   {
    		   int num = (int) ((Math.random()*(('9'-'0')+1))+'0');
    		   char letter = (char)num;
    		   chain= chain+letter;
    	   }
       }
       if(type.equals("Tipo B"))
       {
    	   chain="08";
    	   for (int i = 0; i <8; i++) 
    	   {
    		   int num = (int) ((Math.random()*(('9'-'0')+1))+'0');
    		   char letter = (char)num;
    		   chain= chain+letter;
    	   }
       }
       return chain;
    }
    
    public static void PointB()
    {
    	
    	ArrayList<String> thelist = new ArrayList<String>();
    	thelist.add("hello");
    	thelist.add("world");
    	thelist.add("Daniel");
    	thelist.add("today");
    	thelist.add("end");
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Por favor ingrese  la palabra que desea buscar en la lista");
        String text="";
        try 
  		{
  			text = br.readLine();
  		} 
  		catch (IOException e) 
  		{
  			System.out.println("Error al escribir la palabra");
  			e.printStackTrace();
  		}      
        
    	 Exist(thelist, text);
    }
    
    public static boolean Exist(ArrayList<String> list, String text)
    {
    	boolean exist=true;
    	
    	for (int i = 0; i < list.size(); i++) 
    	{
    		if (list.get(i).equals(text))
    		{
    			exist=false;
    			System.out.println("si se encuentra la palabra en la lista... Valor del boolean: "+exist);
    		}	
		}
    	
    	if (exist==true) 
    	{
    		System.out.println("No se encuentra la palabra en la lista... Valor del boolean: "+ exist);
		}
    	
		return exist;
    }
    
}
