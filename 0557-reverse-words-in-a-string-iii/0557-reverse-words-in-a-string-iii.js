/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let arr = s.split(" ");
    let res = "";
    for(let i=0;i<arr.length;i++){
        let sArr = arr[i].split("");
        if(arr.length-1 == i){
            res += sArr.reverse().join("");
        }
        else{
            res += sArr.reverse().join("") + " ";
        }
    }
    return res;
};