import { Component, OnInit } from '@angular/core';
import { Barbeque } from '../barbeque';
import { BarbequeService } from '../barbeque.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit{


  barbequeItems: Barbeque[]=[];

// Inject the BarbequeService
constructor(private service: BarbequeService){}


// a lifecycle hook method is where we should call the service
ngOnInit(){
this.service.findAll().subscribe((data) => {
this.barbequeItems = data;
});
}
}
