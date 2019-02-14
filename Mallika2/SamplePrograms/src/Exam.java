public class Exam {

	public static void main(String[] args) {
		System.out.println(Sam());

	}

	@SuppressWarnings("finally")
	static int Sam() {

		try {

			try {

				return 100;
			} finally {
				return 200;
			}

		} finally {
			return 300;
		}

	}

}
