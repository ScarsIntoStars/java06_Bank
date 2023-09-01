package main;

import service.BankService;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankService bankService = new BankService();

        while (true) {
            System.out.println("========== ICIA 은행 ==========");
            System.out.println("[  메뉴  ]\n| 1. 신규계좌 등록\n| 2. 잔액조회\n| 3. 입금\n| 4. 출금\n| 5. 입출금 내역조회\n| 0. 종료");
            System.out.print("메뉴선택 > ");
            String menu = sc.next();

            switch (menu) {
                case "1": // 신규계좌등록
                    bankService.save();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("0~5 사이의 숫자만 입력가능합니다.");

            }

        }
    }


}
