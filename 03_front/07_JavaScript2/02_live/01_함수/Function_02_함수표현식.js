// let 함수명 = function() { 함수 내용 }

// 익명함수로 정의가능
// 매개 변수
// 내용

/* 자유롭게 코드를 작성해보세요. */
let greeting3 = function(name){
    return `Welcome, ${name}`
}

console.log(greeting3('Kang'))
//호이스팅 쳌(X)
console.log(greeting4('Yang'))
let greeting4 = function(name){
    return `Welcome, ${name}`
}
