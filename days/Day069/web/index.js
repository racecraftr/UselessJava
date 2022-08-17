const nice = `
         __             __         __             __
        /\ \     _     /\ \       /\ \           /\ \
       /  \ \   /\_\   \ \ \     /  \ \         /  \ \
      / /\ \ \_/ / /   /\ \_\   / /\ \ \       / /\ \ \
     / / /\ \___/ /   / /\/_/  / / /\ \ \     / / /\ \_\
    / / /  \/____/   / / /    / / /  \ \_\   / /_/_ \/_/
   / / /    / / /   / / /    / / /    \/_/  / /____/\
  / / /    / / /   / / /    / / /          / /\____\/
 / / /    / / /___/ / /__  / / /________  / / /______
/ / /    / / //\__\/_/___\/ / /_________\/ / /_______\
\/_/     \/_/ \/_________/\/____________/\/__________/
`.split("\n")
let output = "";

async function foo() {
  //scan downwards
  for (let i = 0; i < nice.length; i++) {
    output = "";
    for (let j = 0; j < i; j++) {
      output += nice[j] + "<br>";
    }
    document.getElementById("output").innerHTML = output;
    await sleep(100)
  }
  //scan upwards
  for (let i = nice.length - 1; i >= 0; i-=1) {
    output = "";
    for (let j = 0; j < i; j++) {
      output += nice[j] + "<br>";
    }
    document.getElementById("output").innerHTML = output;
    await sleep(100)
  }
}

async function sleep(ms) {
  await new Promise(resolve => setTimeout(resolve, ms));
}