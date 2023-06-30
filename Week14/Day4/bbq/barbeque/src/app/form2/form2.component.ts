import { Component } from '@angular/core';
import { Barbeque } from '../barbeque';
import { BarbequeService } from '../barbeque.service';
import {FormGroup, FormControl, Validators} from '@Angular/forms'

@Component({
  selector: 'app-form2',
  templateUrl: './form2.component.html',
  styleUrls: ['./form2.component.css']
})
export class Form2Component {


  // this is hold the form data
 // model: Barbeque = new Barbeque();
myForm: FormGroup = new FormGroup({
  meatType: new FormControl('', [Validators.required]), 
  sauceType: new FormControl(''), 
  cookingStyle: new FormControl('', [Validators.required, Validators.min(1)]), 
  cookingTime: new FormControl(0), 
})
  constructor(private service: BarbequeService){}
  
  onSubmit(){ // no parameter bc the data is at the class level
 this.service.save(this.myForm.value).subscribe((data) => 
 {
  console.log(data);
 });
}}
