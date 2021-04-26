package oops

class Course {

	String name
	int days
	def getvalues(String n ,int d)
	{
		def name = n
		def days = d
		def l = [name:n,days:d]
	}

	static void main(args) {
		Course First=new Course()
		Course Second=new Course()
		Course Third=new Course()
		Course Fourth=new Course()
		
		def common = [First.getvalues('Roger', 2), Second.getvalues('Smith', 2),
			Third.getvalues('Tillie', 6), Fourth.getvalues('Ben', 9)]
		
		def sort = common.sort{a, b -> b["days"] <=> a["days"] ?: a["name"] <=> b["name"]}
		sort.each { println it }
	}
}
