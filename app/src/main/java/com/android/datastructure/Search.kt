package com.android.datastructure

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val search = 0
    val result = linearSearch(numbers, search)
    print("The Linear Search is $result")

    val elements = intArrayOf(3, 6, 4, 2, 4, 5, 6, 7, 3, 10)
    val elementSearch = 10
    val binaryResult = binarySearch(elements.sortedArray(), elementSearch)
    print("The Binary Search is iterative $binaryResult")

    val elements1 = intArrayOf(1, 2, 3, 6, 8, 4, 5, 6, 7, 3, 10)
    val elementSearch1 = 7
    var low = 0
    var high = elements1.size - 1
    val binaryResult1 = binarySearchRecursive(elements1.sortedArray(), elementSearch1, low, high)
    print("The Binary Search is recursive $binaryResult1")
}

fun binarySearchRecursive(sortedArray: IntArray, elementSearch: Int, low: Int, high: Int): Boolean {

    if (sortedArray.isEmpty()) return false
    if (low > high) return false
    if (low == high - 1) {
        return sortedArray[low] == elementSearch
    }

    if (low < high) {
        val mid = (high +low) / 2
        if (sortedArray[mid] == elementSearch){
            return true
        }
        return if(sortedArray[mid] < elementSearch){
            binarySearchRecursive(sortedArray, elementSearch, mid+1, high)
        }else{
            binarySearchRecursive(sortedArray, elementSearch, low, mid-1)
        }
    }

    return false

}

fun linearSearch(numbers: IntArray, search: Int): Boolean {
    if (numbers.isEmpty()) return false

    if (numbers.size == 1) {
        return numbers[0] == search
    }
    if (numbers.size > 1) {
        for (i in numbers) {
            if (i == search) {
                return true
            }
        }
    }
    return false
}

fun binarySearch(nums: IntArray, search: Int): Boolean {
    if (nums.isEmpty()) return false

    var low: Int = 0
    var high: Int = nums.size - 1
    while (low <= high) {
        val mid = (low + high) / 2
        if (nums[mid] == search) {
            return true
        }
        if (nums[mid] < search) {
            low = mid + 1
        } else {
            high = mid - 1
        }
    }

    return false
}
