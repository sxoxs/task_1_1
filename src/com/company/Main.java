package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String strLine = "";
        int resSumm, indexNum;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            resSumm = 0;
            System.out.println("Введите 5 целых чисел: ");
            indexNum = 1;
            while (indexNum <= 5) {
                System.out.println("\nВведите число № " + indexNum + ": ");
                strLine = strDeleteSpace(br.readLine());

                if (!strLine.isEmpty() && isAllNum(strLine)) {
                    resSumm += Integer.parseInt(strLine);
                    indexNum++;
                }
                else System.out.println("Неправильно введено число! введите ещё раз");
            }
            System.out.println("Сумма чисел равна: " + resSumm);
            System.out.println("Для выхода введите q, для продолжения Enter");
            strLine = br.readLine();
            if (strLine.toLowerCase().equals("q")) {
                System.out.println("Выход");
                break;
            }
        }
    }

    static String strDeleteSpace(String str) {
        return str.replace(" ", "");
    }

    static Boolean isAllNum(String str) {
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9': {
                    continue;
                }
                default: {
                    return false;
                }
            }
        }
        return true;
    }


}
