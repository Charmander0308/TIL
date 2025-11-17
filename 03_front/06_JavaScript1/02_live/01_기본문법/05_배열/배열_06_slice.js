// slice( startIndex, endIndex)
// 배열의 startIndex부터 endIndex까지(endIndex는 불포함)에 대한 shallow copy를 새로운 배열 객체로 반환

var arr = [1, 2, 3, 4, 5, 6, 7];
var newArr = arr.slice(3, 6);
console.log('slice',  newArr); // 
