let x = 10; // type inference - this will for ever more be a number
// x = "hello"; // doesn't work

/*
Steps:
1. Create a ts file
2. Compile it using tsc main.ts
3. Turn on tsconfig settings for
      noEmitOnError: true
      outDir: "./build/js"
      rootDir: "./src"
      (notice you can change the target = "es2020" or an ealier version like "es2016" or "es3")
*/

// This is a typescrpt variable declaration with a type
let y: number = 10;

// y= '10'; // This compiles to perfectly valid javascript code
        // if you want to use javascript you can, just ignore the typescript warnings
        // if you want to force yourself to fix all the typescript errors, noEmitOnError = true in the tsconfig.json or using --noEmitOnError on the command line

// note: there is a type called any
let z: any;
z = 2;
z = "hello";
z = false;

///////////////////////////////////////////////////////////////
// Defining our own types

type AlphaNum = string | number; // type alias

let n: AlphaNum;
n = 2;
n = "hello";
// n = false; // n must be a number or string

// When is this useful?
let a = 1;
let b = '2';
// let c:number = a + b;
// console.log(c);

let dog = { name: "Spot", };

let dog2 = { name: "Sport"};

dog = dog2; // these objects have the same infered type

type one = { name: string, hungry: boolean } // this type has 2 required fields
type two = { name: string, age?: number} // ? means optional so this type has 1 required field and 1 optional
type cat = one | { name: string} | two; // types are sets 

let cat1: one = {name: "Thunder", hungry: true};
let cat2 = {name: "Fluffy", hungry: true}; // infered type is { name: string, hungry: boolean}
cat2 = cat1; // not the same type but have the same "shape"

let cat3: cat = {name: "Tiger"}
cat3 = {name: "Tigger", age: 3}
cat3 = {name: "Tig", hungry: false}
cat3 = {name: "Ti", age: 3, hungry:false};

// Type literals
type Option = "yes" | "no";

let userInput: Option;
userInput = "yes";
userInput = "no";
// userInput = "maybe";
// userInput = 1;


/////////////////////////////////////////////////////
// Using Type Assertions (sometimes you may hear people call this type casting the docs call it assertions)

// Let's grab an element from the dom
// DOM = document object model
let divP = document.querySelector("p"); // or I could put the ! when I use div!
console.log(divP)
divP!.style.fontSize = "2em";
divP!.style.textAlign = "center";

let divPbetter = divP as HTMLParagraphElement; // I'm telling TypeScript I know more than it

// We can also define types using interfaces

interface Dog {
      name: string,
      age?: number // here I can make this optional
}

// When to use interface vs type
// - interfaces let you extend them
// - interface lets you keep adding fields to the interface itself (like javascript objects we can define more properties and methods on)
// - types don't let you redefine them or use the extends keyword

type a = string;