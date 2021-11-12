package com.example;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        System.out.println("On Suite Start");
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("On Suite Finish");
    }
}
