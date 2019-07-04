package com.madr.dp.adapterpattern.example01;

/*
Let ApiClient be the primary.

It will check for the eligibility and make an order to the client.
 */
public interface IApiClient {

    void checkEligibility();

    void makeOrder();
}
