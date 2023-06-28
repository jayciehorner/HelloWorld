import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Example1Component } from './example1/example1.component';
import { Example2Component } from './example2/example2.component';
import { Example3Component } from './example3/example3.component';
@NgModule({
  declarations: [ 
    AppComponent,
    Example1Component,
    Example2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    Example3Component
  ],
  providers: [], // services we make list here
  bootstrap: [AppComponent] // like my main class in java
})
export class AppModule { }