package nsh.codility;

public class CoderOfRivia2021A implements CoderOfRivia2021Interface {

	public int[] solution(int[] A) {
		int[] R = A.clone();
		int[] r = new int[3];
		int[] c = new int[3];
		int M = -1;
		for (int i = 0; i < 3; i++) {
			r[i] = 0;
			c[i] = 0;
			for (int j = 0; j < 3; j++) {
				r[i] += A[j + i * 3];
				c[i] += A[j * 3 + i];
			}
			M = Math.max(M, r[i]);
			M = Math.max(M, c[i]);
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (r[i] < M && c[j] < M) {
					int d = M - Math.max(r[i], c[j]);
					R[i * 3 + j] += d;
					r[i] += d;
					c[j] += d;
				}
			}
		}
		return R;
	}
}
