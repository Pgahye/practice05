package prob2;

public class SmartPhone extends MusicPhone {
	
	
	public void execute(String function) {

		if (function.equals("앱")) {
			appstart();
			return;
		}

		super.execute(function);

	}

	protected void appstart() {
		System.out.println("앱실행");
	}
}
