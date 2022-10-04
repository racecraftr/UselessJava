const file = "../allWordsInDictionary.txt"
const wordMap = new Map();
const A = 65;

function getFile(){

}


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
  var str = $("#input").val();

  $("#output").html(str);
}