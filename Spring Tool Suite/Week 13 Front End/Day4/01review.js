/**
 * Which of these are truthy vs falsy
 */
// In js we have truthy and falsy, not just true or false
let x = 'a'; // truthy
x = ''; // falsy
x = [];
x = x.length;
x = {};
let y;
x = y;
x = Number("0");
x = Number("hello");
x = Number("false");
x = NaN;
x = null;
x = -0;