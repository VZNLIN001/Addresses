public class Address{
	
	
	public String id;
	public Type type;
	public AddressLineDetail addressLineDetail;
	public ProvinceOrState provinceOrState;
	public CityOrTown cityOrTown;
	public Country country;
	public String postalCode;
	public String lastUpdated;
	
	
	public String getId(){
		return id;
	}
	
	public Type getType(){
		return type;
	}
	
	public AddressLineDetail getAddressLineDetail(){
		return addressLineDetail;
	}
	
	public ProvinceOrState getProvinceOrState(){
		return provinceOrState;
	}
	
	public CityOrTown getCityOrTown(){
		return cityOrTown;
	}
	
	public Country getCountry(){
		return country;
	}
	
	public String getPostalCode(){
		return postalCode;
	}
	
	public String getLastUpdated(){
		return lastUpdated;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setType(Type type){
		this.type = type;
	}
	
	public void setAddressLineDetail(AddressLineDetail addressLineDetail){
		this.addressLineDetail = addressLineDetail;
	}
	
	public void setProvinceOrState(ProvinceOrState provinceOrState){
		this.provinceOrState = provinceOrState;
	}
	
	public void setCityOrTown(CityOrTown cityOrTown){
		this.cityOrTown = cityOrTown;
	}
	
	public void setCountry(Country country){
		this.country = country;
	}
	
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	
	public void setLastUpdated(String lastUpdated){
		this.lastUpdated = lastUpdated;
	}
	
	//2a - print address
	public void prettyPrintAddress(){
		StringBuilder str = new StringBuilder();
		str.append(addressLineDetail.toString());
		str.append(" - "+cityOrTown.toString());
		
		if(provinceOrState != null && provinceOrState.name != null ||  !provinceOrState.name.isEmpty()){
				str.append(" - "+provinceOrState.toString());
		}
		
		str.append(" - "+postalCode);
		str.append(" - "+country.toString());
		
		System.out.println(str.toString());
	}
}