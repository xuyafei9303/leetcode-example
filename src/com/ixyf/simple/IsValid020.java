package com.ixyf.simple;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 020.有效的括号
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 * 利用栈这个解构，将对应符合要求的括号放到栈里面，然后弹出栈的时候和map里面对应的括号进行对比，如果对比通过就删除，然后对比下一个，下一个如果不符合，返回false，一直比较到dq为空，不为空的话也是false
 */
public class IsValid020 {

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        Deque<Character> dq = new ArrayDeque<>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                dq.push(c);
            } else {
                if (dq.size() == 0 || map.get(c) != dq.pop()) {
                    return false;
                }
            }
        }
        return dq.size() == 0;
    }
}
