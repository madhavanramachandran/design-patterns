package com.madr.dp.adapterpattern.example01;

public class RelianceApiClient implements IApiClient {
    @Override
    public void checkEligibility() {
        System.out.println("Checking reliance eligibility");
    }

    @Override
    public void makeOrder() {
        System.out.println("Making order with reliance...");
    }
}
