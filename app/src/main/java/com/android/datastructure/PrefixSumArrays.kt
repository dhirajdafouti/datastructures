package com.android.datastructure

fun main() {
    val nums = intArrayOf(1, 2, 4, 5, 6, 7, 12)
    val stack = 1
    val end = 3
    val prefixSum = prefixSumRecursive(nums, stack, end)
    println("Prefix Sum Recursive $prefixSum")
    println("Prefix Sum ${prefixSum(nums, stack, end)}")
    val reverseArray = reverseArray(nums)
    for (i in reverseArray) {
        println("Reverse Array $i")
    }

    val reverseProgrammatically = reverseProgrammatically(nums)
    for (i in reverseProgrammatically) {
        println("Reverse Programmatically $i")
    }
    val nums2 = intArrayOf(52, -91, 72)
    val indices = sortedIndices(nums2, 18)
    for (i in indices) {
        println("Sorted Indices $i")
    }
    println(prefixSum3(nums2))
}

fun prefixSumRecursive(nums: IntArray, start: Int, end: Int): Int {
    if (nums.isEmpty()) return 0

    if (start == end) {
        return nums[start]
    }
    while (start < end) {
        val sum = nums[start] + prefixSumRecursive(nums, start + 1, end)
        return sum
    }

    return 0
}

fun reverseArray(nums: IntArray): IntArray {
    if (nums.isEmpty()) return intArrayOf()
    if (nums.size == 1) return nums
    return nums.reversedArray()
}

fun reverseProgrammatically(nums: IntArray): IntArray {
    if (nums.isEmpty()) return intArrayOf()
    if (nums.size == 1) return nums
    var start = 0
    var end = nums.size - 1
    while (start < end) {
        val temp = nums[start]
        nums[start] = nums[end]
        nums[end] = temp
        start++
        end--
    }
    return nums
}

fun prefixSum(nums: IntArray, start: Int, end: Int): Int {
    if (nums.isEmpty()) return 0
    if (start == end) {
        return nums[start]
    }
    var sum = 0
    for (i in start..end) {
        sum += nums[i]

    }
    return sum
}

fun prefixSum3(gain: IntArray): Int {
    var maxGain = 0
    var gained = 0
    for (i in gain.indices) {
        gained += gain[i]
        maxGain = maxOf(maxGain, gained)
    }
    return maxGain
}


fun sortedIndices(nums: IntArray, target: Int): IntArray {

    if (nums.isEmpty()) return intArrayOf()
    if (nums.size == 1) return intArrayOf(nums[0])

    var start = 0
    var end = nums.size - 1
    val indicesArray = IntArray(2)

    while (start <= end) {
        if (nums[start] + nums[end] == target) {
            indicesArray[0] = start + 1
            indicesArray[1] = end + 1
            break
        } else if (nums[start] + nums[end] < target) {
            start++
        } else {
            end--
        }

    }
    return indicesArray
}
