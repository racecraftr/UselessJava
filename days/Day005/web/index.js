function leet() {
    var s = $("#input").val();
  var str = s.replace(/A/gi, '4');
  str = str.replaceAll(/O/gi, '0');
  str = str.replaceAll(/E/gi, '3');
  str = str.replaceAll(/I/gi, '1');
  str = str.replaceAll(/S/gi, '5');
  str = str.replaceAll(/T/gi, '7');
  str = str.replaceAll(/G/gi, '6');
  str = str.replaceAll(/B/gi, '8');
  str = str.replaceAll(/Z/gi, '2');
  //add this line at the end of each function. 
  str = str.replaceAll(/\n/gi, '<br>')
  $("#output").html(str);
}