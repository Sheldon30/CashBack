package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest5 {

        @org.junit.jupiter.api.Test
        public void testRemainJ() {
            CashbackHackService service = new CashbackHackService();
            int amount = 500;
            int actual = service.remain(amount);
            int expected = 500;
            org.junit.jupiter.api.Assertions.assertEquals(expected, actual);

        }
        @org.junit.jupiter.api.Test
        public void testAmountEqualJ() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int actual = service.remain(amount);
            int expected = 0;
            org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
        }
        @org.junit.jupiter.api.Test
        public void testAmountLessJ() {
            CashbackHackService service = new CashbackHackService();
            int amount = 999;
            int actual = service.remain(amount);
            int expected = 1;
            org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
        }
        @org.junit.jupiter.api.Test
        public void testAmountMoreJ() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1001;
            int actual = service.remain(amount);
            int expected = 0;
            org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
        }
}