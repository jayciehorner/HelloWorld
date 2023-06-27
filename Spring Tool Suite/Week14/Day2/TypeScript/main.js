var x = 10;
/*
Steps:
1. Create a ts file
2. Compile it using tsc main.ts
3. Turn on tsconfig settings for
    noEmitOnError: true
    outDir: "./build/js"
    rootDir: "./src"
    (notice you can change the target = "es2020" or an earlier version like "es2016" or "es3")
*/
// this is a typescript variable declaration with a type
var y = 10;
// y = '10'; // this compiles to perfectly valid javascript code
// if you want to use javascript you can, just ignore the typescript warnings
// if you want to force yourself to fix all the typescript errors, noEmitOnError = true
