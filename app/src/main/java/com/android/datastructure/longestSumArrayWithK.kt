package com.android.datastructure

fun main() {
    val number = intArrayOf(1, 4, 5, 6, 7, 8, 7, 8)
    val range = 19
    val sum = longestSumArrayWithRangeAsK(number, range)
    println("Longest sum array with range $range is $sum")

}

fun longestSumArrayWithRangeAsK(number: IntArray, range: Int): Int {
    if (number.isEmpty()) return 0
    if (number.size == 1) return if (number[0] == range) 1 else number[0]





    return 0

}
