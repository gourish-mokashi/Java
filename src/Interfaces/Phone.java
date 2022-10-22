package Interfaces;

public interface Phone {
    int lock = 1;
    int unlock = 0;

   // void checkStatus(int s);
    void dialNumber(String number);
    void disconnectCall();

}
