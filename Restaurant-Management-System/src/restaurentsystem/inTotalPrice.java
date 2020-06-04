package restaurentsystem;

import java.io.FileInputStream;
import java.util.Scanner;

public class inTotalPrice {
    public Scanner scan;
    public double total=0;
    public String price;

    public String getTotal() {
        
         try{
              scan = new Scanner(new FileInputStream("order.txt"));
            while(scan.hasNextLine())
            {
                
                
                scan.nextLine();
               scan.nextLine();
               price = scan.nextLine();
               total+=Double.valueOf(price);
               
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return String.valueOf("Total Price is : "+total);
    }
    
    
    
}
