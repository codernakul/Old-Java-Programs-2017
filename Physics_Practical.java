class Physics_Practical
{
    public static void focal_length(double v,double u)
    {
        double f;
        f=(v*u)/(v+u);
        System.out.println("v = "+v+" u = "+u);
        System.out.println("Focal Length = "+f);
    }
    
    public static void object_distance(double v,double f)
    {
        double u;
        u=(v*f)/(v-f);
        System.out.println("v = "+v+" f = "+f);
        System.out.println("Object Distance = "+u);
    }
}