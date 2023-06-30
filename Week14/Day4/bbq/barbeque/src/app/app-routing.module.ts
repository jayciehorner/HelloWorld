import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListComponent } from './list/list.component';
import { FormComponent } from './form/form.component';
import { Form2Component } from './form2/form2.component';

const routes: Routes = [{path: "list", component: ListComponent, title: "Barbeque List"}, 
                        {path: "form", component: FormComponent, title: "Add Barbeque"}, 
                        {path: "Form2", component: Form2Component, title: "Add Barbeque | Reactive Form"}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }