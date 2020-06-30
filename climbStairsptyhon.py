'''
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

'''

class Solution:
    def climbStairs(self, n: int) -> int:
        dp = [1,1]
        
        for i in range(2, n +1):
            dp.append(dp[i - 1] + dp[i -2])
        return dp[n]

    def climStairs2(self, nums):
        if nums == 1:
            return 1
        if nums == 2:
            return 2
        return self.climbStairs2(nums -1) + self.climStairs2(nums - 2)