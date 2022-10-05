const file = "../allWordsInDictionary.txt"
const wordMap = new Map();
const A = 65;

function init() {
  for (let i = 0; i < 26; i++) {
    wordMap.set(String.fromCharCode(A + i), []);
  }
  console.log(wordMap);
  $.get(file,function(txt){
    var lines = txt.split("\n");
    for (var i = 0, len = lines.length; i < len; i++) {
      let upperCase = lines[i].toUpperCase(); 
      let firstChar = upperCase.charAt(0);
      if(wordMap.has(firstChar)){
        wordMap.get(firstChar).push(lines[i]);
      }
    }
  });
  console.log(wordMap);
}

function foo() {
  var str = $("#input").val().toUpperCase();
  var res = "";
  for (let i = 0; i < str.length; i++) {
    let element = str.charAt(i);
    if(wordMap.has(element)){
      const wordArr = wordMap.get(element);
      let randomWord = wordArr[Math.floor(Math.random() * wordArr.length)];
      res += randomWord.substring(0, 1).toUpperCase() + randomWord.substring(1);
      res += "<br>"
    }
    else{
        res += element + "<br>";
    }
  }
  res = res.replaceAll(/(\n)/gi, "<br>");
  console.log(str);
  $("#output").html(res);
}