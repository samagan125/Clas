public class Main {
    public static void main(String[] args) {
     Clas s=new Clas(20,"java",new int[]{1,2,3,5,5,4,4788,55,62,2,6,4,4,5,5,1,222});
        System.out.println(s.getSoz());
        System.out.println(s.getSan());
        for (int i = 0; i < s.getMasiv().length; i++) {
            System.out.print(s.getMasiv()[i]+" ");
        }
    }
}