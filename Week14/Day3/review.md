# Angular Intro

## Review of Angular

Angular is a platform for developing single page applications.

- Angular CLI - tool for developing and deploying our application

- Angular framework - structure how we scaffold our project

- Angular libraries - we've been using @angular/core library (like java.utils) today we will use others like RxJS 

## Important pieces of our Angular project

- project
```
ng new my-project-name
```
> When prompted say Y to adding routing
> When prompted choose CSS for your stylesheets
- component
    - To generate a component use:
    ```
    ng generate component name-of-component
    ```
> useful options
> `--inline-template` so I can put the html in a string in the ts file for fewer files to manage
> `--inline-style` to put the CSS in a string likewise
> `--flat` to avoid creating separate folders for each component
- service
- modules -- organize our project into namespaces and let us group together reusable components
-- Angular 14 introduced standalone components
```
ng generate component comp-name --standalone
```
> Modules are not like folders they are defined
> using a configuration file. The file is
> actually just a .ts file with a class
> annotated with @NgModule
> with a bunch of metadata about the module
>
## New Concepts to Cover Today

### Data binding

Angular supports two-way data binding. 

#### *Template literals*

We can define some data in the .ts file and referer to it in the .html template.

In my html I can use `<h1>{{ property }}</h1>`

#### *Pipes*

- Pipes are for formatting the values in a template literal.
    - we've got useful formatters for strings
    - we've got useful formatters for numbers
    - we've got useful ones for dates and currency as well
- To define your own "formatters" pipes we can create a class annotated with @Pipe and metadata for the name of the pipe. The class implements one interface PipeTransform with the tranform method that gets applied to the value. To actually use it in your component, add it to the @Component meta data object {declarations:[nameofyourpipeclas]}

#### *Property binding*

Instead of displaying data, let's use the data in the component.ts file to set the properties of html elements in the template.

Example: The src of an image can be set using the notation

`<img [src]="imgUrl" >` inside the "" is a field or method from the component.ts

[] = property binding and is one-way
[()] = banana in a box notation is two-way
commonly used on an input field to so the 
property in component.ts

```
<input [(ngModel)]>="nameoffieldtoset" >
```

#### *Directives*

1. structural 
    a. ngFor -- This is used with a for each loop on the element you want repeated 
    ```
    <li *ngFor="let something of somethings">{{ something }} </li>
    ```
    b. ngIf
        we'll need to talk about `<ng-container>`
    c. ngSwitch

2. attribute directives
     a. ngClass
     b. ngStyle
     c. ngModel -- talk about forms

### Event binding


### Services

- dummy data
    `RxJS` classes Observable and of need to be imported
- api data
    `HTMLClient`

### Routing

### Forms
