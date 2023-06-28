class Parrot {
    species!: string

    constructor(
        public readonly color: string,
        public speaks: boolean,
        private _age: number,
        protected _favoriteFood: string = 'none'
    ) {
        this.color = color;
        this.speaks = speaks
        this._age = _age // CONVENTION is to name private fields starting with _ as a hint these should not be accessed directly
        this._favoriteFood = _favoriteFood
    }

    public getAge() {
        return `Hello, I'm ${this._age}`
    }

    public get favoriteFood(): string {
        return this._favoriteFood;
    }

    public set favoriteFood(name: string) {
        if (typeof name === "string" && name.length > 1) {
            this._favoriteFood = name;
        }
    }
}

const polly = new Parrot('green', true, 40)
console.log(polly.getAge())
polly.favoriteFood = "seeds";
// console.log(polly._age) // INVALID cannot access private fields outside class
// console.log(polly.favoriteFood) // INVALID cannot acess protected fields outside class or subclass

class Kea extends Parrot {
    // DEFAULT access mofidier is PUBLIC
    
    constructor(
        public elevation: number, // elevation in ft (Kea are a mountain parrot of New Zealand)
        // access modifier keywords  ommitted because these are just parameters
        //  and not new fields being declared since they are inherited
        // NOTE: cannot change inherited field's access modifiers more restrictive (but can change to readonly!)
        color: string,
        age: number,
        protected readonly _favoriteFood: string = "none"
        // _favoriteFood: string = 'none' is inherited
    ) {
        super(color, false, age);
        this.elevation = elevation;
    }

    public get favoriteFood(): string {
        return this._favoriteFood;
    }
}

const taika = new Kea( 1200, 'green', 4)
console.log("kea's favorite food is", taika.favoriteFood) // accessing getter method
// taika.favoriteFood = "seeds"; // readonly

// console.log(taika._favoriteFood) // cannot access protected field directly
// console.log(taika._age) // cannot access private field directly

/////////////////////////////////////

interface Printer {
  brand: string;  // No access modifiers in interfaces
  model: string;  // NOTICE we can define the instance properties the implementing class must have! unlike Java which only allows public static final props
  tonerLevel: number;
  isPrinting: boolean;

  print(document: string): void; 
  replaceToner(): void;
}

class LaserPrinter implements Printer {
    brand: string;
    model: string;
    tonerLevel: number;
    isPrinting: boolean;

    constructor(brand: string, model: string) {
        this.brand = brand;
        this.model = model;
        this.tonerLevel = 100;
        this.isPrinting = false;
      }

    print(document: string): void {
        if (this.tonerLevel <= 5)
            throw new Error("Low toner. Replace toner to print.");
      console.log(document + " Printing...");
      this.tonerLevel -= 2; // reduces by 2% each time 
    }
  
    replaceToner(): void {
        this.tonerLevel = 100;
    }
  }

const myPrinter = new LaserPrinter('hp', '12xx');
console.log("toner level is", myPrinter.tonerLevel));
myPrinter.print("myessay");
console.log("toner level is now ", myPrinter.tonerLevel));

//////////////////////////////////////

class Dog {
    static population: number = 0

    static getPopulation(): number {
        return Dog.population
    }

    public readonly id: number

    constructor(public name: string) {
        this.name = name
        this.id = ++Dog.population
    }
}

const spot = new Dog('Spot');
const chewy = new Dog('Chewy');
const sparky = new Dog('Sparky');
console.log("spot's id is", spot.id);
console.log("chewy's id is", chewy.id);
console.log("spary's id is", sparky.id);
console.log("dog population is now", Dog.population);
//////////////////////////////////

class FunParty {
    private _guests: string[]; // convention is to name private variables starting with _

    constructor() {
        this._guests = []; // initialize to empty array we can start adding to
    }

    public get guests(): string[] {
        return this._guests;
    }

    public set guests(value: string[]) {
        if (Array.isArray(value) && value.every(el => typeof el === 'string')) {
            this._guests = value;
        } else throw new Error('Guest list must be an array of strings');
    }
}

const myParty = new FunParty()
myParty.guests = ['Monica', 'Rachel', 'Chandler', 'Ross', 'Pheobe', 'Joey']; // I can use the guests(value) method like a property assignment
console.log(myParty.guests) // I can access the guests() method as if it was a property
myParty.guests = [...myParty.guests, 'Janice']; // I can use the spread operator to expand or "flatten" the array to usse its individual elements
console.log(myParty.guests)
myParty.guests = ['Emily', null]; // must be string data