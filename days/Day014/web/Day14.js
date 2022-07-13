function onButtonPressed(){

    var s = $("#input").val();

    var chars = Array.from(s)
    Array.prototype.sort.call(chars);
    const res = chars.join('')
    const output = document.getElementById("output");
    output.innerHTML = res.toString();
}