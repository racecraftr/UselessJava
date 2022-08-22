## Day 77: Is it an IP Address? 
Takes in a string and sees whether it *could* be an IP address (IPv4 or IPv6.)
Regex for IPv4: `x.x.x.x`, where `x` is any number from 0 to 255. 
```regexp
"\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"
```
regex for IPv6: `y:y:y:y:y:y:y:y`, where `y` is any hexadecimal number from 0 to 0xFFFF. 
```regexp
"(([\\dA-F]{1,4}):){7}\\2"
```