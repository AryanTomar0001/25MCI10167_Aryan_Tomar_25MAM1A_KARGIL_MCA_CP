import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        sc.nextLine(); 
 
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine(); 
 
            char[] s = sc.nextLine().toCharArray();
 
            Map<Character, Integer> freq = new HashMap<>();
 
            for (char c : s) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
 
            char maxChar = s[0];
            int maxFreq = 0;
            for (Map.Entry<Character, Integer> e : freq.entrySet()) {
                if (e.getValue() > maxFreq) {
                    maxFreq = e.getValue();
                    maxChar = e.getKey();
                }
            }
 
            char minChar = 0;
            int minFreq = Integer.MAX_VALUE;
            boolean found = false;
 
            for (char c : s) {
                if (c != maxChar && freq.get(c) < minFreq) {
                    minFreq = freq.get(c);
                    minChar = c;
                    found = true;
                }
            }
 
            if (!found) {
                System.out.println(new String(s));
                continue;
            }
 
            for (int i = 0; i < n; i++) {
                if (s[i] == minChar) {
                    s[i] = maxChar;
                    break;
                }
            }
 
            System.out.println(new String(s));
        }
 
        sc.close();
    }
}
