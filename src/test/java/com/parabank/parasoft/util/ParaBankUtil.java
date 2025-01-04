package com.parabank.parasoft.util;

public class ParaBankUtil {
    public static final int WAIT_TIME = 30;

    public static void waitForDomStable(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
