package notepad;

public interface INotepad {
	
	void addTextOnPage(String text, int number);
	void replaceTextOnPage(String text, int number);
	void deleteTextOnPage(int number);
	void showTheWholeContent();
	boolean searchForAWord(String word);
	void printAllPagesWithDigits();
		
}
