package notepad;

public class SimpleNotepad implements INotepad {

	static final int MAX_PAGES_IN_NOTEPAD = 100;
	private Page[] pages;

	SimpleNotepad(Page[] pages) {
		if (pages != null) {
			this.pages = new Page[MAX_PAGES_IN_NOTEPAD];
			for (int index = 0; index < pages.length; index++) {
				this.pages[index] = pages[index];
			}
		}

	}

	@Override
	public void addTextOnPage(String text, int number) {
		if (correctPageNumber(number) && this.pages[number-1] != null) {
			this.pages[number - 1].addText(text);
		} else {
			System.out.println("The number given is out of bounds or the text is not correct! ");
		}
	}

	@Override
	public void replaceTextOnPage(String text, int number) {
		if (correctPageNumber(number) && this.pages[number - 1].getText() != null) {
			this.pages[number - 1].delete();
			this.pages[number - 1].addText(text);
		} else {
			System.out.println("Cannot replace this text because it doesnt exist or it is not located on this page!");
		}
	}

	// delete all the text or some of the text?
	@Override
	public void deleteTextOnPage(int number) {
		if (correctPageNumber(number)) {
			pages[number - 1].delete();
		}
	}

	static boolean correctPageNumber(int number) {
		return number > 0 && number < MAX_PAGES_IN_NOTEPAD;
	}

	@Override
	public void showTheWholeContent() {
		System.out.println(this);
	}

	@Override
	public boolean searchForAWord(String word) {
		
		for (int index = 0; index < this.pages.length; index++) {
			if(this.pages[index] != null && this.pages[index].searchWord(word)){
				return true;
			}
		}
		
		return false;
		
	}

	@Override
	public void printAllPagesWithDigits() {
		
		for (int index = 0; index < this.pages.length; index++) {
			if(this.pages[index] != null && this.pages[index].containsDigits()){
				System.out.println(this.pages[index]);
			}
		}
		
	}
	
	@Override
	public String toString() {

		for (int index = 0; index < this.pages.length; index++) {
			System.out.println("Page number: " + (index + 1));
			System.out.println(this.pages[index]);
		}

		return "";
	}

	public Page[] getPages() {
		return pages;
	}



}