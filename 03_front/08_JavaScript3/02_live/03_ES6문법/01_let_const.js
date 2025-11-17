// let 블록스코프 / 재선언 X 재사용 O
let a = 100
{
  //블록 안에 있으므로 외부의 a와는 별개의 a
  let a = 200;
  console.log(a) // 200
}
console.log(a) // 100

// 함수 스코프도 스코프로 인정
let b = 100;
function info() {
  let b = 200; 
  console.log(b) // 200
}
info() // 200 
console.log(b) // 100

// const 블록스코프 / 재선언 X 재사용 X
const name = "haley";
console.log(id);
id = "chae"; //불가능
console.log(id);
