public class Main {

	public static void main(String[] args) {
		Manager emp1=new Manager();
		Officer emp2=new Officer();
		emp1.name="San";
		emp1.adress="assdf asd 666666";
		emp1.age=20;
		emp1.salary=200000;
		emp1.department="Sales";
		emp1.phoneNumber="99999999";
		emp2.name="Sam";
		emp2.adress="asdasdf asasdd 6678566";
		emp2.age=21;
		emp2.specilation="Cyber";
		emp2.phoneNumber="0129232999";
		System.out.println("Manager name:"+emp1.name+'\n'+"Adress:"+emp1.adress+'\n'+"age:"+emp1.age+'\n'+"Salary:"+emp1.printSalary()+'\n'+"Department:"+emp1.department);
		System.out.println("Officer name:"+emp2.name+'\n'+"Adress:"+emp2.adress+'\n'+"age:"+emp2.age+'\n'+"Salary:"+emp2.printSalary()+'\n'+"Specialisation:"+emp2.specilation);

	}

}
