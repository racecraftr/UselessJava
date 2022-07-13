function foo(){

    const s = document.getElementById("input").value;

    var chars = s.toCharArray();
    Array.prototype.sort.call(chars);
    const res = Array.toString(chars);
    const output = document.getElementById("output");
    output.innerHTML = res;
}