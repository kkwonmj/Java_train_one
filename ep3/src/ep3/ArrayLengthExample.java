package ep3;

import java.text.DecimalFormat;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0 ;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " +sum);
		
		DecimalFormat form = new DecimalFormat("#.###");
		double avg = (double) sum / scores.length;
		System.out.println("평균 :" + form.format(avg));
	}

}
