const keys = [
    "asdfjkl; ",
      "qwertyuiopghzxcvbnm,.['/ASDFJKL:",
      "QWERTYUIOPGHZXCVBNM<>\"?1234567890-]",
      "]`!@#$%^&*()=!@#$%^&*()_",
      "\\~",
      "|"
];


function foo(){
    let input = document.getElementById("input").value; //String
    let d = 0.0;
    const chars = Array.from(input);
    for (const c in chars) {
        for(let i = 0; i < keys.length; i++){
            if(keys[i].includes(c)){
                d += (i * 1.0);
            }
        }
    }

    d /= input.length * 1.0;
    output = "You need to move your fingers an average of " + d + " keywidths.";

    document.getElementById("output").innerHTML = output;
}