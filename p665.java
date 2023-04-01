import java.util.Scanner;

public class p665 {
    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        String userInput, versionInicial, versionFinal;

        int n = tec.nextInt();
        tec.nextLine();
        for (int i = n; i > 0; i--){
            userInput = tec.nextLine();
            String [] versions = userInput.split(" ");
            versionInicial = versions[0];
            versionFinal = versions[1];
            
            String [] parts = versionInicial.split("\\.");
            
            String major = String.format("%s.%s.%s",Integer.parseInt(parts[0]) + 1, 0, 0);
            String minor = String.format("%s.%s.%s",parts[0], Integer.parseInt(parts[1]) + 1, 0);
            String patch = String.format("%s.%s.%s",parts[0], parts[1], Integer.parseInt(parts[2]) + 1);
    
            if (versionFinal.equals(major) || versionFinal.equals(minor) || versionFinal.equals(patch))
                System.out.println("SI");
            else
                System.out.println("NO");
        }
        tec.close();  
    }
}