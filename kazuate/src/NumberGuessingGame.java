import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int targetNumber = 42; // プログラマが設定する数
        int maxAttempts = 5; // ユーザが入力できる最大回数

        Scanner scanner = new Scanner(System.in);

        System.out.println("数当てゲームを開始します！");
        

        int attempts = 0; // 現在の試行回数

        while (attempts < maxAttempts) {
            System.out.println("2桁の正の整数を予想して入力してください。");
            System.out.print("予想した数: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("当たり！おめでとうございます！");
                break;
            } else if (guess > targetNumber) {
                System.out.println("設定された数より大きいです。");
            } else {
                System.out.println("設定された数より小さいです。");
            }

            int difference = Math.abs(guess - targetNumber);
            if (difference >= 20) {
                System.out.println("20以上の差があります。");
            }

            attempts++;
        }

        if (attempts == maxAttempts) {
            System.out.println("残念！5回の試行で当たりませんでした。正解は " + targetNumber + " でした。");
        }

        System.out.println("ゲームを終了します。");
    }
}

