// 함수의 리턴

// 함수의 실행 결과로 함수를 반환할 수 있음
// 함수가 특별한 값을 리턴 하지 않은 경우 undefined가 반환됨

/* 자유롭게 코드를 작성해보세요. */
function func1(){
    return function(n1, n2){
        return n1+n2;
    }
}

let returnFunction = func1();

returnFunction(10,20);
func1()(20,30);

function func2() {

}

func2()