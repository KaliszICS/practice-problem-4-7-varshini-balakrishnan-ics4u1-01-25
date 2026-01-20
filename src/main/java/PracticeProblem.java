public class PracticeProblem {
	//test
	public static void main(String args[]) {
		System.out.println(validateAge(25));
		System.out.println(withdraw(50, 200));
		int[] arr = {10, 20, 30};
		System.out.println(getElement(arr, 1));
		System.out.println(validateEmail("kafka@gmail.com"));
	}

		public static boolean validateAge(int age) {
			if (age < 0) {
				throw new IllegalArgumentException("Age cannot be negative.");
			}
			if (age > 150) { //oldest person was ~122 yrs old
				throw new IllegalArgumentException("Age must be realistic");
			}
			return true;

		}

		public static double withdraw(double amount, double balance) {
			if (amount <= 0) {
				throw new IllegalArgumentException("Amount must be greater than zero & also not negative");
			}
			if (balance - amount < 0) {
				throw new IllegalStateException("Insufficient funds");
			}
			return balance - amount;
		}	

		public static int getElement(int[] array, int index) {
			if (array == null) {
				throw new NullPointerException("Array cannot be null");
			}
			if(index < 0 || index >= array.length) {
				throw new IndexOutOfBoundsException("Index is out of bounds");
			}
			return array[index];
		}

		public static String validateEmail(String email) {
			if (email == null || email.trim().equals("")) {
				throw new IllegalArgumentException("Email cannot be empty");
			}
			String trimmed = email.trim();
			if(!trimmed.contains("@")) {
				throw new IllegalArgumentException("Invalid email format");
			}
			int atIndex = trimmed.indexOf("@");
			int dotIndex = trimmed.indexOf(".", atIndex);

			if (dotIndex == -1) {
				throw new IllegalArgumentException("Invalid email format");
			}
			return trimmed;
		}

}
