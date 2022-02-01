
public class teaching_staff extends staff {
	private String department;

	public teaching_staff(int staff_id, int age, String name, String designation, String address, double basic_pay,
			String department) {
		super(staff_id, age, name, designation, address, basic_pay);
		this.department = department;
	}
	public void generate_payslip() {
		System.out.println("\nTeaching staff");
		super.generate_payslip();
		System.out.println("Department:"+department);
		
	}

}
