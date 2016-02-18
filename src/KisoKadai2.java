import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class KisoKadai2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rnd = new Random();

		int end = 0;
		int ran = rnd.nextInt() % 101;
		if (ran < 0) {
			ran *= -1;
		}
		System.out.println("１～１００の数字をランダムで作成しますそれを当ててください");

		while (end == 0) {
			try {
				System.out.println("１～１００の数字を入力してください終了するときは1000を入力してください");
				String str = br.readLine();
				int nu = Integer.parseInt(str);
				if (nu == 1000) {
					break;
				}
				if (nu == ran) {
					System.out.println("正解です！");
					end = 1;
				} else {
					if (nu > ran) {
						System.out.println("CPUが作成した数字はもっと小さいです");
					} else {
						System.out.println("CPUが作成した数字はもっと大きいです");
					}
				}
			} catch (Exception e) {
				System.out.println("入力エラーです");
			}
		}
		System.out.println("終了しました");
	}
}