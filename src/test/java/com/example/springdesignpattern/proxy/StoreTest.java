package com.example.springdesignpattern.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {

    @Test
    public void testPay() {
        CashPerf cashPerf = new CashPerf();
        Store store = new Store(cashPerf);
        store.buySomething(100);
    }
}