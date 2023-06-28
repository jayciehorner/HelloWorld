// BOOLEAN IN JAVASCRIPT
/**
 * Unlike Java, values in JavaScript can be 
 * == comparison will do type-conversion
 * === comparison is type-safe
 */
console.log(1 == 1)
console.log(1 === 1)
console.log(1 == "1") // true
console.log(1 === "1") // false

console.log("==============Testing Truthy values===============")
function test(x) {
    if (x) {
        console.log(`x=${x} is true`)
    } else {
        console.log(`x=${x} is false`)
    }
}
test(1);
test(0);
test(-1);
console.log("Strings")
test("hello");
test("");
test("  ");
test(null);
test(undefined);
test("0")
console.log("non-primitives")
test([1,2,3]);
test([]);
test({a:1, b:2});
test({});
test(null);
/**
 * Falsy
 * ------
 * false
 * 0
 * null
 * undefined
 * ""
 * ''
 * NaN
 * 0.0
 * -0
 * 
 * Truthy
 * ------
 * " "
 * []
 * {}
 * "0"
 * "false"
 */
console.log(NaN);
test(NaN);

