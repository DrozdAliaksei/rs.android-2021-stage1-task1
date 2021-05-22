package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val herBill = (bill.sum() - bill[k]) / 2
        return if (herBill != b) {
            "${b.minus(herBill)}"
        } else
            "bon appetit"
    }
}
