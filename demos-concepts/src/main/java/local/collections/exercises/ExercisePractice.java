package local.collections.exercises;

import java.util.Stack;

public class ExercisePractice {
    static Stack<Character> st = new Stack<>();
    
    Stack<Character> populateStackList (String word){
        for (int i = 0; i < word.length(); i++) {
            st.push(word.charAt(i));
        }
        return st;
    }

    Stack<Character> revertStack (Stack<Character> stack){
         st = stack.reversed();
        return st;
    }


    
    
    public static void main(String[] args) {
        ExercisePractice ep = new ExercisePractice();
        Stack<Character> popeye = ep.populateStackList("monja");
        popeye.revertStack();
        System.out.println(popeye);
    }

}
