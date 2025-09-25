/**
 * @param {string} s
 * @param {string} chars
 * @param {number[]} vals
 * @return {number}
 */
var maximumCostSubstring = function(s, chars, vals) {
    let arr = [];
    let max = 0;
    let sum = 0;
    for(let i=0;i<26;i++){
        arr[i] = i + 1;
    }
    for(let i=0;i<chars.length;i++){
        arr[chars[i].charCodeAt(0) - 'a'.charCodeAt(0)] = vals[i];
    }
    for(let i=0;i<s.length;i++){
        let cur= arr[s[i].charCodeAt(0) - 'a'.charCodeAt(0)];
        sum = Math.max(cur, cur + sum);
        max = Math.max(max, sum);
    }
    return max;
};