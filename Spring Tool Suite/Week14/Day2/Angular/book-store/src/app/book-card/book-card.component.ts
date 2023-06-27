import { Component, OnInit } from '@angular/core';

@Component({ // decorator, tells angular this is a component with the following metadata
  selector: 'book-card', // this is the name of the custom html tag that you can add to any of my other components or ap.component.html
  templateUrl: './book-card.component.html', // this is linking the html displayed with the data stored in this class
  styleUrls: ['./book-card.component.css']
})
export class BookCardComponent  implements OnInit{

  constructor(){}

  ngOnInit(): void { // 
      
  }

}
