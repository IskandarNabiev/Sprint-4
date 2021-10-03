package ru.sber.generics



// 1.
fun <K,V> compare(p1: Pair<K, V>, p2: Pair<K, V>): Boolean {
    return p1 == p2
}

// 2.
fun <T: Comparable<T>> countGreaterThan(anArray: Array<T>, elem: T): Int {
    var result = 0
    for (value in anArray)
        if (value > elem)
            result++
    return result
}

// 3.
class Sorter<T : Comparable<T>> {
    val list: MutableList<T> = mutableListOf()

    fun add(value: T) {
        list.add(value)
        list.sort()
    }
}

// 4.
class Stack<T> {

    val stack = mutableListOf<T>()

    fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    fun push(value: T) {
        stack.add(value)
    }

    fun pop(): T {
        return stack.removeLast()
    }

}