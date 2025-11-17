function myInfo(name, age = 20, ...hobbies) {
  console.log(`이름: ${name}, 나이: ${age}\n취미:${hobbies}`);
}

myInfo();
myInfo("kim");
myInfo("kim", 35, "working", "running", "studying");
myInfo("kim", 35, "research", "working");
