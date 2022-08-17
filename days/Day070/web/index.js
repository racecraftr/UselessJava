let barLengths = [];
let stopped = false;

function init() {
  barLengths = [];
  let x = parseInt(
    Math.random() * 64, 10
  )
  for (let i = 0; i < 10; i++) {
    barLengths.push(x);
    x += parseInt(Math.random() * 10, 10) - 5
    if (x < 1) x = 1;
  }
}

async function shuffle() {
  for (let i = 0; i < barLengths.length; i++) {
    let x = barLengths[i];
    x += parseInt(Math.random() * 10 - 5, 10)
    if (x < 1) x = 1;
    barLengths[i] = x;
  }
}

async function foo() {
  init();
  stopped = false;
  while (!stopped) {
    let output = "";
    for (let i = 0; i < barLengths.length; i++) {
      for (let j = 0; j < barLengths[i]; j++) {
        output += "█"
      }
      output += "<br>"
    }
    document.getElementById("output").innerHTML = output;
    await sleep(100);
    shuffle();
  }
}

function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

function stop() {
  stopped = true;
}