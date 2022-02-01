
public class staff {
	private int staff_id,age;
	private String Name,Designation,Address;
	private double basic_pay,Gross,Net,DA,HRA,PF,Tax;
	public staff(int staff_id, int age, String name, String designation, String address, double basic_pay) {
		this.staff_id = staff_id;
		this.age = age;
		Name = name;
		Designation = designation;
		Address = address;
		this.basic_pay = basic_pay;
	}
	public void generate_payslip() {
		DA=1.25*basic_pay;
		HRA=0.05*basic_pay;
		PF=0.1*basic_pay;
		Gross=basic_pay+DA+HRA;
		Tax = 0.05*Gross;
		Net=Gross-(PF+Tax);
		System.out.println("Name:"+Name);
		System.out.println("Staff id:"+staff_id);
		System.out.println("Designation:"+Designation);
		System.out.println("Address:"+Address);
		System.out.println("Basic pay:"+basic_pay);
		System.out.println("DA:"+DA);
		System.out.println("HRA:"+HRA);
		System.out.println("PF:"+PF);
		System.out.println("Tax:"+Tax);
		System.out.println("Gross salary:"+Gross);
		System.out.println("Net salary:"+Net);
		
	}
	
}
