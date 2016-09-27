package kletech.ac.in;

public class Marks_Demo {

	public static void main(String[] args) {
		
		int i;
		Marks Vinit[] = new Marks[10];
       	for(i=0;i<10;i++)
		Vinit[i]=new Marks();
	
	System.out.println(Vinit[0].marksBest(10,20,30));
	System.out.println(Vinit[1].marksBest(30, 40, 50));
	System.out.println(Vinit[2].marksBest(50, 70, 90));

	}
	

}
