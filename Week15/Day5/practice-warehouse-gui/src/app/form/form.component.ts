import { Component } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Warehouse } from '../warehouse';
import { WarehouseService } from '../warehouse.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent {

  model: Warehouse = new Warehouse();

  constructor(private service: WarehouseService){}

  onSubmit(){
    this.service.save(this.model).subscribe((data) => {
      console.log(data);
    })
  }
}
