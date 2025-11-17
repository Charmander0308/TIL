function myInfo(name, age = 20, hobby = "golf") {
  console.log(`name : ${name}, age : ${age}, hobby : ${hobby}`);
}
myInfo();
myInfo("kim", 20);
myInfo("kim");
myInfo("kim", 20, "tennis");
