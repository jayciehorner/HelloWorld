console.log("VARIABLES")
// var, let, const

/**
 * variable scopes in JavaScript
 * - Global scope
 * - Function scope
 * - Block scope
 */

/**
 * var can be global or function scope
 * let can be global or block scope
 * const can be global or block scope
 */
console.log(a); // At this point, JavaScript knows that a exists but has not reached the assignment
                // statement so we get this undefined result
// console.log(b); // ReferenceError: b is not defined
// console.log(c); // ReferenceError: c is not defined

if (true) {
    if (true) {
        var a = 90;
        // let b = 80;
        const c = 90;
        t = 4;
    }
}
console.log("BELOW THE IF BLOCKS")
console.log(t); // no specified declaration type so defaults to var
console.log(a); // var is global scope so I can use it outside of the block
// console.log(b); // only exists in the block its defined
console.log(c); // only exists in the block its defined

// console.log(q); // this is function scope not block
// console.log(r);
// console.log(s);
function myFunc() {
    var q = 1;
    let r = 2;
    const s = 3;
}

// TODO try declaring and using variables inside and outside of a loop and function
// when can you reuse a variable?
for (let x = 1; x < 10; x++ ) {
    console.log(x);
}



// int x = 1;
var x = 1;
var x = 7; // this lets me!

let y = 2; // this is what we want to use the most, it can be reassigned but not redeclared
// let y = 3; // cannot reassign variable declared with let

const z = 3; // constant - cannot be reassigned
// z = 4; // TypeError: Assignment to constant variable.


/**
 * Problems with var:
 * - let's us redeclare a variable of the same name which can create unexpected bugs
 * - let's us use a variable before it is assigned which can cause unexpected behaviour
 * - 
 */