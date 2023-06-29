import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Example1Component } from './example1/example1.component';
import { Example2Component } from './example2/example2.component';
import { Example3Component } from './example3/example3.component';
import { Example4Component } from './example4.component';
@NgModule({
  declarations: [ // components I define are here
    AppComponent,
    Example1Component,
    Example2Component // normal components go here
  ],
  imports: [ // modules and standalones go here
    BrowserModule,
    AppRoutingModule,
    Example3Component, // standalones go here
    Example4Component // standalone component
  ],
  providers: [], // services we make list here
  bootstrap: [AppComponent] // like my main class in java
})
export class AppModule { }