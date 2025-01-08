public class FunctionMain {

    // public static void main (String[] args) {
    //     int result = summa(5, 7);

    //info("Hello");
    // info("HI");
    //  String words = "hi all";
    // info(words);
    //  }
    //   public static void int summa(int a, int b) {
    //       int res = a + b;
    //       info(String.valueOf(res));
    //       return res;
    //   }
    // for(String el : args)
    //   System.out.println(el);

    //   public static void summa(int a, int b) {
    //       int res = a + b;
    //       System.out.println(res);
    //   }

    //   public static void info(String word){
    //       System.out.print(word);
    //       System.out.println("!");
//    }

    public static void main(String[] args) {
        int[] nums1 = {6, 7, 4, 7};
        summa(nums1);

        int[] nums2 = {6, 7, 4, 7, 6};
        summa(nums2);

    }

    public static void  summa(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        System.out.println("Summa all elements: " + sum);
    }

}