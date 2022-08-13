function foo() {
    //get input
    let input = document.getElementById("input").value;
    let times = Math.max(parseInt(input), 1);
    let s = "", h = 0, t = 0;
    for(let i = 0; i < times; i++) {
        let result = Math.random() < 0.5 ? "H" : "T";
        s += result;
        if(result == "H") {
            h++;
        }
        else {
            t++;
        }
    }

    let outputString = s 
    + "<br>Chance of heads: " + (h / times * 1.0) 
    + "<br>Chance of tails: " + (t / times * 1.0)
    + "<br>Fairness: " + (1.0 - Math.abs(h - t) / times * 1.0);

    document.getElementById("coinFlipOutput").innerHTML = outputString;
}