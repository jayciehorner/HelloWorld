# Review of Angular

## Angular

Angular is a platform for developing single page applications.
- Angular CLI - tool for developing and deploying our application

- Anguar framework -- structure how we scaffold our project

- Angular libraries -- we've been using @angular/core library (like java.utils) today we will use others like RxJS

## Important pieces of our Angular project
- project 
    - to generate new project use:
        ng new 'my-project-name'
- component
    - to generate a new component use:
        ng generate component 'name-of-component'
- service
- modules -- organize our project into namespaces and let us group together reusable components
- Angular 14 introduced standalone components
    ng generate component 'comp-name' --standalone

useful options:
`--inline-template` so I can put the html in a string in the ts file for fewer files to manage
`--inline-style`