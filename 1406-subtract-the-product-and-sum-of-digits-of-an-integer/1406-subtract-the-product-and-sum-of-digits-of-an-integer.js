/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    let str = "" + n;
    let mul = 1;
    let sum = 0;
    for(let i=0;i<str.length;i++){
        mul *= str[i];
        sum += parseInt(str[i]);
        console.log(str[i]);
    }
    console.log(mul);
    return mul - sum;
};