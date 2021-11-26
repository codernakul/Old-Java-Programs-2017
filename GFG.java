class GFG { 
    static int n = 4; 
    static void interchangeFirstLast(int m[][]) 
    { 
        int cols = n; 
        for (int i = 0; i < n; i++) { 
            int t = m[i][0]; 
            m[i][0] = m[i][n - 1]; 
            m[i][n - 1] = t; 
        } 
    } 

    public static void main (String[] args) { 
        // input in the array 
        int m[][] = { { 8, 9, 7, 6 }, 
                { 4, 7, 6, 5 }, 
                { 3, 2, 1, 8 }, 
                { 9, 9, 7, 7 } }; 

        interchangeFirstLast(m); 

        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) 
                System.out.print(m[i][j] + " "); 
            System.out.println(); 
        } 
    } 
}
