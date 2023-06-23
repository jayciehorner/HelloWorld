// This is a JAvaScript file that I am using in the index2.html file
//Let's try and grab an html element using some built in js apis

// Step1: To grab an HTML element, we need to use the DOM
/**
 * DOM = document object model
 * - the DOM is an interface that lets us interact with the elements on the page
 * - DOM is a hierarchy of objects that models the html elements on the page
 * - document
 * 
 * 
 */
let div1 = document.getElementById("1");
let div2 = document.getElementsByClassName("dark-mode").item(0);
let div3 = document.getElementById("2");
let h1 = document.querySelector("h1");
let btn = document.getElementById("myBtn");
// let div1 = document.queerySelector("#1");
// let div2 = document.queerySelector(".dark-mode");

// Add an event listener to run my code when the button is clicked
btn.addEventListener('click', () => {
    // And change the font size and color of div1
    div1.style.fontSize = "2em";
    div1.style.color = "lightcoral";
    div3.style.fontSize = "4em";
    div3.style.color = "darkseagreen"
    
    // Remove the dark-mode class from div2
    div2.classList.toggle("dark-mode"); // toggle allows you to reuse the button
    div3.classList.toggle("dark-mode");
})

console.log(div1);
console.log(div2);
console.log(h1);