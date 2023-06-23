console.log(`x at top of file is ${x}`);
// console.log(`y at top of file is ${y}`);
// console.log(`z at top of file is ${z}`);
            // vars get hoisted but not let or consts
var x = 10; // declaration gets hoisted but not initialization
let y = 20;
const z = 30;

console.log(x);
console.log(`x at bottom of file is ${x}`);
console.log(`y at bottom of file is ${y}`);
console.log(`z at bottom of file is ${z}`);