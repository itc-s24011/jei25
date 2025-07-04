public class D51kadai {
    public static void main(String[] args) {
        try {
            // コマンドライン引数から2番目の値を取得（配列ではインデックス1）
            double secondArgument = Double.parseDouble(args[1]);

            // 切り上げ処理
            double roundedValue = Math.ceil(secondArgument);

            // 結果を表示
            System.out.println(roundedValue);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー: コマンドライン引数が不足しています。");
        } catch (NumberFormatException e) {
            System.out.println("エラー: 数値形式が正しくありません。");
        }
    }
}
