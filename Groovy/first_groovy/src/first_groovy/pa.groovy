package first_groovy



String str = "In this program, our task is to count the total number of vowels and consonants present in the given string."+
				"As we know that, the characters a, e, i, o, u are known as vowels in the English alphabet."
int count
for(int i = 0; i < str.length(); i++)
{

	if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
		{

			count++;
			
		}
}
println count