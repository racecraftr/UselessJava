function foo (){
    const lat = ['N', 'S'];
    const lon = ['E', 'W'];
    const latitude = Math.random * 90;
    const longitude = Math.random * 180;

    const latString = toDMS(latitude) + lat[Math.round(Math.random() * 2)];
    const longString = toDMS(longitude) + lon[Math.round(Math.random() * 2)];
    return latString + " " + longString; //JS isn't that hard i guess. It just takes a lot of google sarch
}

function toDMS(bar){
    var d = bar;
    const l1 = Math.round(d);
    d -= l1;
    d *= 60;
    const l2 = Math.round(d);
    d -= l2;
    d *= 60;
    const l3 = Math.round(d);
    return l1.toString + "º " + l2.toString + "\' " + l3.toString + "\"";
}