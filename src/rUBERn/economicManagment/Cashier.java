package rUBERn.economicManagment;


import rUBERn.users.Client;
import rUBERn.users.Driver;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cashier {

    private int transactionNumber = 1;

    public void makePayment(Driver aDriver, Client aClient, double distanceTravelled){

        double price = (15 + (distanceTravelled / 100) ) * aDriver.getCar().priceIncremental();
        DecimalFormat df = new DecimalFormat("####0.00");

        aClient.makePayment(price);
        aDriver.recievesPayment(price - (price * 0.1) );
        String result = "\n" +
                        "-------------------------------------------------------" + "\n" +
                        " a. TRANSACTION NUMBER: " + transactionNumber + "\n" +
                        " b. OPERATION: TRAVEL PAYMENT \n" +
                        " c. DATE: " + getDate() + "\n " + "" +
                        "d. CLIENT'S NAME: " + aClient.getFullName() + " \n " +
                        "e. CLIENT'S CREDIT CARD: " + aClient.getCardNumber() + "\n" +
                        " f. DRIVER'S NAME: " + aDriver.getFullName() + " \n " +
                        "g. DRIVER'S CREDIT CARD: " + aDriver.getCardNumber() + " \n " +
                        "h. DESCRIPTION: THIS LOG REPRESENTS rUBERn TRANSACTIONS " + "\n" +
                        " i. AMOUNT: " + df.format(price) + " PESOS" + "\n" +
                        "-------------------------------------------------------";
        addLog("rUBERn LOG" , result);

        transactionNumber++;
    }

    private String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private void addLog ( String logType, String info ){
        try
        {
            String filename= logType + ".txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(info + "\n");//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

}

