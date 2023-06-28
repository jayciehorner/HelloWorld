import { Component } from '@angular/core';

@Component({
  selector: 'example1',
  templateUrl: './example1.component.html',
  styleUrls: ['./example1.component.css']
})
export class Example1Component {

  // default modifier is public
  // DIFFERENT THAN JAVA which has a default of package private
count: number = 1;
}
