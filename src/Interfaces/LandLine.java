package Interfaces;

public class LandLine implements Phone{
    public void dialNumber(String number){
        System.out.println("Connecting to Landline Number " + number);
    }
    public void disconnectCall(){
        System.out.println("Disconnecting the wired connection");
    }
}
