/**
 * @param {string} 
 * @return {boolean}
 */
var halvesAreAlike = function(s) {
    let fHalf = s.slice(0,s.length / 2);
    let sHalf = s.slice(s.length / 2, s.length);
    let vow = "aeiouAEIOU";
    let c1 = 0, c2 = 0;
    for(let i=0;i<fHalf.length;i++){
        if(vow.includes(fHalf[i])){
            c1++;
        }
        if(vow.includes(sHalf[i])){
            c2++;
        }
    }
    if(c1 == c2) return true;
    else return false;
};