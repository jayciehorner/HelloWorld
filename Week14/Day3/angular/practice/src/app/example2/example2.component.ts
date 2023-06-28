import { Component } from '@angular/core';

@Component({
  selector: 'example2',
  template: `
    <img [src]="imageUrl" alt="dog" >
  `,
  styles: [`font-size: 2em;`  ]
})
export class Example2Component {

  // we need a property we can bind to
  imageUrl: string = "https://publish.purewow.net/wp-content/uploads/sites/2/2021/06/smallest-dog-breeds-toy-poodle.jpg";

}