import java.util.Arrays;

public class TasksInClass10 {
	public static void main(String[] args) {
		
		int [] arr = {4,1,1,4,2,3,4,4,1,2,4,9,3};
		Arrays.sort(arr);
		
		int curCount = 1, maxCount = 1;
		int bestElement = arr[0];
		
		for (int index = 0; index < arr.length - 1; index++) {
			
			if(arr[index] == arr[index + 1]){
				curCount++;
				
				if(curCount > maxCount){
					maxCount = curCount;
					bestElement = arr[index];
				}
			}
			else{
				curCount = 1;
			}
		}
		
		System.out.println("Most frequent element: "  + bestElement + "and you can find it " + maxCount + "times. " );
		
	}

}
