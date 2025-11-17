// Promise 생성
// Promise 생성자에 (resolve, reject) 파라미터로 하는 함수를 집어 넣음.
const p = new Promise((resolve, reject) => {
  console.log("p 작업이 수행 중입니다.")
  // 1. 작업을 수행
  let task = true
  // 작업(성공할 수도 있고 실패할 수도 있는)을 수행
  // 시간이 오래 걸리는 작업

  // 2. 작업의 수행 결과를 결정
  // 성공 또는 실패로 끝맺음
  // resolve(msg) 함수를 호출하면 성공하고 끝남
  // reject(msg, object, array...) 함수를 호출하면 실패로 끝을 맺음
  // resolve, reject 함수의 파라미터로 결과를 전달할 수 있음.
  if (task) {
    resolve("p 작업이 성공했습니다.")
  } else {
    reject("p 작업이 실패했습니다.")
  }
})

// .then(): resolve된 결과가 넘어오는곳
// .catch(): reject된 결과에 대응하는 코드 작성
p.then((response) => {
  //response 성공결과
  console.log(`p 프라미스가 resolve됨: ${response}`)
}).catch((response) => {
  //response 실패결과
  console.log(`p 프라미스가 reject됨: ${response}`)
})
