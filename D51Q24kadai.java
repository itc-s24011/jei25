public class D51Q24kadai {

    public static void main(String[] args) {
        System.out.println("100未満の3と5の公倍数は以下の通りです：");

        for (int i = 1; i < 100; i++) {
            // 3と5の公倍数をチェック
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
