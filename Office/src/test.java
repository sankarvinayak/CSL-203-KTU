
public class test {

	public static void main(String[] args) {
		office_staff os = new office_staff(123, 35, "San", "Financial assistant", "adc,def street 123456", 300000, 'A');
		teaching_staff ts = new teaching_staff(456, 30, "Vin", "Assistant Professor", "lmn,qwe street 789654", 320000, "Mathematics");
		os.generate_payslip();
		ts.generate_payslip();
	}

}
