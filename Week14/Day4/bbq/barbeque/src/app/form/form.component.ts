import { Component } from '@angular/core';
import { Barbeque } from '../barbeque';
import { BarbequeService } from '../barbeque.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {

  // this is hold the form data
barbequeItem: Barbeque = new Barbeque();

constructor(private service: BarbequeService){}

onSubmit(){ // no parameter bc the data is at the class level
this.service.save(this.barbequeItem).subscribe((data) => {
  console.log(data);
})
}

}