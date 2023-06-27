// /////////////////////////////////////////////
// Operators we haven't seen before 

////////////////////////////////////////////////
// **
console.log(2**3); // 2^3 = 8
console.log(3**2); // 3^2 = 9

// == vs === is 
//  == 
// ===
console.log("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee")
console.log(1 == '1'); // true - because uses type conversio
console.log(1 === '1'); // false - strict type
console.log(1 == '1' && typeof 1 == typeof '1');

////////////////////////////////////////////////
// ?? null coelescence operator
// similar to ternary operator
let x = null;
console.log(x == null ? "hello" : x); // fall back if x is null is to just use "hello"
console.log(x ?? "hello");
let y;
console.log(y ?? "cat"); // no value in y so we get the fallback

let s = ""; // falsy
console.log(x ?? "dog"); 

let o = {}; // truthy
console.log(o ?? {name: "Frodo", age: 101});

let a = []; // truthy
console.log([] ?? [1, 2, 3]); 

// TODO use the other falsy values with the null coalescent operator
// and some truthy values

let j = undefined;
console.log(j ?? "Hello world");


///////////////////////////////////////////////
// ?. optional chaining operator


///////////////////////////////////////////////
// || returns left operand when left operand is truthy (else returns right operand)
