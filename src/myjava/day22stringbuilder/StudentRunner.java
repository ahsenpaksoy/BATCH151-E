package myjava.day22stringbuilder;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student std1 = new Student();
		System.out.println(std1.stdName);
		
		//class ismiyle ulasmak icin static olmasi lazim. static olmadigi icin obje olusturduk.
		//stdName static olmadigi icin obje olusturduk.

		System.out.println(std1.age);
	}

}
