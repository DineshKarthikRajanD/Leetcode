/**
 * @param {number[]} nums
 * @return {string}
 */
var largestNumber = function(nums) {
    let arr = [];
    for(let i=0;i<nums.length;i++){
        arr[i] = String(nums[i]);
    }
    arr.sort((a,b) => (b+a) - (a+b));
    let res = arr.join("");
    let count = 0;
    for(let i=0;i<res.length;i++){
        if(res[i] == "0"){
            count++;
        }
    }
    if(count == res.length) return "0";
    return res;
};