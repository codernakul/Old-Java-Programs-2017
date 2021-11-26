import java.io.*; 
class GFG8 { 
    public static void solve(String s) 
    { 
        int l = s.length(); 
        int x = l / 2; 
        int y = l; 
        String p = ""; 
        while (x > 0 && y > l / 2) {char ch = s.charAt(x - 1); 
            p += ch; 
            x--; 
            ch = s.charAt(y - 1); 
            p += ch; 
            y--; 
        } 

        if (y > l / 2) { 
            char ch = s.charAt(x - 1); 
            p += ch; 
            y--; 
        } 
        System.out.println(p); 
    } }
