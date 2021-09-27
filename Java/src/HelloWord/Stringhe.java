package HelloWord;

public class Stringhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "Hello java";

String str = "Polito";

String  carattere = test.concat(str);
"Ciao".charAt(2);
boolean  flag = false;
String confronto = "Hello javaPolito";
if(carattere.equals(confronto)) {
	flag = true;
}
if(flag) {
	System.out.println(confronto.contains(str));
}
else {
	System.out.println("errior");
}

System.out.println("hello java".replace("java", "python"));
System.out.println("hello java".split(" "));
System.out.println("hello java".substring(6, 10));

	}

}
