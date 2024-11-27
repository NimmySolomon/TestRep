package Aggregation;

public class AggregationChild {
	String name;
	String model;
	int year;
	Aggregation ref;
	
	public AggregationChild(String name, String model, int year, Aggregation ref)
	{
		this.name = name;
		this.model = model;
		this.year = year;
		this.ref = ref;
	}
	public void display()
	{
		System.out.println("Child Class : ");
		System.out.println(name +" , "+ model +" , "+ year);
		System.out.println("Parent Class : ");
		System.out.println(ref.name +" , "+ ref.city +" , "+ ref.pin +" , "+ ref.state);
	}

	public static void main(String[] args) {
		Aggregation objParent = new Aggregation("ABC","CityTest",688007,"Kerala");
		AggregationChild objchild = new AggregationChild("NameTest","ModelTest",2024,objParent );
		objchild.display();

	}

}
