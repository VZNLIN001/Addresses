public class AddressLineDetail{

	public String line1;
	public String line2;
	
	public String getLine1(){
		return line1;
	}
	
	public String getLine2(){
		return line2;
	}
	
	public void setLine1(String line1){
		this.line1 = line1;
	}
	
	public void setLine2(String line2){
		this.line2 = line2;
	}
	
	public String toString(){
		return line1 +" "+line2;
	}
}