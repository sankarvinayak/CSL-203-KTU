public class test {

	public static void main(String[] args) {
		try {
			throw new MyException();
		} catch (Exception e) {
			System.out.println(e.toString()+" is handled");
		}
	}
}
