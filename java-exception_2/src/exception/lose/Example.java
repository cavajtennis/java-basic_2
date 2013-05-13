package exception.lose;

public class Example {

	public static void main(String[] args) {
		MyTest my = new MyTest();
		try {
			my.work();
		} finally {
			my.clearUp();
//			return;
		}
	}

}

class MyTest {
	public void work() {
		throw new ImportantException();
	}
	public void clearUp() {
		throw new SlightException();
	}
}

/** ��Ҫ���쳣 */
class ImportantException extends RuntimeException {}

/** ��΢���쳣 */
class SlightException extends RuntimeException {}