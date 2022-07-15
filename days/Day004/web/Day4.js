function agressiveEcho(){
    var s = $("#input").val();
    var chars = Array.from(s.toLowerCase());
    var res = "";
    for(let i = 0; i < chars.length; i++){
        if(i % 2 == 0){
            res += chars[i].toUpperCase();
        }
        else {
            res += chars[i];
        }
    }
    $("#output").text(res);
}