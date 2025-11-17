//////// 페이지에 처음 들어왔을 때 
window.addEventListener("load", function () {
  let data = localStorage.getItem("data")
  if (data != null) {
    document.querySelector("#saved > li").innerText = JSON.parse(data)
  } else {
    document.querySelector('#saved > li').innerText = "저장된 내용이 없습니다."
  }
})




//////// 등록 #create 

// 1. 등록 버튼 선택(접근)
const createBtn = document.querySelector("#create")
// 2. 등록 버튼에 클릭 이벤트 추가
createBtn.addEventListener("click", function () {
    // 2-a. input 태그  || input 아이디 선택 
    const inputTag = document.querySelector("#input")
    // 2-b. input에서 가져온 value를 json문자열으로 바꾸기
    console.log(inputTag.value)
    console.log(typeof inputTag.value)
    //이거 어차피 문자열인데.... JSON 문자열로 바꿔야하나?
    const jsonData = JSON.stringify(inputTag.value)
    console.log(jsonData)
    console.log(typeof jsonData)
    // 2-c. localStorage에 "data" 이름으로 값 추가
    localStorage.setItem("data", jsonData)
    // (중요선택하기 나름) 2-d. input태그의 value값 초기화
    inputTag.value = ""
})


//////// 조회 #read 
// 코드를 작성하세요.
document.querySelector("#read").addEventListener("click", function () {
    const liTag = document.querySelector("#saved > li")
    const jsonData = localStorage.getItem("data") //문자열 " " 포함
    console.log(jsonData) //로컬스토리지에 해당 키가 없으면 null을 반환


    //일단 데이터가 있으면 가져오고, 아니면 다른 작업을 해!
    if (jsonData == null) {
        //데이터가 없는거니까 초기화 작업을 하던지....
    } else {
        const value = JSON.parse(jsonData);           //JS 형태로 변환
        liTag.textContent = value
    }
})


//////// 삭제 #delete 
// 코드를 작성하세요.
document.querySelector("#delete").addEventListener("click", function(){
    localStorage.removeItem("data")
    document.querySelector("#saved > li").textContent = "저장된 내용이 없다!"
})




