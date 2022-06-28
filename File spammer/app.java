import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class app {

    
    public static void main(String[] args) {

        String type = JOptionPane.showInputDialog("Enter file extention eg (.txt) :");

        int reply = JOptionPane.showConfirmDialog(null, "Do you want to use custom filename ?","select", JOptionPane.YES_NO_OPTION);
        
        if (reply == JOptionPane.YES_OPTION) {
            String filenames = JOptionPane.showInputDialog("Enter names of files separating with space :");
            String[] splited = filenames.split(" ");
            createfile(type , splited);
            JOptionPane.showMessageDialog(null, "GOOD BYE");

        } else {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number of files :"));
            createfile(num,type);
            JOptionPane.showMessageDialog(null, "GOOD BYE");
            System.exit(0);
        }


    }

    static void createfile(int size , String ext){

        File f; 
        for(int i=0;i<size;i++) { 
            f = new File(" " + (i+1) + ext); 
            try {
                f.createNewFile();
            } catch (IOException e) {

                e.printStackTrace();
            } 
        } 

    }

    static void createfile(String ext , String[] array){

        File f; 
        for(int i=0;i<array.length;i++) { 
            f = new File( array[i] + ext); 
            try {
                f.createNewFile();
            } catch (IOException e) {

                e.printStackTrace();
            } 
        } 

    }
}
