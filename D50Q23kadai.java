public class D50Q23kadai {
    String code; // フィールド変数

    // setCodeメソッドでコードを設定
    void setCode(String c) {
        code = c;
    }

    public static void main(String[] args) {
        D50Q23kadai obj = new D50Q23kadai(); // Q23オブジェクトの作成
        obj.setCode("Code"); // setCodeメソッドの呼び出しで値を設定
        System.out.println(obj.code); // mainメソッドで出力
    }
}