def twoSum(nums, target):
    answer = [0, 0]
    indicies = {}
    for i in range(len(nums)):
        indicies[nums[i]] = i
    for j in range(len(nums)):
        if (((target-nums[j]) in indicies) and (indicies[target-nums[j]] != j)):
            answer[0] = indicies[target-nums[j]]
            answer[1] = j
    return answer    
    
    
    
arr = [5, 2, 3]
ans = twoSum(arr, 8)
print(ans)
