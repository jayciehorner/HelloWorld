"use strict";
/*

BAD - each field must have a valuie or be assigned a value in the constructor
class Party{
    host: String;
}

BAD - each field must be declared outside the constructor
class Party{
    constructor(host: string){
        this.host = host;
    }
}
*/
Object.defineProperty(exports, "__esModule", { value: true });
exports.Party = void 0;
/*
GOOD but verbose
*/
// class Party{
//     host: string;
//     constructor(host: string){
//         this.host = host;
//     }
// }
// let friyay = new Party("Erica");
// console.log(friyay);
class Party {
    constructor(host, theme) {
        this.host = host;
        this.theme = theme;
        // access modifier name: type inside the ()
        this.host = host;
        this.guestCount = 0;
        this.theme = theme;
    }
    invite(name) {
        console.log(name + " you are invited to " + this.host + "'s party!");
    }
    get myMethod() {
        return "something";
    }
}
exports.Party = Party;
let friyay = new Party("Erica", "4th of July");
console.log(friyay);
console.log(friyay.host);
console.log(friyay.guestCount);
class HolidayParty extends Party {
    describe() {
        console.log(this.theme + " party");
    }
}
let fourthJulyParty = new HolidayParty("Erica", "4th of July");
fourthJulyParty.describe();
