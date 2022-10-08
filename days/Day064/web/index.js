//function from https://stackoverflow.com/questions/1527803/generating-random-whole-numbers-in-javascript-in-a-specific-range
function getRandomInt(min, max) {
  min = Math.ceil(min);
  max = Math.floor(max);
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

function foo() {
  var input = $("#input").val();
  input = input.replaceAll(/([ \t])/gi, "");
  let equationRegex = /(-*[\d\.]+[+\-*\/]-*[\d\.\^])/gi;
  if(equationRegex.test(input)){
    let x = getRandomInt(-0xffffffff, 0xffffffff)
    $("output").html(x);
  }
  else {
    $("output").html("Not a valid equation");
  }
}