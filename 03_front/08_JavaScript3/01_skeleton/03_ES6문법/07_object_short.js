const id = "ssafy"
const name = "싸피"
const age = 6

// ES5
const member1 = {
  id: id,
  name: name,
  age: age,
  info: function () {
    console.log("info")
  },
}

// ES6
const member2 = {
  id,
  name,
  age,
  info() {
    console.log("info")
  },
}

// ES5
console.log(member1)

// ES6
console.log(member2)
