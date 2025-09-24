/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function(moves) {
    let obj = {
        "U": 0,
        "D": 0,
        "R": 0,
        "L": 0
    };
    for(let i=0;i<moves.length;i++){
        obj[moves[i]]++;
    }
    res1 = obj["U"] - obj["D"];
    res2 = obj["R"] - obj["L"];
    if(res1 == 0 && res2 == 0){
        return true;
    }
    else{
        return false;
    }
};