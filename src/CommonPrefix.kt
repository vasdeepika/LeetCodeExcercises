// sort the array so that first and last string can be compared, no need to go through the whole list of strings

fun longestCommonPrefix(strs: Array<String>): String {
    val first = strs[0]
    var subStringMatch = ""
    for (i in first.indices) {
        subStringMatch = first.substring(0,i+1)
        for (j in 1..<strs.size) {
            if (strs[j].length <= i || strs[j].substring(0,i+1) != subStringMatch) {
                return first.substring(0,i)
            }
        }
    }
    return subStringMatch
}

fun longestCommonPrefix2(strs: Array<String>): String {
    val first = strs[0]
    val list = strs.asList()
    var subStringMatch = ""
    for (i in first.indices) {
        subStringMatch = first.substring(0,i+1)
        if (!list.all { it.length > i && it.substring(0,i+1) == subStringMatch }) {
            return first.substring(0,i)
        }
    }
    return subStringMatch
}

fun longestCommonPrefix3(strs: Array<String>): String {
    strs.sort()

    val len = minOf(strs[0].length, strs[strs.size-1].length)
    var result = ""


    for(i in 0 until len) {
        if(strs[0][i] == strs[strs.size-1][i]) {
            result += strs[0][i]
        } else {
            break
        }
    }

    return result
}

fun main() {
    println("longestCommonPrefix: ${longestCommonPrefix2(arrayOf("flower","flow","flight"))}")
}

