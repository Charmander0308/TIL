// let 함수명 = function() { 함수 내용 }

// 익명함수로 정의가능
// 매개 변수
// 내용

/* 자유롭게 코드를 작성해보세요. */
let greeting3 = function(name){
    return `welcome, ${name}`
}

console.log(greeting3(`kang`))

console.log(greeting4(`yang`))
//호이스팅 체크
let greeting4 = function(name){
    return `welcome, ${name}`
}
