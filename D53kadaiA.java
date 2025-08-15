public class D53kadaiA {
    public static void main(String[] args) {
        // 引数が空の場合のエラー処理
        if (args.length == 0) {
            System.out.println("エラー: 数値を入力してください。");
            return;
        }

        int sum = 0;
        try {
            // コマンドライン引数を整数に変換して合計を計算
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("合計=" + sum);
        } catch (NumberFormatException e) {
            System.out.println("エラー: 数値ではない値が含まれています。");
        }
    }
}
