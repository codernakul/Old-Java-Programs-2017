class test_escape_sequence
{
    public static void main()
    {
        System.out.println("NAKUL SINGH");
        System.out.println("NAKUL\tSINGH");
        System.out.println("NAKULSINGH");
        System.out.println("NAKUL\bSINGH");
        System.out.println("NAKUL\nSINGH");
        System.out.println("NAKUL\\SINGH");
        System.out.println("NAKUL\"SINGH");
        System.out.println("NAKUL\'SINGH");
        System.out.println("NAKUL?SINGH");
        System.out.println("NAKUL\u3301  \rSINGH");
    }
}