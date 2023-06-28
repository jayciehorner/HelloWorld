import { Component, OnInit } from '@angular/core';
import { Book } from "../models/Book";

@Component({ //decorator tells Angular this is a component with the following metadata
  selector: 'book-card', // this is the name of a custom html tag taht I can add to any of my other coponents or ap.compoent.html
  templateUrl: './book-card.component.html', // this is linking the html displayed with the data stored in this class
  styleUrls: ['./book-card.component.css']
})
export class BookCardComponent implements OnInit {
  books: Book[] = [];

  constructor() { }

  ngOnInit(): void { // methods and parameters have types now - specified using the format name: type
  }

}