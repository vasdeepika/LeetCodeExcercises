//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000


fun romanToInt(s: String): Int {
    var output = 0
    var previousValue = 0
    for (i in s.length-1 downTo 0){
        val value = getValue(s[i])
        if (value < previousValue ) {
            output-=value
        } else {
            output+=value
        }
        previousValue = value
    }
    return output
}

fun getValue(char: Char) = when (char) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
}

fun main() {
    println(romanToInt("XIVII"))
}

