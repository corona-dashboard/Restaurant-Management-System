package restaurentsystem;

import javax.swing.JFrame;

public class RestaurentSystem extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       LogIn im = new LogIn();
        im.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        im.setVisible(true);
        
    }
    
}
