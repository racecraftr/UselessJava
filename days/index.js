function redirect() {
    var day = $('#day').val().toString();
    var s  = day;
    if(day.length == 1) {
        s = "00" + day;
    }
    else if(day.length == 2) {
        s = "0" + day;
    }
    window.location.href = "../days/Day" + s + "/web/Day" + day + ".html";
}