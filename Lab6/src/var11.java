import java.io.*;
import java.lang.*;

public class var11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out=null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\m4sk\\IdeaProjects\\Lab6\\text.txt")));
            out = new PrintWriter("C:\\Users\\m4sk\\IdeaProjects\\Lab6\\result.txt");
            String s;
            char PB = 0;
            while ((s = br.readLine()) != null) {
                for (String word : s.split(" ")) {
                    char[] ch = new char[word.length()];
                    for (int i = 0; i < word.length(); i++) {
                        ch[i] = word.charAt(i);
                    }
                    if(ch.length != 0){
                        if(PB == 0){
                            PB = ch[0];
                            out.print(word+" ");
                        }else if((PB != 0)&&(PB == ch[0])){
                            out.print(word+" ");
                        }
                    }else{
                        out.println();
                    }
                }
                PB = 0;
                out.println();
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!"); }
        finally{
            br.close();
            out.flush();
            out.close();
        }
    }

}

