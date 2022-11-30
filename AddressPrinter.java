import java.util.Scanner;
import com.fasterxml.jackson.databind.*;
import com.sun.jndi.cosnaming.IiopUrl.Address;


public class AddressPrinter
{

	//2b. pretty print all the addresses
	public void prettyPrintAllAddresses(){
		
		String jsonStr = String(Files.readAllBytes(Paths.get(addresses.json)))
	      ObjectMapper objectMapper = new ObjectMapper();
	      try {
	         List<Address> Addresses = objectMapper.readValue(jsonStr, Address.class);

	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }
	      
	      For(Address address : Addresses){
	    	  System.out.println(address.toString());
	      }
		
	}
	
	//2c. print address of a certain type of address
	public void printAddressByAddressType(int type) {
		
		String jsonStr = String(Files.readAllBytes(Paths.get(addresses.json)))
	    ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			List<Address> Addresses = objectMapper.readValue(jsonStr, Address.class);

		}catch(Exception e) {
			e.printStackTrace();
		}
			      
		For(Address address : Addresses){
			
			if(Integer.parseInt(address.getType.getCode) == type) {
				System.out.println(address.toString());
			}
		}
	}
	
	//2d. Validate address 
	pubic int validateAddress(Address address) {
		
		if(address.getPostalCode.matches("[0-9]+") && address.getCountry() != null && !address.getCountry().isEmpty() &&
				((address.getAddressLineDetail().getLine1 = ! null && !address.getAddressLineDetail().getLine1.isEmpty()) || (address.getAddressLineDetail().getLine2 = ! null && !address.getAddressLineDetail().getLine2.isEmpty() )) ) {
			
			
			if(address.getCountry().getCode() == "ZA") { //check if South Africa
				if(address.getProvinceOrState() != null && !address.getProvinceOrState().isEmpty()) {
					return 0;
				}else {
					return 1; //Invalid address. For South Africa a province is required
				}
			}
			return 0;
			
		}else {
			return 2; //Invalid postal code. Either postal code is not numeric or country is not provided or no address line detail provided
		}
	}
	
	//2e. determine is address provided is valit or not
	public void checkIfValidAddress() {
		
		String jsonStr = String(Files.readAllBytes(Paths.get(addresses.json)))
			    ObjectMapper objectMapper = new ObjectMapper();
				
				try {
					List<Address> Addresses = objectMapper.readValue(jsonStr, Address.class);

				}catch(Exception e) {
					e.printStackTrace();
				}
					      
				For(Address address : Addresses){
					int msg = validateAddress(address);
					if(msg == 0) {
						System.out.println("Valid address.");
					}else if(msg = 1) {
						System.out.println("Invalid address. For South Africa a province is required");
					}else {
						System.out.println("Invalid postal code. Either postal code is not numeric or country is not provided or no address line detail provided");
					}
					
				}
		
	}
	
	
}