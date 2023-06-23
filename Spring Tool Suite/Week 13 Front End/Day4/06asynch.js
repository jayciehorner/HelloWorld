// JavaScript has some functions similar to Java's thread methods
// We can delay execution of our functions or run them at set intervals
// JAVASCRIPT IS NOT MULTITHREADED it uses AN EVENT LOOP asynch function to get put on a queue
let numDiv = document.getElementById("num");
//numDiv.innerHTML = "<b>this will be bold</b>"
numDiv.textContent = x;
setTimeout(() => {
    numDiv.textContent = "Whoohoo!";
}, 3000); // code to run and how long to wait in miliseconds