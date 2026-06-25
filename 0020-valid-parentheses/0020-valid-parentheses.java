class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            if(!stack.isEmpty()){
                char last = stack.peek();
                if(isPair(last,s.charAt(i))){
                    stack.pop();
                    continue;
                }
            }
            stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
    public boolean isPair(char last, char ch){
        return(last=='('&&ch==')')||(last=='{'&&ch=='}')||(last=='['&&ch==']');
    }
}