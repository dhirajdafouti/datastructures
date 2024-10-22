package com.android.datastructure

fun main() {
    val nums = intArrayOf(1, 2, 4, 5, 6, 7, 12)
    val range = 6
    slidingWindowSumWithRange(nums, range)
}

fun slidingWindowSumWithRange(nums: IntArray, range: Int): Int {
    if (nums.isEmpty()) return 0
    if(nums.size==1) return nums[0]

    var start = 0
    var end = nums.size-1
    while (start < end){

    }
    return 0
}
