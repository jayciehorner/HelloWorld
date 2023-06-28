console.log("hello");
/**
 * Which of these are truthy vs falsy
 */

// In js we have truthy and falsy not just true and false
let x = 'a'; // truthy
x = ''; // falsy
x = []; // truthy
x = x.length; // is this null or undefined =>falsy
x = {}; // truthy
let y; // NOTE: declaring and not initialzing sets the value to undefined
x = y; // falsy
x = "0"; // truthy

x = Number("0"); // is this a strig of 0 => truthy? explicit casting will turn it into a number => fals
x = Number("hello"); // falsy casting to number and passed invalid number string 
x = Boolean("false"); // Boolean creates a Boolean based on the paramter's truthy or falsy state
x = Boolean(""); // Boolean creates a Boolean based on the paramter's truthy or falsy state

// x = NaN; // falsy
x = null; // null is a placeholder -- falsy 
// x = null == undefined; // loosely speaking they are 
// x = null === undefined; // strictly speaking these aren't the same
x = -0; // falsy


let t = typeof x;
console.log(`x is currently ${x} and is of type ${t}`);

if (x) {
    console.log("truthy");
} else {
    console.log("falsy");
}
console.log("good bye");

/**
 * Falsy values in JS are
 * ----------------------
 * - '' empty string
 * - 0
 * - -0
 * - 0n is BigInt value of 0 (BigInt = arbitrary large number uses however many bits it needs so never underflows/ overlows)
 * - false
 * - undefined
 * - null
 * - Boolean(of any falsy)
 * 
 * Truthy values
 * -------------
 * - [] empty array
 * - {} empty objects
 * - 'a' string with values
 * - 10 nonzero values
 * - Boolean(of any truthy)
 */