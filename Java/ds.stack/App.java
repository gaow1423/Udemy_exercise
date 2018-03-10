public class App{
    public static void main(String[] args){
        Stack theStack = new Stack(3);
        theStack.push('y');
        theStack.push('f');
        theStack.push('s');
        theStack.push('b');
        
        while(!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.println(value);
            //System.out.println(theStack.maxSize);
        }
        //reverseString("Hello");
        System.out.println(reverseString("Hello"));
        //System.out.println("\n");
    }
    public static String reverseString(String str){
        Stack thestr = new Stack(str.length());
        for (int i = 0; i < str.length(); i++)
        {
            thestr.push(str.charAt(i));
        }
        String s = "";
        while(!thestr.isEmpty()){
            s = s + thestr.pop();
        }
    
        return s;
    }
    
}
