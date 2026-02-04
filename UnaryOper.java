class UnaryOper {
    public static void main(String EJY[]) {
    
    //String name[];
    String name[] = {"Pedro", "Juan", "Maria", "Tekla"};
    for (int = 0; i < name.length; ++i)
    System.out.println(name[i]);
    
    /*name = new String[5];
    name[0] = "James"; 
    System.out.println(name[0]);*/
    
    int x = 5, y = 8, z = 10, ans = 0;

    ans = ++x + y-- + --z;
    System.out.println("Ans = " + ans);

    ans = --x + y++ + z--;
    System.out.println("Ans = " + ans);

    ans = x-- + --y + z++;
    System.out.println("Ans = " + ans);

    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("z = " + z);

    }
}
