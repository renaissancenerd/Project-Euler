import kotlin.math.sqrt
import kotlin.math.max

/**
 * Problem 3: Largest Prime factor
 *
 * https://projecteuler.net/problem=3
 *
 * Goal: find the largest prime factor of a given number
 */

fun largestPrimeFactorRecursive(n: Long, largest: Long = 2L): Long {
    val maxFactor = sqrt(n.toDouble()).toLong()
    val factors = listOf(2L) + (3L..maxFactor step 2L)
    for (factor in factors) {
        if (n % factor == 0L) {
            return largestPrimeFactorRecursive(n / factor, factor)
        }
    }
    return if (n > 2) max(largest, n) else largest
}

fun main(){
    println(largestPrimeFactorRecursive(600851475143))
}