// 함수 매개변수

// 함수는 호출 시 매개변수의 영향을 받지 않음
// arguments 라는 함수 내부의 프로퍼티를 이용하여 매개변수의 처리가 가능
// 자바스크립트의 함수는 오버로딩 개념을 지원하지 않음
// 기본 인자 (default arguments)를 사용할 수 있음

function func1(num){
    console.log(num)
}

func1()
func1(10)
func1(10, 20)

function func2(){
    console.log(arguments)
}
// 메서드 오버로딩 지원하나?
function func3(){
    console.log(1)
}

function func3(){
    console.log(2)
}

function func3(name){
    console.log(name)
}