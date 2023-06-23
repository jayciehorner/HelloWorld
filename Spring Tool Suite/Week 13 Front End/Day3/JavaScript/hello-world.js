// Goal: Print out Hello World
console.log("hello world!")

// TODO put a screenshot of a console.log in the chat

/**
 * This is a multiline comment
 */

// This is a single-line comment

/**
 * Goal: Write our own functions (what JavaScript calls methods)
 * - No access modifier
 * - No return types
 * - No parameter types
 */
greet("Ann", "Barbara"); // This is only possible becasue of hoisting

function greet(name, name2) {
    console.log("Hello, " + name);
    console.log("Hello, "  + name2) // This line didn't end with a semicolon! Js adds them for you if you forget
                                   // This can cause unexpected behavior
    console.log(`This is a special string ${name}`); // template literal ${varname}
}

//================================================================================================
// TODO write a method that takes in some values and prints them using a template string 
// (example on line 24)
//================================================================================================
greet("Bob", "Sue");

greet("jo");


greet("jo","jay","jon"); // This doesn't break, but it doesn't use the third argument, it is ignored

/**
 * We can't really override functions, but we can give the parameters default values
 */

function calcAreaOfRect(x=1, y=1) {
    console.log(`x=${x}, y=${y}`)
    return x * y;
}

console.log(calcAreaOfRect(15));
console.log(calcAreaOfRect(15, 2));
console.log(calcAreaOfRect(undefined, 2));
console.log(calcAreaOfRect(5, 2, 10));