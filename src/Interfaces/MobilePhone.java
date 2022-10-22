package Interfaces;

public class MobilePhone implements Phone {
    public void dialNumber(String number){
        System.out.println("Connecting to Mobile Number: " + number);
    }
    public void disconnectCall(){
        System.out.println("Disconnecting the wireless connection");
    }
}
