/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    let max = 0;
    for(let cand of candies){
        max = Math.max(max, cand);
    }
    let res = [];
    for(let i=0;i<candies.length;i++){
        if(candies[i] + extraCandies >= max){
            res[i] = true;
        }
        else{
            res[i] = false;
        }
    }
    return res;
};