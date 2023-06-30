export class Barbeque {
    // This has to match the field names the backend is expecting
    // I don't need an id that is going to be generated on the backend
    constructor(public id: number = 0,
                public meatType: string = "",
                public sauceType: string = "",
                public cookingStyle: string = "",
                public cookingTime: number = 0) { 

        }
}