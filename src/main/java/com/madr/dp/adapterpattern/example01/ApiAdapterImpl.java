package com.madr.dp.adapterpattern.example01;
/*
ApiAdpater will be communicating with the ApiClient.
This is to match the two unrelated interfaces.
 */
public class ApiAdapterImpl implements IApiAdapter {

    private final IApiClient apiClient;

    public ApiAdapterImpl(IApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @Override
    public void checkUserName() {
        System.out.println("Not supported..");
    }

    @Override
    public void checkProductEligibility() {
        apiClient.checkEligibility();
    }

    @Override
    public void placeOrder() {
        apiClient.makeOrder();
    }
}
