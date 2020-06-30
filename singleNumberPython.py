"""
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1

"""

def signleNumber(self, nums):
    res = 0

    for num in nums:
        res ^= nums
    
    return res


#Hash
def singleNumber2(self, nums):
    dict = {}

    for num in nums:
        dict[num] = dict.get(num, 0) + 1
    
    for key, val in dict.items():
        if val == 1:
            return key