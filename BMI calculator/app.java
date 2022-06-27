import javax.swing.JOptionPane;

public class app{

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter your name");
        // JOptionPane.showMessageDialog(null,"Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        // JOptionPane.showMessageDialog(null,"you are " + age+ " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        // JOptionPane.showMessageDialog(null,"you are height" + height+ " cm tall");

        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight"));

        double bmi = (double) weight / (height*height);
        String type;

        
        if(bmi > 30)
            type = "obese";

        else if( bmi >= 25 && bmi < 30 )
            type = "overweight";

        else if( bmi < 25 && bmi >= 18.5 )
            type = "GOOD";
        
        else if( bmi < 18.5)
            type = "underweight";

        else
            type = "invalid data";

            JOptionPane.showMessageDialog(null,"name = "+ name +
                                                                "\nAge = "+ age +
                                                                "\nHeight = "+ height +
                                                                "\nbmi = " + bmi +
                                                                "\n\n" + name + " is " + type);

    }
}