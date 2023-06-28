import { Component } from '@angular/core';
import { CommonModule  } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'example3',
  templateUrl: './example3.component.html',
  styleUrls: ['./example3.component.css'],
  standalone: true,
  imports: [CommonModule, FormsModule],
})
export class Example3Component {

  imgUrl: string = "";



}