package com.ifmo.lesson2;

public class UnluckyNumbers {
    /*
    В американской армии считается несчастливым число 13, а в японской — 4. Перед
    международными учениями штаб российской армии решил исключить номера боевой
    техники, содержащие числа 4 или 13 (например, 40123, 13313, 12345 или 13040), чтобы не
    смущать иностранных коллег. Если в распоряжении армии имеется 100 тыс. единиц боевой
    техники и каждая боевая машина имеет номер от 00001 до 99999, то сколько всего номеров
    придётся исключить?
     */
    public static void main(String[] args) {
        System.out.println(unluckyNumbersCount());
    }

    public static int unluckyNumbersCount() {
        int cnt=0;
        for(int i=4;i<=99994;i++){
            String s=String.valueOf(i);
            if(s.indexOf('4')!=-1){
                cnt++;
            }
            else if(s.indexOf('1')!=-1&s.indexOf('1')+1==s.indexOf('3')){
                cnt++;
            }
        }
        return cnt;
    }
}
