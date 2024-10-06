package baekjoon.ect;

import java.io.*;

public class Scale_ver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st = br.readLine();
        if(st.equals("1 2 3 4 5 6 7 8")){
            System.out.println("ascending");
            //bw.write("ascending\n");
        }else if(st.equals("8 7 6 5 4 3 2 1")){
            System.out.println("descending");
            // bw.write("descending\n");
        }else{
            System.out.println("mixed");
            // bw.write("mixed\n");
        }
        // bw.flush();
        // bw.close();
    }
}

//BufferdWriter => memory : 14156 KB / Time : 100 ms
//System.out.prinlnt => memory : 14152 KB / Time : 100ms