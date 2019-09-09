
import java.io.*;
import java.util.Arrays;
public class Test { 
    public static void main(String[] args) throws IOException 
    { 

      Linkedlist obj = new Linkedlist(); 
     
     /********************************************************************************** */
            BufferedReader br = new BufferedReader(new FileReader("mydata.dat"));
            String line = null;

             while((line = br.readLine()) != null){

               String[] values = line.split(",");

              // int[] intValues = new int[values.length];

                for (int i = 0; i < values.length; i++) {
                    
                    try {
                        
                   
                       //intValues[i] = Integer.parseInt(values[i]);
                        obj.push(Integer.parseInt(values[i])); 
                        

                    }
            
               
                    catch (NumberFormatException nfe) {
                        continue;
                    }
                }
                //System.out.println(Arrays.toString(intValues));
              }

             System.out.println("");

             br.close(); 
     /******************************************************************************** */


      //  obj.push(11); 
       // obj.push(22); 
       // obj.push(33); 
       // obj.push(44); 
  
    
        obj.display(); 
  
   
       // System.out.printf("\nTop element is %d\n", obj.peek()); 
 
        //obj.pop(); 
       // obj.pop(); 
  
     
       // obj.display(); 
  
     
        System.out.printf("\nTop element is %d\n", obj.peek()); 
    } 
} 