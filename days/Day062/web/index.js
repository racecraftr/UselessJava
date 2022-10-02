function foo(){
  let s = $("#input").val();
  var output = "";
  for (let i = 0; i < s.length; i++) {
    const player = s.charCodeAt(i);
    output += `GUYS I CAN VOUCH THAT player IS ${player}<br>`
    output += `player CAN VOUCH GO AND TELL THEM COME ON<br>`
  }

  $("#output").html(output);
}