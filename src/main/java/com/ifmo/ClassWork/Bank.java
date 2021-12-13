package com.ifmo.ClassWork;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Bank {

    private ConcurrentMap<Long, Account> accMap = new ConcurrentHashMap<Long, Account>();

    public Account createAccount(long userId) {
        return new Account(userId);
    }

    public synchronized  double getAmount(long accId) throws Exception {
        synchronized (this) {
            for (Map.Entry<Long, Account> entry : accMap.entrySet()) {
                if (entry.getKey().equals(accId)) {
                    return entry.getValue().getAmount();
                } else throw new Exception("Nobody with this ID");
            }
            notify();
        }
        return 0.1;                 // НЕ знаю как по другому выйти из метода, т.е. не знаю как по другому красиво вернуть значение
    }

    public synchronized void blockAccount(long accId) {
        synchronized (this) {
            for (Map.Entry<Long, Account> entry : accMap.entrySet()) {
                if (entry.getKey().equals(accId)) {
                    boolean booleanAcount = entry.getValue().isBlocked();
                    booleanAcount = false;
                }
            }
            notify();
        }
    }

    public boolean isAccountBlocked(long accId) {
        // здесь будет повторение того, что уже написано в методе transferMoney

        return false;
    }

    public synchronized void changeAmount(long accId, double amount){
        synchronized (this) {
            for (Map.Entry<Long, Account> entry : accMap.entrySet()) {
                if (entry.getKey().equals(accId)) {
                    double summa = entry.getValue().getAmount()-amount;
                    entry.getValue().setAmount(summa);
                }
            }
            notify();
        }
    }

    public synchronized void transferMoney (long fromAccId, long toAccId, double amount) throws Exception {

        for (Map.Entry<Long, Account> entry : accMap.entrySet()) {       //Сначала проверка на достаточность средств на счете -
            if (entry.getKey().equals(fromAccId)) {                      // пробегаюсь по мапе, ищу необходимый мне счет для снятия
                double amountFromUser = entry.getValue().getAmount();    // и проверяю хватает ли на нем денег
                if (amountFromUser < amount) {
                    throw new Exception("enough money in the account");
                }
                if (!entry.getValue().isBlocked()) {                    //Проверка на блокировку счета, если значение false - то снимать деньги нельзя
                    throw new Exception("Amount is blocked");
                }
                if (entry.getValue().getAmount() - amount < 0) {         // Проверка на статок на счете
                    throw new Exception("The amount can't be below zero");
                    // } else ()                                 // идея в том, чтобы в changeAmount отправлять значения  fromAccId и amount (со знаком +, а toAccId передавать с amount со знаком минус
                }
            }
        }
    }
}
