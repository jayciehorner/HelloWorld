let x = 10;

/*
Steps:
1. Create a ts file
2. Compile it using tsc main.ts
3. Turn on tsconfig settings for 
    noEmitOnError: true
    outDir: "./build/js"
    rootDir: "./src"
    (notice you can change the target = "es2020" or an earlier version like "es2016" or "es3")
*/
// this is a typescript variable declaration with a type
let y: number = 10;

// y = '10'; // this compiles to perfectly valid javascript code
         // if you want to use javascript you can, just ignore the typescript warnings
         // if you want to force yourself to fix all the typescript errors, noEmitOnError = true

// note: there is a type called any
let z: any;
z = 2;
z = "hello";
z = false;

////////////////////////////////////////////////////
// defining our own types

type AlphaNum = string | number;

let n: AlphaNum;
n = 2;
n = "hello";
// n = false; // n must be a string or a number

// when is this useful?

let a = 1;
let b = '2';
// let c = a + b;
// console.log(c);

let dog = {name: "spot", };

let dog2 = {name: "sport"};

dog = dog2; // these objects have the same inferred type

type one = {name: string, hungry: boolean} // this type has two required fields
type two = { name: string, age?: number}// ? means optional so this type has 1 required field and 1 optional
type cat = one | {name: string} | two // types are sets

let cat1: one = {name: "thunder", hungry: true};
let cat2 = {name: "Fluffy", hungry: true};
cat2 = cat1;

let cat3: cat = {name: "Tiger"}
cat3 = {name: "Tigger", age: 3}
cat3 = {name: "Ti", age: 3, hungry: false};

// Type literals
type Option = "yes" | "no";
let userInput: Option;
userInput = "yes";
userInput = "no";
// userInput = "maybe";
// userInput = 1;

///////////////////////////////////////////////
// Using Type Assertions




//////////////////////////////////////////////////////////////
// Define an object type

//////////////////////////////////////////////////
// Use type assertions when accessing DOM elements