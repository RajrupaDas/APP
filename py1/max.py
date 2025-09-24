def find_max(*nums):
    if not nums:
        return None
    
    max_num = nums[0]
    for num in nums[1:]:
        if num > max_num:
            max_num = num
    return max_num

print(find_max(10, 5, 20, 15))
