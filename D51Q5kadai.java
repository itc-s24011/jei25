public class D51Q5kadai {
    // 基本料金（値上げ後）
    private static final int BASE_RATE = 100; // 値上げ前は0円、値上げ後は100円

    // 重量単価（値上げ後）
    private static final int UNIT_PRICE = 1; // 各重量に対する値上げ額

    public static void main(String[] args) {
        // サンプルデータ：消費したガスの重量（例として50を使用）
        int gasWeight = 50;

        // 総料金計算
        int totalCost = calculateGasCost(gasWeight);

        // 結果表示
        System.out.println("ガスの消費重量: " + gasWeight + "kg");
        System.out.println("総料金: " + totalCost + "円");
    }

    public static int calculateGasCost(int gasWeight) {
        // 基本料金と重量単価を使用して総料金を計算
        return BASE_RATE + (UNIT_PRICE * gasWeight);
    }
}
