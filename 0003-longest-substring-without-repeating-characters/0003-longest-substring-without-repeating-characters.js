/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let max = 0;
    for(let i=0;i<s.length;i++){
        let str = new Set();
        for(let j=i;j<s.length;j++){
            if(str.has(s[j])){
                break;
            }
            str.add(s[j]);
            max = Math.max(max, str.size);
        }
    }
    return max;
};