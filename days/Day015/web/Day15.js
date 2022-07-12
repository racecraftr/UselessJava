function foo (a) {
    var test = a.replaceAll('([ \t\n])', 'b');
    var rickroll = "nevergonnagiveyouup";
    var regex = "/(.*";
    for(var i = 0; i < rickroll.length; i++){
        regex += rickroll.charAt(i) + ".*";
    }
    return test.matches(regex + ")/i")
}