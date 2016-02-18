import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KisoKadai1 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		String str = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("九九表 \n縦列の値を入力してね");



			str = br.readLine();
			x = Integer.parseInt(str);
			System.out.print("横列の値を入力して下さい");
			str = br.readLine();
			y = Integer.parseInt(str);

			for (int i = 1; i <= 9; i++) {

				for (int j = 1; j <= 9; j++) {
					if (i <= x) {
						if (j <= y) {
							System.out.print((i * j) + " ");

						}
					}

				}
				System.out.println("");
				if (isNumber(str)) {
					System.out.print("次の数値を入力して下さい");
					break;
				} else if (x == 0) {
					System.out.print("もう一度入力して下さい");
					continue;
				}
			}

		} catch (Exception e) {
			System.out.println("入力エラー\n 最初からやり直し");
		}
	}
	private static boolean isNumber(String str) {
		return false;
	}
}