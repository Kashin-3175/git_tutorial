package day4;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] irregularArray = {{1,2},{3,4,5},{6}};

		System.out.println("ArrayExample2");
		for(int i = 0; i < irregularArray.length; i++) {
			for(int j = 0; j < irregularArray[i].length; j++) {


			System.out.print(irregularArray[i][j] + "");
			}
		}
		System.out.println();

	}

}
