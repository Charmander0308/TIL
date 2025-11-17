import { title, add, sub } from "./08_module1.js"

console.log(title);

document.querySelector("#calc").addEventListener("click", () => {
  let num1 = +document.querySelector("#num1").value;
  let num2 = +document.querySelector("#num2").value;

  console.log(add(num1, num2));
  console.log(sub(num1, num2));
});
