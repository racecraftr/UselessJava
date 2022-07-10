function foo(bar){
    var chars = bar.toCharArray();
    Array.prototype.sort.call(chars);
    return Array.toString(chars);
}