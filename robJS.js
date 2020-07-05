// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//              Total amount you can rob = 1 + 3 = 4.

var rob = function (nums) {
    if (nums == 0 || nums == null) return 0;
    if (nums == 1) return nums[0];
    if (nums == 2) return Math.max(...nums);

    let dp = [];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);

    for (let i = 2; i < nums.length; i++) {
        dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1])
    }

    return dp[nums.length - 1]
}