let wordString = "ok so um hi hello yes uh erm yeah hmm and"
let words = wordString.split(" ");

function foo(){
  let s = $("#input").val();
  console.log(s);
  let strings = s.split("/([ \t])/gi")
  var output = "";

  for (let i = 0; i < strings.length; i++) {
    const str = strings[i];
    for (let i = 0; i < Math.random() * 12; i++) {
      output += words[Math.floor(Math.random() * words.length)] + " ";
    }
    output += str + " "
    for (let i = 0; i < Math.random() * 12; i++) {
      output += words[Math.floor(Math.random() * words.length)] + " ";
    }
  }

  $("#output").html(output);
}