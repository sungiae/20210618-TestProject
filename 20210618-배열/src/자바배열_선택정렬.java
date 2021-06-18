import java.util.Arrays;

public class 자바배열_선택정렬 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println("====정렬 전====");
		System.out.println(Arrays.toString(arr));
		System.out.println("====정렬 후====");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// 숫자를 비교해서 교환
				if (arr[i] > arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
