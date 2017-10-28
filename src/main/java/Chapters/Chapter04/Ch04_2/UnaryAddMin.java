package Chapters.Chapter04.Ch04_2;
class UnaryAddMin {
    public static void main(String[] args) {
        short num1 = 5;
        System.out.println(+num1);
        // 결과적으로 불필요한 +연산 (short 5 → int 5)
        System.out.println(-num1);
        // 부호를 바꿔서 얻은 결과를 바로 출력

        short num2 = 7;
        short num3 = (short)(+num2); // 명시적 형 변환을 하지 않으면 컴파일 오류
        short num4 = (short)(-num2); // 명시적 형 변환을 하지 않으면 컴파일 오류
        System.out.println(num3);
        System.out.println(num4);
    }
}