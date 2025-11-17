// function 함수명() { 함수 내용 }

// 함수의 이름과 함께 정의하는 방식
// 함수의 이름
// 매개 변수
// 내용
// 호이스팅 됨

/* 자유롭게 코드를 작성해보세요. */
function greeting(name){
    //` 템플릿 리터럴 방식 es6+
    //예전에는? "welcome," + name
    return `welcome, ${name}`
}

console.log(greeting('kim'))

console.log(greeting('lee'))
//호이스팅 체크
function greeting2(name){
    //` 템플릿 리터럴 방식 es6+
    //예전에는? "welcome," + name
    return `welcome, ${name}`
}