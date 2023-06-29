import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'example4',
  template: `
    <h1>
      Example 4: Event binding
    </h1>
    <button (click)="reset()">Clear</button>
    <button (click)="doSomething()">Click Me!</button>
    <p> {{ content | lowercase }}</p>
  `,
  styles: [ `p { 
    font-family: veranda, sans serif;
  }` ],
  standalone: true,
  imports: [CommonModule],
})
export class Example4Component {
  content: string = "Cats are awesome!\n";

  doSomething() {
    this.content += "Cats are awesome!\n";
  }
  reset() {
    this.content = "Cats are Awesome!\n"
  }
  // TODO add one more event binding 
  // on click of an img html element
  // change the size (note this is a property not the content of the tag)
}