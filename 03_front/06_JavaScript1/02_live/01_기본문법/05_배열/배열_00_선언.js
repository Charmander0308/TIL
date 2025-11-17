/* 배열 (Array) */
  // 배열의 생성 : [] 또는 Array() 활용
  // 배열의 크기는 동적으로 변경된다.
  // 크기가 지정되어 있지 않은 경우에도 데이터의 입력 가능
  // 배열은 여러가지의 데이터 타입을 하나의 배열에 입력할 수 있음
  // push 함수를 이용하여 데이터 추가 가능

var arr1 = [];
var arr2 = new Array();
arr1[0] = 10;
arr1[2] = 30;
console.log(arr1[0], arr1[1], arr1[2]); // 
console.log(arr1.length); // 
arr1[3] = "문자열";
arr1[4] = {};
arr1[5] = [1, 2, 3];
arr1[6] = true;
arr1.push("추가");
