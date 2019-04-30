import java.util.Stack;

public class P11 {
    public static void main(String[] args) {
        String e = "34 12 25/*";
        System.out.println(postfixEval(e));
    }

    private static double postfixEval(String e) {
        Stack<Double> stack = new Stack<>();
//        e=e.replace("/", " /");
//        e=e.replace("*", " *");
//        e=e.replace("+", " +");
//        e=e.replace("-", " -");
        String t="";
        for(int i=0;i<e.length();i++) {
            char c=e.charAt(i);
            if(c=='/'||c=='*'||c=='+'||c=='-') t=t+" "+c+" ";
            else t=t+c;
        }
        for (String token : t.split("\\s+")) {
            if ("+ - / *".contains(token)) {
                double n2 = stack.pop();
                double n1 = stack.pop();
                if (token.equals("+")) stack.push(n1 + n2);
                if (token.equals("-")) stack.push(n1 - n2);
                if (token.equals("*")) stack.push(n1 * n2);
                if (token.equals("/")) stack.push(n1 / n2);
            } else
                stack.push(Double.parseDouble(token));
        }
        return stack.pop();
    }
}