import javax.swing.JOptionPane;

public class app{

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter your name");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in meters"));

        double weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight kilograms"));

        double bmi = (double) weight / (height*height);
        double diff2 = (double) 25 * (height * height);
        diff2 = Math.abs(weight - diff2);
        String type = "";
        String solution = "";
        
        if(bmi > 30){
            solution = "lose ";
            type = "obese";
        }

        else if( bmi >= 25 && bmi < 30 ){
            solution = "lose ";
            type = "overweight";
        }

        else if( bmi < 25 && bmi >= 18.5 ){
            solution = "lose ";
            type = "healthy";
            diff2 = 0;
        }
        
        else if( bmi < 18.5){
            solution = "gain ";
            type = "underweight";
        }

        else
            type = "invalid data";

            JOptionPane.showMessageDialog(null,"name = "+ name +
                                                                "\nAge = "+ age +
                                                                "\nHeight = "+ height +
                                                                "\nweight = "+ weight +
                                                                "\nbmi = " + bmi +
                                                                "\n\n" + name + " you're " + type +
                                                                "\n\n" + " you need to " + solution + diff2 + "kg\n\n" + 
                                                                "note: BMI is outdated, it may change heavily due to time period,nationality,race or gender.\nyou are perfect just the way you are :)");

    }
}