package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String arr[]){
        Scanner in=new Scanner(System.in);
        String str;
        System.out.println("Введите комбинацию скобок: ");
        str=in.nextLine();
        char []masstr=str.toCharArray();
        Stack stack=new Stack<Character>();
        if(masstr[0]==')' || masstr[0]==']' || masstr[0]=='}' || masstr.length % 2 !=0) {
            System.out.println("Неправильная комбинация");
            return;
        }
        for(int i=0;i<masstr.length;i++)
        {
            switch (masstr[i]){
                case '(' :
                    stack.push(masstr[i]);
                    break;
                case '[' :
                    stack.push(masstr[i]);
                    break;
                case '{' :
                    stack.push(masstr[i]);
                    break;
                case ')' : {
                    if (stack.size()!=0) {
                        if (stack.peek().equals('('))
                            stack.pop();
                        else
                            continue;
                    }
                } break;
                case '}' : {
                    if(stack.size()!=0) {
                        if (stack.peek().equals('{'))
                            stack.pop();
                        else
                            continue;
                    }
                } break;
                case ']' : {
                    if(stack.size()!=0) {
                        if (stack.peek().equals('['))
                            stack.pop();
                        else
                            continue;
                    }
                } break;
            }
        }
        if(stack.size()==0)
            System.out.println("Правильная комбинация");
        else
            System.out.println("Неправильная комбинация");
    }
}