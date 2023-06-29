import { Component } from '@angular/core';

@Component({
  selector: 'example2',
  template: `
  <h1>Example 2 Property Binding</h1>
  <div class="flex">
    <img [src]="imageUrl" alt="dog" >
  </div>
  `,
  styles: [`font-size: 2em;`  ]
})
export class Example2Component {

  // we need a property we can bind to
  imageUrl: string = "https://publish.purewow.net/wp-content/uploads/sites/2/2021/06/smallest-dog-breeds-toy-poodle.jpg";

}