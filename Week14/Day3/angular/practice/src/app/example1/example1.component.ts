import { Component } from '@angular/core';

@Component({
  selector: 'example1', // use this to put the component on a page using html tag syntax
  templateUrl: './example1.component.html',
  styleUrls: ['./example1.component.css']
})
export class Example1Component {

  // the default access modifier is PUBLIC
  // THIS IS DIFFERENT THAN JAVA which
  // has a default of package private
  count: number = 1;

}