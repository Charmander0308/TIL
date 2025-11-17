const nums = [1, 2, 3, 4, 5];

// 1. forEach - 각 요소를 하나씩 순회하면서 작업을 수행함 / 출력예시 (반환값 없음)
// 출력: 1, 2, 3, 4, 5
nums.forEach((x) => {
    console.log(x)
})

// 2. map - 각 요소를 하나씩 순회하면서 작업을 수행하고 해당 결과를 새로운 배열로 반환 /  2배로 만들어 새로운 배열 반환
// 출력: [2, 4, 6, 8, 10]
const doubleNums = nums.map((x) => {
    return x * 2;
})

// 3. filter - 각 요소를 하나씩 순회하면서 특정한 조건을 만족하는 결과를 반환하여 새로운 배열로 만듬 / 3보다 큰 값만 필터링하여 새로운 배열 반환
// 출력: [4, 5]
const filtered = nums.filter((x) => x > 3)

// 5. findIndex - 3보다 큰 첫 번째 값의 인덱스를 반환
const index = nums.findIndex((x) => x > 3);
console.log("findIndex:", index); // 3 (nums[3] == 4)

// 6. some - 하나라도 4보다 큰 값이 있는지 여부 (true/false)
const hasSome = nums.some((x) => x > 4);
console.log("some:", hasSome); // true (5가 있음)

// 7. every - 모든 값이 0보다 큰지 여부 (true/false)
const allPositive = nums.every((x) => x > 0);
console.log("every:", allPositive); // true

// 8. reduce - 모든 값을 누적해서 합산
const sum = nums.reduce((acc, x) => acc + x, 0);
console.log("reduce (sum):", sum); // 15 (1+2+3+4+5)

// 9. includes - 배열에 특정 값(3)이 포함되어 있는지 여부
const includesThree = nums.includes(3);
console.log("includes 3:", includesThree); // true

// 10. sort - 배열을 오름차순으로 정렬 (원본 배열 변경됨!)
const unsorted = [4, 2, 5, 1, 3];
unsorted.sort((a, b) => a - b);
console.log("sort (asc):", unsorted); // [1, 2, 3, 4, 5]

// 추가: 내림차순 정렬 예시
const descSorted = [4, 2, 5, 1, 3].sort((a, b) => b - a);
console.log("sort (desc):", descSorted); // [5, 4, 3, 2, 1]
