package notepad;

public class NotepadDemo {

	public static void main(String[] args) {
		
		String [] text = {"solve 2 problems", "play volleyball", "make a dinner"};
		Page page = new Page(text);
		page.setTitle("Monday");
		System.out.println(page.searchWord("prepare"));
		System.out.println(page.containsDigits());
		
		String [] text2 = {"go to Infinity Tower", "prepare for the interview", "run 45 minutes"};
		Page newPage = new Page(text2);
		newPage.setTitle("Tuesday");
		System.out.println(newPage.containsDigits());
		
		Page [] pages = new Page[6];
		pages[0] = page;
		pages[1] = newPage;
		
		
		INotepad note = new SimpleNotepad(pages);
		note.addTextOnPage("1ytfxgd", 1);
		note.showTheWholeContent();
		System.out.println(note.searchForAWord("movie"));
		note.printAllPagesWithDigits();
		
		String [] text3 = {"time to watch a movie", "go out with friends"};		
		Page page3 = new Page(text3);
		pages[2] = page3;	
		note = new SecuredNotepad(pages);
		note.addTextOnPage("fbriusdagfrewy5", 2);
		note.showTheWholeContent();		
		
		ElectronicSecuredNotepad electronic = new ElectronicSecuredNotepad(false,pages);
		electronic.start();
		System.out.println(electronic.searchForAWord("watch"));
		electronic.printAllPagesWithDigits();
		electronic.stop();
		
	}

}
