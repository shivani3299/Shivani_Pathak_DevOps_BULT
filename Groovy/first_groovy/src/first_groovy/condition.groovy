package first_groovy

/*
def num = 12
if (num == 10)
{
	println "num is 10"
}
else 
{
	println num
}
//switch case
def x = 10
def res = ""
switch(x)
{
	case 0:
		res = "x is zero"
		break
	case {x>0}:
		res = "x is +ve" 
		break
	default:
		println "Invalid no"
}

println res*/
/*
for(int i=1; i<= 5;i++)
{
	println i	
}
//1.upto(5 ) { println "$it" }
3.times {println "$it"}
1.step(10, 2) { println "$it"  }
*/

def map = ["name":"1", "man":"2"]
for (i in map)
{
	println i.key
	println i.value
}