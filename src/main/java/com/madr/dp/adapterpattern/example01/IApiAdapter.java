package com.madr.dp.adapterpattern.example01;

/*
Let this class be secondary.
Order client provides multiple api's. We need to make this client behaves like the api client.
 */
public interface IApiAdapter {

    void checkUserName();

    void checkProductEligibility();

    void placeOrder();
}
