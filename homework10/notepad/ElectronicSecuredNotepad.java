package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice, INotepad {

	private boolean isStarted;

	ElectronicSecuredNotepad(boolean isStarted, Page[] pages) {
		super(pages);
		setStarted(isStarted);
	}

	@Override
	public void start() {
		System.out.println("Let's start working with this device!");
		this.isStarted = true;
	}

	@Override
	public void stop() {
		System.out.println("The device is shutting down...");
		this.isStarted = false;
	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}

	@Override
	public void addTextOnPage(String text, int number) {
		if (this.isStarted) {
			this.enterPassword();
			super.addTextOnPage(text, number);
		} else {
			System.out.println("The device must be started!");
		}
	}

	@Override
	public void replaceTextOnPage(String text, int number) {
		if (this.isStarted) {
			this.enterPassword();
			super.replaceTextOnPage(text, number);
		} else {
			System.out.println("The device must be started!");
		}
	}

	@Override
	public void deleteTextOnPage(int number) {

		if (this.isStarted) {
			this.enterPassword();
			super.deleteTextOnPage(number);
		} else {
			System.out.println("The device must be started!");
		}
	}

	@Override
	public void showTheWholeContent() {
		if (this.isStarted) {
			this.enterPassword();
			super.showTheWholeContent();
		} else {
			System.out.println("The device must be started!");
		}
	}

	@Override
	public boolean searchForAWord(String word) {

		if (this.isStarted) {
			this.enterPassword();
			return super.searchForAWord(word);
		}
		else {
			System.out.println("The device must be started!");
			return false;
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		if (this.isStarted) {
			this.enterPassword();
			super.printAllPagesWithDigits();
		} else {
			System.out.println("The device must be started!");
		}
	}

}
