package baekjoon.ect;

import java.io.*;

public class Scale_ver3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        String st = br.readLine();
        if (st.equals("1 2 3 4 5 6 7 8")) {
            pw.println("ascending");
        } else if (st.equals("8 7 6 5 4 3 2 1")) {
            pw.println("descending");
        } else {
            pw.println("mixed");
        }

        pw.flush();
        pw.close();
    }
}

//PrintWriter => memory : 14188 KB / Time : 100 ms