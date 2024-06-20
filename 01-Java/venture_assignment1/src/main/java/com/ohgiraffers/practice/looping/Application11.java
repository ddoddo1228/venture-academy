package com.ohgiraffers.practice.looping;

import java.util.Scanner;

public class Application11 {

    public static void main(String[] args) {

        /* 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
         *
         * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
         * 지폐외 동전을 구분하여 단위를 표기하세요.
         *
         * -- 입력 예시 --
         * 받으신 금액을 입력하세요 : 100000
         * 상품 가격을 입력하세요 : 22340
         *
         * -- 출력 예시 --
         * ============================
         * 50000원권 지폐 1장
         * 10000원권 지폐 2장
         * 5000원권 지폐 1장
         * 1000원권 지폐 2장
         * 500원권 동전 1개
         * 100원권 동전 1개
         * 50원권 동전 1개
         * 10원권 동전 1개
         * ============================
         * 거스름돈 : 77660원
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("받으신 금액을 입력하세요 : ");
        int receivedAmount = scanner.nextInt();

        System.out.print("상품 가격을 입력하세요 : ");
        int productPrice = scanner.nextInt();

        scanner.close();

        int change = receivedAmount - productPrice;

        System.out.println("============================");

        int[] moneyUnits = {50000, 10000, 5000, 1000};
        String[] moneyUnitNames = {"원권", "원권", "원권", "원권"};
        int[] coinUnits = {500, 100, 50, 10};
        String[] coinUnitNames = {"원 동전", "원 동전", "원 동전", "원 동전"};

        for (int i = 0; i < moneyUnits.length; i++) {
            int count = change / moneyUnits[i];
            if (count > 0) {
                System.out.println(moneyUnits[i] + moneyUnitNames[i] + " " + count + "장");
                change %= moneyUnits[i];
            }
        }

        for (int i = 0; i < coinUnits.length; i++) {
            int count = change / coinUnits[i];
            if (count > 0) {
                System.out.println(coinUnits[i] + coinUnitNames[i] + " " + count + "개");
                change %= coinUnits[i];
            }
        }

        System.out.println("============================");
        System.out.println("거스름돈 : " + change + "원");
    }
}
