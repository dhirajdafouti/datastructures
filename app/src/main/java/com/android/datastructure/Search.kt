package com.android.datastructure

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val search = 3
    val result = linearSearch(numbers, search)
    print("The Linear Search is $result")
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

fun binarySearch(numbers: IntArray, search: Int): Boolean {
    return true
}
