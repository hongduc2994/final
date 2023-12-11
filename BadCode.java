import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BadCode {
    private String someVar;
    private static IBadCode instance;
    public static void setInstance(IBadCode inputInstance) { 
        instance = inputInstance; 
      } 
     
    public static IBadCode getInstance() { return instance; } 
    void setSomeVar(String input) { 
        someVar = input;
    }
    private String getSomeVar() { 
        return someVar; 
    }
    String logger() {
            String log = readFile("log.txt");
            return log;
        }
        private String readFile(String fileName){ 
        BufferedReader br; 
        try { 
            br = new BufferedReader(new FileReader(fileName)); 
            final StringBuilder sb = new StringBuilder(); 
            String line = br.readLine(); 
    
            while (line != null) { 
                sb.append(line); 
                sb.append(System.lineSeparator()); 
                line = br.readLine(); 
            } 
            return sb.toString(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
        return ""; 
    }
    int getSecondsInYear() {
        return 365 * 24 * 60 * 60;
    }
    public static void main (String[] args) {

        System.out.println(instance.getSomeVar());
    }
}
