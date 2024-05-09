fun removeDuplicates(nums: IntArray): Int {
    val output: Set<Int> = nums.toSet()
    for (i in output.indices) {
        nums[i] = output.elementAt(i)
    }
    return output.size
}

fun removeDuplicates2(nums: IntArray): Int {
    val nums2  = IntArray(nums.size)
    var j = 0
    nums2[j] = nums[0]
    for (i in nums.indices) {
        if (nums2[j] != nums[i]) {
            nums2[++j] = nums[i]
        }
    }
    for (i in 0 until j+1){
        nums[i] = nums2[i]
    }

    return j+1
}

fun main() {
    val nums = intArrayOf(1,1,2) // Input array
    val expectedNums = intArrayOf(1,2)// The expected answer with correct length

    val k = removeDuplicates2(nums) // Calls your implementation

    assert( k == expectedNums.size)
    for (i in 0 until k) {
        println(nums[i])
        assert( nums[i] == expectedNums[i])
    }
}