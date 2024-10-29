package com.android.datastructure

fun main() {
    val number = intArrayOf(1, 3, 5, 6, 7, 8, 9)
    val range = 4
    val sum = findMaximumSumForRange(number, range)
    println("Maximum sum for range $range is $sum")
}

fun findMaximumSumForRange(number: IntArray, range: Int): Int {
    if (number.isEmpty()) return 0
    if (number.size == 1) return number[0]
    var left = 0
    var right = range-1
    var sum = 0;
    for (i in left..right) {
        sum += number[i];
    }

    var temp = sum
    while(right!==number.size-1) {
        temp -= number[left++];
        temp += number[++right];
        if(temp>sum) sum = temp;
    }

    return sum
}
