async function getStatusCode(){

    var n = "0";

    try {
        var url = "https://www." + $('#input').val();
        const response = await fetch(url);
        n = response.status.toString();
  
    } catch (err) {
      n = err.toString();
    }
    const output = document.getElementById('output');
    output.innerHTML = n;
  }
  
  