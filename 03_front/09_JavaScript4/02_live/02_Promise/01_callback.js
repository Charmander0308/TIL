let work = true
// let work = false

function task(successCallback, failureCallback) {
  //work 를 바꿀수있을만한 작업을 하던가..


  if (work) {
    successCallback()
  } else {
    failureCallback()
  }
}

function onTask1Success() {
  console.log("작업이 성공하면 이 콜백함수를 실행합니다.")
}

function onTask1Failure() {
  console.log("작업이 실패하면 이 콜백함수를 실행합니다.")
}

task(onTask1Success, onTask1Failure)
