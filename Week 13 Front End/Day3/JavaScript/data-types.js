/**
 * DATA TYPES IN JAVASCRIPT
 * 
 * PRIMITIVE
 * - int, long, byte, short, float, double are all the same to JavaScript
 * 
 * - we can store any value in any variable
 * - the types JavaScript cares about 
 *    number
 *    bigInt
 *    string
 *    boolean
 * 
 * NON-PRIMITIVE
 * 
 *   object - includes arrays, and Objects
 *   Symbol (we won't use this data type)
 * 
 * 2 More types
 *    null - this again is a placeholder for an object when we don't have any
 *    undefined - this is a value given when a variable has been declared but not initialized
 */

console.log(typeof 1);
console.log(typeof false);
console.log(typeof "Hello");
console.log(typeof 'Hello'); // JavaScript doesn't care whether you use '' or ""
console.log(typeof "H");
console.log(typeof 'H');
console.log(typeof 3n);
console.log(typeof {"name":"Erica", "favoriteFood": "apples" });
console.log(typeof [1, 2, 3]);
console.log(typeof [1, "Hello", true]);
console.log(typeof null);
console.log(typeof undefined);