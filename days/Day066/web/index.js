const chars = 'abcdefghijklmnopqrstuvwxyz ,.'.split('');
let output = ""
let stopped = true;

async function foo(){
    stop();
    stopped = false;
    document.getElementById("output").innerHTML = "";
    output = "";
    while(!stopped){
        output += chars[Math.floor(Math.random() * chars.length)];
        document.getElementById("output").innerHTML = output;
        await sleep(50 * Math.floor(Math.random() * 100));
    }
}

function sleep(ms) {
    return new Promise(resolve => setTimeout(resolve, ms/100));
}

async function stop(){
    stopped = true;
    document.getElementById("output").innerHTML = output;
}