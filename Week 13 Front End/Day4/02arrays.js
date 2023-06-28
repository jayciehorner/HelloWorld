// ARRAYS in JavaScript ar more like ArrayLists in Java
// JS Array functions to play around with
// and Higher Order Functions 
/**
 * - push, pop, shift, splice, slice, indexOf
 */
let nums = [1, "2", false, {}]; // note in Java int[] nums = {1, 2, 3};
console.log(nums); // prints [ 1, '2', false, {} ]

/**
- array literals use the notation [1, 2, 3]
- arrays also have a constructor new Array(1); // length
- arrays can contain any combination of data types in any order
 */
nums = Array(1); // new Array(1);
console.group(nums); // [ <1 empty item> ]

console.log(nums[0]); // undefined
nums[0] = 10;
console.log(nums[0]);

nums[10] = 100;
console.log(nums[10]);
console.log(nums);
console.log(nums[9]);

/**
 * Array methods we can use
 * - push = add to the end
 * - pop = remove from the end
 * - shift = remove from the beginning
 * - unshift = add to the  beginning
 */

// TODO take a few minutes and play around with each of the above
// use each of the 4 methods
nums.push(2);
console.log(nums);
console.log("------------------------------------")
console.log("------------------------------------")
let arr1 = [];
arr1.pop(); // will this throw an error?
arr1.unshift(2);
console.group(arr1);
arr1.push(1);
console.group(arr1);
arr1.pop();
console.group(arr1);
arr1.shift();
console.group(arr1);
console.groupEnd();
console.log("End of file");

/**
 * splice - removes and/or inserts elements at a particular index
 *  syntax: splice(starting index, how many to remove, insertion item 1, insertion item 2, etc.)
 */
const arr2 = [1, 2, 3, 4, 5, 6, 7, 8, 9];

// Remove the numbers 2, 3, 4
arr2.splice(1, 3);
console.log(arr2); // [ 1, 5, 6, 7, 8, 9 ]
                   //   0  1  2  3  4  5
// Remove the numbers 5, 6, 7 and add in the numbers 50, 60, 70, 80
let arrSpliced = arr2.splice(1, 3, 50, 60, 70, 80);
console.log(arr2);

console.log(arrSpliced); // returned array is the elements that were removed

let result = arr2.splice(5, 3); // this is too many elements to remove
console.log(arr2);
console.log(result);

// TODO take a few minutes and play around with slice
// slice = returns a copy of a particular portion of your array
// QUESTION: 
// 1. What parameters does it take?
//    -- Takes in 2 parameters: start, end exclusive
// 2. Does slice effect the original array? NO!
// 3. What happens if I use parameters that are
//    too large or negative?

console.log("------------slice examples-----------------")
let test = [10, 20, 30, 40];
//           0   1   2   3   indexes
let other = test.slice(1, 3); // start, end exclusive
console.log("test arr: ", test);
console.log('--slicing out indexes 1 to 3 exclusive')
console.log("result of slice arr: ", other);
console.log("test arr is still: ", test);
console.log("--slicing out 1 to 10 exclusive even though too high")
console.log("result of slice arr: ", test.slice(1, 10));
console.log("--slicing out -1 to 1 exclusive")
console.log("result of slice arr: ", test.slice(-1, 1));
console.log("in general, when I access a negative index, what happens?");
console.log("test[-1]", test[-1]);
console.log("test[-2]", test[-2]);
console.log("test[-3]", test[-3]);
console.log("------------slice examples ends-----------------")



// What happens when array index is negative?
console.log([1,2,3][-2]);

///////////////////////////////////////////////////////////
//                  ASIDE                                //
///////////////////////////////////////////////////////////
// What happens when I assign one arr to another variable//
///////////////////////////////////////////////////////////
let original = [1, 2, 3];
let copy = original;
console.log(`original ${original}`);
console.log(`copy ${copy}`);
console.log("--------pop on copy---------")
copy.pop();
console.log(`original ${original}`);
console.log(`copy ${copy}`);
// To avoid this const isn't enough
const ori = ['a', 'b', 'c'];
const cop = ori;
console.log(`ori ${ori}`);
console.log(`cop ${cop}`);
console.log("--------pop on cop---------")
cop.pop();
console.log(`ori ${ori}`);
console.log(`cop ${cop}`);
// const prevents me from doin reassignment
// ori = [1, 2, 3]; // TypeError: Assignment to constant variable.
ori[0] = 200;
console.log("------changing value at index 0 in ori----------")
console.log(ori);

// To prevent copy from changing original
let originalFixed = [1, 2, 3];
// spread operator
let copyFixed = [ ...originalFixed ];

console.log(`originalFixed ${originalFixed}`);
console.log(`copyFixed `);
console.log(copyFixed)
console.log("--------pop on copyFixed---------")
copyFixed.pop();
console.log(`originalFixed ${originalFixed}`);
console.log(`copyFixed is `);
console.log(copyFixed);

let copy2 = [originalFixed];
console.log(`copy2 without the spread operator of originalFixed is `);
console.log(copy2);

// Note the spread operator is how we can create a copy quickly
// The spread operator just expands the elements of a collection 
//   so it is treated as a comma separated list to a method or array creation etc.

let copy3 = Array(originalFixed);
let copy4 = Array(...originalFixed);
console.log("----------- other way of creating an array ---------------")
console.log("original", originalFixed)
console.log(copy3);
console.log(copy4);

///////////////////////////////////////////////////////////
//                  END OF ASIDE                         //
///////////////////////////////////////////////////////////

/**
 * Arrays have methods for iterating over each element and performing some operation
 * for example
 * - forEach
 * - filter
 * - map
 * - reduce
 * NOTE JAVASCRIPT IS a OOP and functioal programming language
 */
console.log("-------------------------");
let names = ["Anna", "Ann", "Annabell Lee"];
names.forEach((el) => console.log(el)); // NOTE: lambda notation is different arrow use => NOT ->

// forEach takes a consumer = one param and no return
// filter tests each value to see if it meets some condition
//       it takes a predicate = one param and boolean (true or false or truthy falsy) returned
// map takes a value and changes it returning a new value = one param and one returned value
// reduce compares all the elements and returns a single value result ex: finding the max
//     = lambda must have two parameters and one return value
//    NOTE: reduce(lambda, optional start value)
console.log("filtering on contains \"Anna\"");
names.filter((el) => { el.includes("Anna")}).forEach(el => console.log(el));
console.log("did the oringal change?", names)
/**
 * Lambda notation rules
 * - use an arrow between the params and body
 * - use () around the parameters
 *    except () are optional when a single argument (none or multiple they are required)
 * - use {} around the body 
 *    except optional when when a single statement (multiple statments {} required)
 * - use return statements 
 *    except return keyword cannot be used if no curly braces (this is javascript specific)
 *    when only one statement, and no return keyword it is implied. 
 */

// TODO write .map(lambda that capitalizes everything)
// names.map(el => console.log(el.toUpperCase())).forEach(newEl => console.log(newEl));
names.map(el => el.toUpperCase).forEach(newEl => console.log(newEl));

// Reduce example:
let numsForRed = [10, 40, 30, 40, 10];
let sum = numsForRed.reduce((num1, num2) => {
    return num1 + num2; // 230 should be final result
}, 0);
console.log(sum);