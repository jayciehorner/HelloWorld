// TODO create a constructor function
// Add 1 property and 1 method after the fact
// Test that the property exits 
//  and call the method

// Construtor functions (old way)
function Person(name, age) {
    this.name = name;
    this.age = age;
}
const drizzt = new Person("Drizzt", 400);
console.log(drizzt);

drizzt.dodge = function(attack) {
    console.log("Drizzt dodged the " + attack);
}
drizzt.dodge("sword");

const jim = new Person("Jim", 38);
jim.parry = function(attack) {
    console.log("Jim parried the " + attack)
}
jim.parry("Axe");

// drizzt.parry("Axe");
// jim.dodge("Sword");

console.log(jim.hasOwnProperty("dodge")); // hasOwnProperty
console.log(drizzt.hasOwnProperty("dodge")); // hasOwnProperty

// ECMAScript 6 - this is a standard for the JavaScript language that browsers follow
// older browsers may not support these newer features of the JavaScript language
class Animal {
    static #numAnimals = 0; // marks the property as private
    constructor(name, age) {
        numAnimals++;
        this.name = name;
        this.age = age;
    }
    static get numAnimals() {
        return Animal.#numAnimals;
        
    }
    
}

const cat = new Animal("Fluffy the cat", 5);

let num = cat.getNumAnimals();
console.log(`num of animals is ${num}`); // template literal is like our Java String.format