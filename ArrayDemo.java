class ArrayDemo {
    public static void main(String EJY[]) {

    int[] arr, x, y;
    int a[], b=2, c;
    
    a = new int[5]; //0, 1, 2, 3, 4, 5 = 5 numbers
    a[0] = 25;
    a[1] = 175;
    a[2] = 64;
    a[3] = 87;
    a[4] = 16;      

    System.out.println("Value? " + a[++b]);

    System.out.println("1st Element: " + a[0]);
    System.out.println("2nd Element: " + a[1]);
    System.out.println("3rd Element: " + a[2]);
    System.out.println("4th Element: " + a[3]);
    System.out.println("5th Element: " + a[4]);

    for (c = 0; c < a.length; ++c)
    System.out.println("Element " + c + ": " + a[c]);


    }
}
