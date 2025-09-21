/**
 * @param {string} s
 * @return {string}
 */
var sortSentence = function(s) {
    let arr = s.split(" ");
    let res = [];
    for(let i=0;i<arr.length;i++){
        let str = arr[i];
        let n = arr[i].length;
        let temp = str[n - 1];
        res[temp - 1] = str.slice(0, -1);
    }
    return res.join(" ");
};