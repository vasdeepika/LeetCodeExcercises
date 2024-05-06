import java.util.Stack

fun isValid(s: String): Boolean {
    val valid = Stack<Char>()
    if (s.length <= 1) return false
    s.indices.forEach { i ->
        if (isOpenBrace(s[i])) {
            valid.push(s[i])
        } else {
            if (valid.isEmpty() || getMatching(valid.pop()) != s[i]) return false
        }
    }
    return valid.isEmpty()
}

fun getMatching(c: Char) = when (c) {
    '(' -> ')'
    '{' -> '}'
    '[' -> ']'
    else -> ' '
}

fun isOpenBrace(c: Char) = when (c) {
    '(' ->  true
    '{' -> true
    '[' -> true
    else -> false
}


fun main() {
    println("is valid paranthesis ${isValid("(()))")}")
}

