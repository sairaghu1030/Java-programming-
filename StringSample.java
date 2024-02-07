public class StringSample {
    public static void main(String[] args)
    {
        String s="my name is mike";
        String c=s.toUpperCase();
        System.out.println(c);
        String b=c.replace('m','l');
        System.out.println(b);
        String k=s.substring(3,6);
        System.out.println(k);
        char n=s.charAt(6);
        System.out.println(n);
    }
}
