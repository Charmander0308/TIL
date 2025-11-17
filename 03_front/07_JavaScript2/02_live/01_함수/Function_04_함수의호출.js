// 함수의 호출

/* 자유롭게 코드를 작성해보세요. */

//출력하는 함수를 하나 정의했다!
function sysout(msg){
    console.log(msg)
}


function parameterFunction(func){
    func('Hello SSAFY')
}

parameterFunction(sysout)
