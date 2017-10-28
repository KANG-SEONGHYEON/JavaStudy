/* 문제 04-2의 문제 1 */
package Question.Page_102;
class Q04_2_1 {
    public static void main(String[] args) {
        byte num = 7;
        byte result = (byte)(~num);
        result += 1;
        System.out.println(result);
    }
}