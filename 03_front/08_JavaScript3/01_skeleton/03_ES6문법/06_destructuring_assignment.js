//구조 분해 할당
let user = {
  id: "ssafy",
  name: "lee",
  age: 30,
};

//ES6 이전
// let id = user.id;
// let name = user.name;
// let age = user.age;

// console.log(`${id}님의 이름은 ${name} 이고, 나이는 ${age}살 입니다.`);

//ES6 이후
let { id, name, age } = user;
console.log(`${id}님의 이름은 ${name} 이고, 나이는 ${age}살 입니다.`);

//함수 객체 리턴
function getUser() {
  return {
    id2: "ssafy",
    name2: "kim",
    age2: 20,
  };
}

// let user2 = getUser();
// let id2 = user2.id;
// let name2 = user2.name;
// let age2 = user2.age;

//ES6
let { id2, name2, age2 } = getUser();
console.log(`${id2}님의 이름은 ${name2} 이고, 나이는 ${age2}살 입니다.`);

let member = {
  id: "admin",
  name: "관리자",
  age: 50,
};

//ES6 이전 직접 대입
function showMember(member) {
  console.log("showMember1");
  console.log("아이디: ", member.id);
  console.log("이름: ", member.name);
  console.log("나이: ", member.age);
}

//ES6 이후 destructuring_assign 적용
function showMember2({ id, name, age }) {
  console.log("showMember2");
  console.log("아이디:", id);
  console.log("이름:", name);
  console.log("나이:", age);
}

showMember(member);
showMember2(member);

let arr = [1, 2, 3, 4];
let [a, b, c] = arr;
console.log(a);
console.log(b);
console.log(c);
