public class insertstar {
    public static void main(String[] args)
    {
        String word="hello";
        char[] word1=new char[word.length()+1];
        char[] chars = word.toCharArray();
        for (int i=0;i<chars.length-1;i++)
        {
            if (chars[i]==chars[i+1])
            {
                System.out.println(chars[i] +" "+ chars[i+1]);
                word1[i]=word.charAt(i);
                word1[i+1]='*';
               i=i+1;
            }
            else
                word1[i]=chars[i];
        }
        String s=new String(word1);
        System.out.println(s);

    }
}