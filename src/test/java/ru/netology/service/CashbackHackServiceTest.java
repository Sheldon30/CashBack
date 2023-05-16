package ru.netology.service;


import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        Assertion.assertEquals (actual, expected);
    }
}