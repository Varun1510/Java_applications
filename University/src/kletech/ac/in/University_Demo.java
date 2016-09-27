package kletech.ac.in;

public class University_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			
			
			University KLETECH = new University();
			
			KLETECH.createSchools();
			KLETECH.cal_stud();
			System.out.println("------------\n");
			for(int i=0;i<KLETECH.noofStud.length;i++)
			{
				if(KLETECH.noofStud[i]!=0)
					System.out.println("No Students in "+KLETECH.s[i].getProgcode()+" are  "+KLETECH.noofStud[i]);
			}
			
			
		}

	}


