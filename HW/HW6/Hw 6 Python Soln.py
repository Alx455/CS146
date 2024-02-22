class solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        triplets = []
        nums.sort()
        for i in range (0, len(nums)):
            for j in range (i + 1, len(nums)):
                for k in range (j + 1, len(nums)):
                    if ((nums[i] + nums[j] + nums[k] == 0) and (triplets.count([nums[i], nums[j], nums[k]]) == 0)):
                        triplets.append([nums[i], nums[j], nums[k]])
        return triplets


