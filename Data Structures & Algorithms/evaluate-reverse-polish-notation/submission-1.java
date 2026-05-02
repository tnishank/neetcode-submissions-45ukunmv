class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        Set<String> operators = new HashSet<>();
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");

        int l, r, result;
        for(String str: tokens){
            if(operators.contains(str)){
                r = Integer.parseInt(stack.pop());
                l = Integer.parseInt(stack.pop());
                
                if(str.equals("*")){
                    result = l*r;
                    stack.push(Integer.toString(result));
                }else if(str.equals("/")){
                    result = l/r;
                    stack.push(Integer.toString(result));
                }else if(str.equals("+")){
                    result = l+r;
                    stack.push(Integer.toString(result));
                }else{
                    result = l-r;
                    stack.push(Integer.toString(result));
                }
                continue;
            }
            stack.push(str);
        }
        return Integer.parseInt(stack.pop());
    }
}
