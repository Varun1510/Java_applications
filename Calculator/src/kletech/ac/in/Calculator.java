package kletech.ac.in;

public class Calculator {
	public double iVar1,iVar2;

	public double add(){
		return iVar1+iVar2;
	     }
	public double sub(){
		return iVar1-iVar2;
	}

	public double multiply(){
		return iVar1*iVar2;
	     }
	public double div(){
		return iVar1/iVar2;
	}
	public double mod(){
		return (int)iVar1%(int)iVar2;
	}
	public void setVar1(double iTemp){
		iVar1=iTemp;
		
	}
	public void setVar2(double iTemp){
		iVar2=iTemp;
		
	}

	

}
