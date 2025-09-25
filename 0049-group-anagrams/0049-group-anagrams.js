/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    let res = [];
    let check = new Set();
    let l = 0, k = 0;

    // Precompute sorted keys for all strings (avoid sorting again & again)
    let keys = strs.map(s => s.split("").sort().join(""));

    for (let i = 0; i < strs.length; i++) {
        let temp = keys[i];
        if (check.has(temp)) continue; // already grouped
        check.add(temp);

        let Arr = [];
        Arr[k++] = strs[i];

        for (let j = i + 1; j < strs.length; j++) {
            if (keys[j] === temp) {
                Arr[k++] = strs[j];
            }
        }

        res[l++] = Arr;
        k = 0;
    }

    return res;
};
