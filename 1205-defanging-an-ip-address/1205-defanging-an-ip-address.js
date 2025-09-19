/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    let res = "";
    for(let ch of address){
        if(ch == '.'){
            res += '[.]';
        }
        else{
            res += ch;
        }
    }
    return res;
};