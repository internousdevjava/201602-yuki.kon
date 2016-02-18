import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai1 {

    /**
     * @param args
     * @return
     */
    public static void main(String[] args) {

        System.out.println("九九表");

        boolean f = true;

        String str = null;
        int y;
        while (f) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("行数を入力してください。"
                        + "(行数・列数ともに数字は1～9までです。)");
                str = br.readLine();

                if (isNumber(str)) {
                    y = Integer.parseInt(str);
                    if (y >= 1 && y < 100) {

                        break;
                    } else {
                        System.out.println("1～99以外の数字になっていませんか？"
                                + "\n再度1～9のまでの数字を入力して下さい。");
                    }
                } else {
                    System.out.println("数字以外になっていないですか？"
                            + "\n再度1～9までの数字を入力して下さい。");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        String str2 = null;
        int x;
        while (f) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("列数を入力してください。");
                str2 = br.readLine();

                if (isNumber(str2)) {
                    x = Integer.parseInt(str2);
                    if (x >=1 && x < 100) {
                        break;
                    } else {
                        System.out.println("1～99以外の数字になっていませんか？"
                                + "\n再度1～9までの数字を入力して下さい。");
                    }
                } else {
                    System.out.println("数字以外になっていないですか？"
                            + "\n再度1～9までの数字を入力して下さい。");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        y = Integer.parseInt(str);
        x = Integer.parseInt(str2);

        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                if (i * j < 10) {
                    System.out.print("   " + (i * j));
                    System.out.print(" ");
                }
                else if(i * j < 100){
                    System.out.print("  " + (i * j));
                    System.out.print(" ");
                }
                else if(i * j < 1000){
                    System.out.print(" " + (i * j));
                    System.out.print(" ");
                }
                else{
                    System.out.print(i * j);
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
    public static boolean isNumber(String val) {
        try {
            Integer.parseInt(val);
            return true;
        } catch (NumberFormatException nfex) {
            return false;
        }

    }
}