/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let n = nums.length;
    let j = 0;
    for(let i=0;i<n;i++){
        if(nums[i] !== 0) nums[j++] = nums[i];
    }
    for(let i=j;i<n;i++){
        nums[i] = 0;
    }
    return nums;
};