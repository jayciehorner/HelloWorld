import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListComponent } from './list/list.component';
import { FormComponent } from './form/form.component';
import {FormsModule, ReactiveFormsModule} from '@Angular/forms';
import { HttpClientModule } from "@angular/common/http";
import { Form2Component } from './form2/form2.component'


@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    FormComponent,
    Form2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }