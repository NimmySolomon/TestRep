package Aggregation;

public class AggregationTest {
	int rollno;
	String studname;
	int marks;;
	AggregationSample ref;
	
	public AggregationTest(int rollno, String studname, int marks, AggregationSample ref)
	{
		this.rollno = rollno;
		this.studname = studname;
		this.marks = marks;
		this.ref = ref;
	}
	public void display()
	{
		System.out.println("Student Details : ");
		System.out.println(rollno +" , "+ studname +" , "+ marks);
		System.out.println("Parent Class : ");
		System.out.println(ref.name +" , "+ ref.age +" , "+ ref.des);
	}

	public static void main(String[] args) {
		AggregationSample objSample = new AggregationSample("Nimmy",28,"QA");
		AggregationTest objTest = new AggregationTest(1902,"Tester",78,objSample);
		objTest.display();

	}

}
