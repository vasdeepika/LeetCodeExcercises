import kotlin.math.pow

fun isPalindrome(x: Int): Boolean {
    if (x < 0 || (x%10 == 0 && x != 0)) {
        return false
    }
    var x1 = x
    var reverseNumber=0
    while (x1>reverseNumber) {
        val mod = x1%10
        reverseNumber = reverseNumber*10+mod
        x1 /= 10
    }
    return x1 == reverseNumber || x1 == reverseNumber/10
}

fun main() {
    println(isPalindrome(10))
}