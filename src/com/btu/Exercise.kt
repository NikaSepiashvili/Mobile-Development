package com.btu

fun avg(nums: Array<Int>): Int {
    var ans = 0
    for (i in  nums.indices step 2) {
        if(i == 0) continue
        ans += nums[i]
    }
    return ans / (nums.size / 2);
}