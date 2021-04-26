package oops


String username = "Shivani_Pathak"
String password = "12345"

String str = username +":"+password
println username
println password

//Concatenated string
println "concatenated String:"+str

//Byte array of String
byte[] b = str.getBytes()
println b

//encode to base64
def encode = b.encodeBase64().toString()
println encode

//decode same string to base64
byte[] decode = encode.decodeBase64()
println decode

//byte array
def c = new String(decode)

def original = res.split(':')
println original
 