function countStrokes(){
    var s = $("#input").val();
    var strokes = 0;
    var dots = 0;
    var holes = 0;
    for (let i = 0; i < s.length; i++) {
        var c = s.charAt(i) + "";
        if(c.match("[oOl689\\-_/\\\\|',UiSsJj;Cc?`~!()&]")) {strokes += 1;}
         
         if(c.match("[237QqerTtyuIPpaDdfGghLXxVvbn=+{}<>@$^]")) {strokes += 2;}
         
         if(c.match("[145WwERYIFHKZBNM\\[\\]*%]")) {strokes += 3;}
         
         if(c.match("[#]")) {strokes += 4;}

         if(c.match("[690QqeROoPpAaDdgb]")) {holes += 1;}
         if(c.match("[8B%&]")) {holes += 2;}

         if(c.match("[!ij;.?]")) {dots += 1;}
         if(c.match("[:]")) {dots += 2;}
    }

    const output = document.getElementById("output");
    output.innerHTML = "Strokes: " + strokes + "<br>Holes: " + holes + "<br>Dots: " + dots
    //$("#output").text("Strokes: " + strokes + "<br> Holes: " + holes + "<br> Dots: " + dots);
}