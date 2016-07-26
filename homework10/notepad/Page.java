package notepad;

public class Page {

	private static final int MAX_SYMBOLS_IN_A_ROW = 50;
	private static final int MAX_NUMBER_OF_ROWS = 20;
	static int number;
	private String title;
	private String[] text;

	static {
		number = 0;
	}

	Page() {

	}

	Page(String[] text) {
		this.text = new String[MAX_NUMBER_OF_ROWS];

		if (correctText(text)) {
			for (int row = 0; row < text.length; row++) {

				if (this.text[row] != null) {
					continue;
				}

				else {
					this.text[row] = text[row];
				}
			}
		}

		else {
			System.out.println("Invalid text given! Please try again until giving a correct text! ");
		}

		if (Page.number <= SimpleNotepad.MAX_PAGES_IN_NOTEPAD) {
			Page.number++;
		} else {
			System.out.println("No more free space available for a new page! ");
		}
	}

	static boolean correctText(String[] text) {

		if (text != null) {
			for (int row = 0; row < text.length; row++) {
				if (text[row].length() <= MAX_SYMBOLS_IN_A_ROW) {
					return true;
				}
			}
			return false;
		}
		return false;
	}

	static boolean correctRow(String newText) {
		return newText != null && newText != "" && newText.length() >= 1 && newText.length() < MAX_SYMBOLS_IN_A_ROW;
	}
	
	void addText(String newText) {
		// each new text will be added on a new line:
		if (correctRow(newText)) {
			for (int index = 0; index < this.text.length; index++) {
				if (this.text[index] == null) {
					this.text[index] = String.join("\n", newText);
					break;
				}
			}
		} else {
			System.out.println("Incorrect text given! ");
		}
	}

	// all the text;
	void delete() {

		for (int index = 0; index < this.text.length; index++) {
			if(this.text[index] == null){
				break;
			}
			else{
				this.text[index] = null;
			}
			
		}

	}

	// a single line of the text
	void delete(String text) {
		for (int index = 0; index < this.text.length; index++) {
			if (this.text[index] != null && this.text[index].equalsIgnoreCase(text)) {
				this.text[index] = null;
			}
		}
	}

	
	boolean searchWord(String word){
		for (int index = 0; index < this.text.length; index++) {
			if(this.text[index] != null && this.text[index].contains(word)){
				return true;
			}
		}
		return false;
	}
	
	boolean containsDigits(){
		boolean hasDigits = false;
		for (int index = 0; index < this.text.length; index++) {
			if(this.text[index] != null && isDigitInString(this.text[index])){
				hasDigits = true;
				break;
			}
		}
		
		return hasDigits;
	}
	
	boolean isDigitInString(String word){
		
		for (int index = 0; index < word.length(); index++) {
			if(word.charAt(index) >= '0' && word.charAt(index) <= '9'){
				return true;
			}			
		}
		
		return false;
	}
	
	
	@Override
	public String toString() {

		String allText = String.join("\n", this.text);
		return "Title: " + this.title + "\n" + allText;
	}

	void setTitle(String title) {

		if (title != null && title != "") {
			this.title = title;
		}
	}

	int getNumber() {
		return number;
	}

	String[] getText() {
		return this.text;
	}
}
