/**
 * @param {string} s
 * @return {string}
 */
var freqAlphabets = function(s) {
    let res = "";
    for(let i=s.length-1;i>=0;i--){
        if(s[i] == "#"){
            let temp = "";
            temp += s[i-2]+s[i-1];
            res += String.fromCharCode(parseInt(temp) + 96);
            i = i - 2;
        }
        else{
            res += String.fromCharCode(parseInt(s[i]) + 96);
        }
    }
    return res.split("").reverse().join("");
};