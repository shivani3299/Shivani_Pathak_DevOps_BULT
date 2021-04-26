package first_groovy


try
{
	int a=1/0
	println a
	println "Inside try block"
}

catch(Exception e)
{
	println "Inside Catch block"
	println e.getcause()
}
/*finally
{
	println "Inside finally block"
}*/
