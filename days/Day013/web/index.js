function foo (bar){
    if(bar == 0.0) return "0";
    if(x == parseInt(x, 10)) return parseInt(x).toString;
    var n = Math.abs(x);
    var d = 1;

    var text = x.toString;
    decimalDigits = text.length;

    d *= Math.pow(10, decimalDigits);
    n *= Math.pow(10, decimalDigits);

    numerator = parseInt(num, 10);
    denominator = d;

    gcd = gcd(numerator, denominator);
}

function gcd(n, d){
    gcd = 1;
    x = Math.max(n, d);
    for(var i = 0; i < Math.sqrt(x); i ++){
        if(n % i == 0 && d % i == 0 && i > gcd){
            gcd = i;
        }
        if(n % (x/i) == 0 && d % (x/i) == 0 && (x/i) > gcd){
            return x/i;
        }
    }
    return gcd;
}