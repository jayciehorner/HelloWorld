// all of this code needs to wait till the DOM content is loaded

window.addEventListener('DOMContentLoaded', () => {




    let btn = document.getElementById("factbtn");
    btn.addEventListener("click", () => {

        let xhr = new XMLHttpRequest();
        // set up our GET request
        // set up a function that the browser runs every time my xhr object changes
        //   so I can check if my data has been received!!!!

        xhr.open('GET', "https://catfact.ninja/fact");

        /**
        *  0 (uninitialized) or (request not initialized)
        •	1 (loading) or (server connection established)
        •	2 (loaded) or (request received)
        •	3 (interactive) or (processing request)
        •	4 (complete) or (request finished and response is ready)
        
         */
        xhr.onreadystatechange = () => {
            if (xhr.readyState === 4) {
                // parse the data to display to the screen
                let data = JSON.parse(xhr.responseText);
                // where do I want to display the text?
                let txtbox = document.getElementById("fact-txt");
                txtbox.innerText = data.fact;
            }
        };
        xhr.send();
    });

    // I need to prevent the default  behavior of my
    //  form submission and run my code instead
    let myform = document.getElementById("book-form");

    myform.addEventListener("submit", (e) => {
        e.preventDefault(); // don't let the html form do it's thing run the below code instead
        // grab the form data
        let data = new FormData(myform);
        let object = {};
        data.forEach((value, key) => object[key] = value); // TODO read up on prototypes and objects in js
        let json = JSON.stringify(object);
        let xhr = new XMLHttpRequest();
        xhr.open("POST", "http://localhost:8081/books");
        xhr.setRequestHeader("Content-Type", "application/json");
        xhr.onreadystatechange = () => {
            if (xhr.readyState === 4) {
                // parse the data to display to the screen
                let response = JSON.parse(xhr.responseText);
                // where do I want to display the text?
                console.log(response);
            }
        };
        xhr.send(json);

    })


});