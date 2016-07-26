
public class TasksInClass08 {

	public static void main(String[] args) {

		boolean[][] matrix = { 
				{ false, false, false }, 
				{ false, false, true}, 
				{ true, true, false }

		};

		boolean isTrue = false;
		
		for (int rows = 0; rows < matrix.length; rows++) {

			for (int cols = 0; cols < matrix[rows].length; cols++) {

				if(rows + cols < matrix.length - 1){
					
					if(matrix[rows][cols] == true){
						isTrue = true;
						break;
					}
					
				}
				
				
			}
		}
		
		
		if(isTrue){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		
	}

}
