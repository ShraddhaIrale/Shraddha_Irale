package functionoverloading;

public class Student {

	String name;
	int age;
	char section;
	char gender;
	int sub1,sub2,sub3;
	int SM;
	
	public Student(String n,int a,char s,char g,int m1,int m2,int m3)
	{
		name=n;
		age=a;
		section=s;
		gender=g;
		sub1=m1;
		sub2=m2;
		sub3=m3;
	}
	 public int marks(){
	        return sub1+sub2+sub3;
	    }
	    public float percentage(){
	        return (marks()*100)/300;
	    }
	    public static void main(String[] args) {
	        Student s1 = new Student("Mina", 22, 'A','F', 79,86,56);
	        Student s2 = new Student("Geeta", 24, 'B','F', 78,77,69);
	        Student s3 = new Student("Revati", 21, 'A','F', 94,84,59);
	        Student s4 = new Student("Priya", 24, 'B','F', 79,89,74);
	        
	        System.out.println("Total Marks of student s1 "+ s1.marks() + " Percentage of student s1 " + s1.percentage());
	        System.out.println("Total Marks of student s2 "+ s2.marks() + " Percentage of student s2 " + s2.percentage());
	        System.out.println("Total Marks of student s2 "+ s3.marks() + " Percentage of student s2 " + s3.percentage());
	        System.out.println("Total Marks of student s2 "+ s4.marks() + " Percentage of student s2 " + s4.percentage());
	}

}