
public class AClass {
	String name;
	String type;
	Integer number;
	
	public AClass() {}
	
	public void setData(String name,String type,Integer number) {
		this.name = name;
		this.type = type;
		this.number = number;
	}
	public String getDataName() {
		return(this.name);
	}
	public String getDataType() {
		return(this.type);
	}
	public Integer getDataNumeber() {
		return this.number;
	}
}
