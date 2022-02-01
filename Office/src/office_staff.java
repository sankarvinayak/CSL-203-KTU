
public class office_staff extends staff {
	private char grade;

	public office_staff(int staff_id, int age, String name, String designation, String address, double basic_pay,
			char grade) {
		super(staff_id, age, name, designation, address, basic_pay);
		this.grade = grade;
	}
	public void generate_payslip() {
		System.out.println("\nOffice staff");
		super.generate_payslip();
		System.out.println("Grade:"+grade);
	}
}
