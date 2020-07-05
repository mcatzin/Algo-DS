// Input: [-2,1,-3,4,-1,2,1,-5,4],
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.
var maxSubArray = function (nums) {
    if (nums == null) return 0;
    if (nums.length == 1) return nums[0]
    let dp = [];
    dp[0] = nums[0]
    let maxSoFar = nums[0]

    for (let i = 1; i < nums.length; i++) {
        dp[i] = Math.max(nums[i], dp[i - 1] + nums[i])
        maxSoFar = Math.max(maxSoFar, dp[i])
    }

    return maxSoFar;
};