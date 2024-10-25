package com.android.datastructure

fun main() {
    val nums = mutableListOf(1, 2, 4, 5, 6, 7, 12)
    val range = 4
    println("Maximum Array ${slidingWindowSumWithRange(nums, range)}")
}

fun slidingWindowSumWithRange(nums: MutableList<Int>, range: Int): Int {
    if (nums.isEmpty()) return 0
    if (nums.size == 1) return nums[0]

    var start = 0
    var end = nums.size-1
    var increment=0
    var rangeTo=range
    var sumArray = mutableListOf(end)
    while (start < end) {

        var sum = 0
        for (i in start..rangeTo) {
            sum += nums[i]
        }

        if (rangeTo == end) {
            return sumArray.max()
        } else {
            sumArray.add(start,sum)
            start=++increment
            rangeTo += 1

        }
    }
    return 0
}
