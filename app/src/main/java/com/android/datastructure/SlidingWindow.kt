package com.android.datastructure

fun main() {
    var nums = intArrayOf(1,2,3,1,0,1,7)
    val range = 3
    println("Maximum Array ${slidingWindowSum(nums, range)}")
}

fun slidingWindowSum(nums: IntArray, k: Int): Double {

    var left = 0
    var right = k-1
    var sum = 0;
    for (i in left..right) {
        sum = sum + nums[i];
    }
    var temp = sum
    while(right!==nums.size-1) {
        temp = temp - nums[left++];
        temp = temp + nums[++right];
        if(temp>sum) sum = temp;
    }
    return sum/k.toDouble();
}

fun slidingWindowSumWithRange(nums: IntArray, range: Int): Double {
    if (nums.isEmpty()) return 0.0
    if (nums.size == 1) return nums[0].toDouble()

    var start = 0
    var counter = 0
    var end = nums.size - 1
    var rangeTo = range
    var sumArray = mutableListOf<Double>()
    while (start <= end) {
        if (rangeTo == nums.size) {
            return sumArray.max()
        }
        var sum = 0
        for (i in counter..rangeTo) {
            sum += nums[i]
        }


        if (rangeTo <= nums.size) {
            val average: Double = (sum / range.toDouble())
            sumArray.add(counter, average)
            ++start
            ++counter
            if (rangeTo != nums.size) {
                ++rangeTo
            }
        }
    }
    return 0.0
}

