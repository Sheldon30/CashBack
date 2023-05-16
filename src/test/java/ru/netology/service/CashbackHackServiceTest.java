package ru.netology.service;


import org.testng.annotations.Test;


class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        Assertion
    }
}