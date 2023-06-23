// LOOPS IN JAVASCRIPT
// similar to java

for (let x = 1, y = 10; x < y; x++, y--) {
    console.log(`x=${x}, y=${y}`);
}

let count = 0;
while (count++ < 10) {
    console.log(count);
}

for (let x in [1, 2, 3, 4]) {
    console.log(x);
}

let person = {name: "Jo", height: "5'8\""};
console.log(person);
for (let fact in person) {
    console.log(`fact about person is ${fact} is ${person[fact]}`);
}

let hello = "hello";
for (let letter of hello) {
    console.log(letter);
}