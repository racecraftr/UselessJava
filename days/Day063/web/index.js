function foo() {
  let str = $("#input").val();
  str = str.replaceAll(/([\W\n_])/gi, "")
  let chars = str.split("");
  for (let i = 0; i < chars.length/2; i++) {
    const element = chars[i];
    const oppostie = chars[chars.length - 1 - i];
    if(!(element === oppostie)){
      $("#output").html("false");
      return false;
    }
    $("output").html("true");
    return true;
  }
}