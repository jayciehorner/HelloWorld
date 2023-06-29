import { Component, EventEmitter, Input, Output, OnInit } from '@angular/core';

@Component({
  selector: 'child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {

  @Input()
  name: string = "Child of mine"; // default

  @Input()
  parentName!: string; // ! means trust me it's going to be there

  @Output()
  nameEmit: EventEmitter<string> = new EventEmitter();

  // lifecycle methods should be where we put most our startup code logic
  ngOnInit() {
    console.log("emitting event name")
    this.nameEmit.emit(this.name);
  }


}