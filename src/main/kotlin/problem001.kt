/**
 * Problem 1: Multiples of 3 or 5
 *
 * https://projecteuler.net/problem=1
 *
 * Goal: Find the sum of all natural numbers less than N that are multiples of either of the
 * provided factors K1 or K2.
 *
 * Constraints: 1 <= N <= 1e9, 1 <= K < N
 *
 * e.g.: N = 10, K1 = 3, K2 = 5
 *       multiples of K1 || K2 < N = {3, 5, 6, 9}
 *       sum = 23
 */

fun sumOfMultiplesBrute(n: Int, factor1: Int, factor2: Int): Long {
    val minNum = minOf(factor1, factor2).toLong()
    return (minNum until n.toLong()).sumOf { num ->
        if (num % factor1 == 0L || num % factor2 == 0L) num else 0L
    }
}

fun main(args: Array<String>){
    sumOfMultiplesBrute(1000, 3, 5)
}