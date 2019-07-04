
package com.madr.dp.adapterpattern;

import com.madr.dp.adapterpattern.example01.ApiAdapterImpl;
import com.madr.dp.adapterpattern.example01.IApiAdapter;
import com.madr.dp.adapterpattern.example01.RelianceApiClient;

/*
We have two different classes but doing kind of similar functionality.
We need to make the other incompatible class compatible with Class A
 */
public class AdapterPatternTest {

    public static void main (String [] args) {
        AdapterPatternTest test = new AdapterPatternTest();
        test.testAdapterExample01();
    }

    void testAdapterExample01() {
        RelianceApiClient apiClient = new RelianceApiClient();
        IApiAdapter apiAdapter = new ApiAdapterImpl(apiClient);
        apiAdapter.checkProductEligibility();
        apiAdapter.checkUserName();
        apiAdapter.placeOrder();
    }
}
