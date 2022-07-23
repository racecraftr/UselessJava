function leet() {
    var str = $("#input").val();
    str = str.replace(/A/gi, '4')
  .replaceAll(/O/gi, '0')
  .replaceAll(/E/gi, '3')
  .replaceAll(/I/gi, '1')
  .replaceAll(/S/gi, '5')
  .replaceAll(/T/gi, '7')
  .replaceAll(/G/gi, '6')
  .replaceAll(/B/gi, '8')
  .replaceAll(/Z/gi, '2');
    $("#output").text(str);
}