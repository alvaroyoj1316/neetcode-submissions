class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        map = {}
        #mapping values to thier index
        for i in range(len(nums)):
            searching = target - nums[i]
            if searching in map:
                return [map[searching], i]
            map[nums[i]] = i
        