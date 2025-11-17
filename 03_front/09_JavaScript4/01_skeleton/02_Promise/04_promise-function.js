// Promise 객체를 생성.
// 변수를 만드는 순간 Promise 객체가 생성됨.
let TaskPromise = new Promise();

// => 어떤 동작을 하면서, 그동작을 할 때
// Promise 객체를 만들고 싶을 때.

// 프라미스를 함수 안에 넣기
// 함수가 프라미스를 리턴하도록 함.
function TaskPromise() {
  return new Promise((resolve, reject) => {
    console.log("Task 작업 수행 중입니다.");
    if (true) {
      resolve("작업이 완료됐어요.");
    } else {
      reject("작업이 실패했어요");
    }
  });
}

TaskPromise()
  .then((response) => {
    console.log(response);
  })
  .catch((response) => {
    console.log(response);
  })
  .finally(() => {
    console.log("나는 무조건 실행됩니다.");
  });
