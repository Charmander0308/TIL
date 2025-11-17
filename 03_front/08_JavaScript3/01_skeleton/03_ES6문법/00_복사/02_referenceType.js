// Reference Type - Shallow Copy
console.log("# Reference Type - Shallow Copy")
let c = { myKey: 'original value' }
let d = c

c.myKey = 'edited value'

console.log(c) // { myKey: 'edited value' }
console.log(d) // { myKey: 'edited value' }