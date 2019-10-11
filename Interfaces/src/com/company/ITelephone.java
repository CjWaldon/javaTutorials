package com.company;

public interface ITelephone {
    //interface defines just the methods
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
