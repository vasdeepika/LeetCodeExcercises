import kotlin.math.abs

fun twoSum(nums: IntArray, target: Int): IntArray {
    val mapNums = hashMapOf<Int, Int>()
    for (i in nums.indices) {
        if(mapNums.containsKey(nums[i])) {
            return intArrayOf(mapNums.getValue(nums[i]), i)
        } else {
            mapNums[target - nums[i]] = i
        }
    }
    return intArrayOf()
}

fun main() {
    val output = twoSum(intArrayOf(3,3),6)
    for (num in output) {
        print(num)
    }
    println()

    val output2 = twoSum(intArrayOf(-18,12,3,0),-6)
    for (num in output2) {
        print(num)
    }
    println()

    val output3 = twoSum(intArrayOf(-1,-2,-3,-4,-5),-8)
    for (num in output3) {
        print(num)
    }
    println()
}