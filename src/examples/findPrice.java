package examples;

import javax.swing.*;

public class findPrice {
    public static void main(String[] args){

        final int NUMvalues= 10;
        int [] validValues ={ 101,108, 201,213,266,304,311,409,411,412 };

        double[] prices ={.29,1.23,3.50,.69,6.79,3.19,.99,.89,1.26,8.00};
        boolean quit=false;
        String Sitem=null;
        int itemOrderd;
        double itemPrice=0.0;
        boolean validitem = false;
        while(quit)
        Sitem = JOptionPane.showInputDialog(null,"enter the item number you want to order");
        itemOrderd=Integer.parseInt(Sitem);

        for (int i =0;i<NUMvalues;++i){
            if( itemOrderd==validValues[i]){
                    validitem=true;
                    itemPrice=prices[i];
            }
        }
        if (validitem ){
            JOptionPane.showMessageDialog(null,"the price for item "+itemOrderd+" is $"+ itemPrice);

        }
        else
            JOptionPane.showMessageDialog(null,"sorry invalid entry");

        Sitem=JOptionPane.showInputDialog(null,"would you like to select another item?y=enter yes or no");
        if (Sitem.equalsIgnoreCase("no"))
            quit=true;


    }
}
