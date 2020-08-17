import java.text.DecimalFormat;
import java.util.*;

public class Stocks{
double startBalance;
double newBalance;
double diff;
double newNum;
DecimalFormat df = new DecimalFormat("##################.##");
    public Stocks(double balance, double startBal){
        startBalance = balance;
        newBalance = startBal;
    }

    public void difference(){
     
    if(startBalance > newBalance){
     newNum = startBalance - newBalance;
     diff = (newNum / startBalance ) * 100;
     System.out.println("You lost $"+df.format(newNum)+" , While the decrease percentage is "+df.format(diff)+"%");
    }
    else{
        newNum = newBalance - startBalance;
        diff = (newNum / startBalance ) * 100;
        System.out.println("You gained $"+df.format(newNum) +" While the increase percentage is "+df.format(diff)+"%");
    }
    }
    public static void main(String[] args){
        double bal;
        double bal1;
       
        Scanner inputs = new Scanner(System.in);

       
        System.out.println("Enter the starting balance:");
        bal = inputs.nextDouble();
        System.out.println("Enter the new balance:");
        bal1 = inputs.nextDouble(); //$2,105.92

        Stocks check = new Stocks(bal,bal1);
        check.difference();
        inputs.close();
        

    }
}