
/*
BAD  - each field must have a value or be 
       assigned a value in the constructor
class Party {
    host: String;
}
*/
/*
BAD - each field must be declared outsid teh constructor
class Pary {
    constructor(host: string) {
        this.host = host;
    }
}
*/

// word wrap alt-z

/*
/*
GOOD but verbose

class Party {
    constructor(host) {
        this.host = host;
    }
}
let friyay = new Party("Erica");
console.log(friyay);
*/
/*
GOOD Shortcut
*/
class Party {
    public readonly guestCount: number;

    // access modifer name: type inside the ( )
    constructor(public host: string,
        protected readonly theme: string) { 
        this.host = host;
        this.guestCount = 0;
        this.theme = theme;
    }
    public invite(name: string) {
        console.log(name + " you are invited to " + this.host + "'s party!")
    }

    // this is a getter it automatically generated a field
    // on my class using the method name as a property name
    public get music(): string {
        console.log("run some code here whenever this is accessed");
        return this.music;
    }

    // this is a setter 
    // it will run the method body every time someone
    // tries to set the field music
    // using myobj.music = "blank"
    set music(name: string) {
        console.log("running a setter method!!!")
        if (name) {
            this.music = name;
        }

    }
}
let friyay = new Party("Erica", "4th of July");
console.log(friyay);
console.log(friyay.host)
console.log(friyay.guestCount); // public readonly so allowed!
// friyay.guestCount = 1; // public readonly not allowed
/*
 ACCESS MODIFIERS
 - public = have access to it outside the class
 - private = don't have access to it outside the class
 - public readonly = can get the value but not set it
 - protected = accessible inside the class and in child classes
*/

class HolidayParty extends Party {
   describe() {
    console.log(this.theme + " party");
   }
}

let fourthJulyParty = new HolidayParty("Erica", "4th of July");
// fourthJulyParty.theme;
fourthJulyParty.describe();
// console.log(fourthJulyParty.myMethod);

// getters and setters let me run code
// whenever this field is accessed
// TODO debug where I created the infinite loop
// fourthJulyParty.music = "country";

class Book {
    private _title: string; // convention name private properties with _

    constructor(title: string) {
        this._title = title;
    }

    public get title(): string {
        return this._title;
    }

    public set title(title: string) {
        if (title.length > 2) {
            this._title = title;
        }
    }
}
let harryPotter: Book = new Book("Harry Potter, Book 1");
console.log(harryPotter.title); // ALLOWED to use getter method without ()

// shouldn't let me 
// harryPotter._title = ""; // NOT ALLOWED to direct access

harryPotter.title = ""; // ALLOWED to use setter method with assignment notation
// harryPotter._title = ""; // NOT ALLOWED direct access
console.log("title is still:", harryPotter.title)