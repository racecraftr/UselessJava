function getLowestPrimitive(){
    //finds the lowest primitive type that can represent n
    var n = $('#input').val();
    var s = "error";
    if(parseInt(n) == n){
        if(n == 0 || n == 1){
            return "boolean";
        }
        //bytes
        if(n >= -128 && n <= 127){
            if(n >= 0){
                s = "unsigned_byte";
            }
            else {s = "byte";}
        }
        //shorts
        else if(n >= -32768 && n <= 32767){
            if(n >= 0){
                s = "unsigned_short";
            }
            else {s = "short";}
        }
        //ints
        else if(n >= -2147483648 && n <= 2147483647){
            if(n >= 0){
                s = "unsigned_int";
            }
            else {s = "int";}
        }
        //longs
        else if(n >= -9223372036854775808 && n <= 9223372036854775807){
            if(n >= 0){
                s = "unsigned_long";
            }
            else {s = "long";}
        }
    }
    else {
        //floats
        if(n >= -3.4028234663852886e+38 && n <= 3.4028234663852886e+38){
            if(n >= 0){
                s = "unsigned_float";
            }
            else {s = "float";}
        }
        //doubles
        else if(n >= -1.7976931348623157e+308 && n <= 1.7976931348623157e+308){
            if(n >= 0){
                s = "unsigned_double";
            }
            else {s = "double";}
        }
    }

    const output = document.getElementById('output');
    output.innerHTML = s;
}