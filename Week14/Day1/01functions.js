// Ways to define a function

// 1 using named function keyword
function hello(name) {
    console.log("hello " + name);
}
hello("Erica");
// 2 using function keyword
const greet = function(name) {
    console.log("Greetings " + name);
}
greet("Joey");

// 3 using lambda
const sum = (x, y) => {
    return x + y;
}
console.log(sum(1, 2));

// 4 using methods
// functions declared inside an object are called "methods"
let person = {
    name: "Frodo", 
    age: 101,
    greeting(name) {
        console.log("Hi there" + name);
    }
    // greeting: function(name) {
    //     console.log("Hi there " + name);
    // }
}
person.greeting("Sam");

// TODO write an object literal with methods
// call the methods of your object

let cookie = {
    type: "chocolate chip",
    prepTime: "15 mins", 
    cookTime: "10 mins", 
    bake(type){
        console.log("I am baking " + type)
    }
}

cookie.bake("sugar cookies");
console.log(cookie)