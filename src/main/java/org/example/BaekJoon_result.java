package org.example;

import java.util.Scanner;

public class BaekJoon_result {
    public static void main(String[] args) {
        //        1번
//        Scanner s = new Scanner(System.in);
//        int num1 = s.nextInt();
//        int num2 = s.nextInt();
//        if(num1 > 0 && num2 > 0 ){
//            System.out.println(num1+num2);
//        }
//        2번
//        Scanner s = new Scanner(System.in);
//        int num1 = s.nextInt();
//        int num2 = s.nextInt();
//        if(num1 > 0 && num2 > 0 ){
//            System.out.println(num1-num2);
//        }
//        3번
//        Scanner s = new Scanner(System.in);
//
//        int t = s.nextInt();
//        for(int i=0; i<t; i++){
//            //조규현
//            int x1 = s.nextInt();
//            int y1 = s.nextInt();
//            int r1 = s.nextInt();
//
//            //류재명
//            int x2 = s.nextInt();
//            int y2 = s.nextInt();
//            int r2 = s.nextInt();
//
//            System.out.println(calcPoints(x1,y1,r1,x2,y2,r2));
        }

    //3번 함수
//    private static int calcPoints(int x1, int y1, int r1, int x2, int y2, int r2)
//    {
//        // 두 점 사이의 거리 계산식 이때 double로 풀면 double형은 근사치로 처리하기때문에 오차가 생길수있다
//        int distance = (int)(Math.pow(x2-x1 , 2) + Math.pow(y2-y1,2));
//
//        int sub = Math.abs(r1 - r2);
//
//        // case 1 - 두 원이 정확히 겹칠 경우 (접점의 개수가 무한일때)
//        if(x1 == x2 && y1 == y2 && r1 == r2) {
//            return -1;
//        }
//        // case 2 -  두 점 사이의 거리가 각 원의 반지름 합보다 클 때
//        else if(distance > Math.pow((r1+r2),2)){
//            return 0;
//        }
//        // case 2-2 - 한 원 안에 다른 원이 있으면서 접점이 없을때
//        else if(distance < Math.pow((r2-r1),2)){
//            return 0;
//        }
//        // case 3 - 내접할때 (접점이 한 개일 때)
//        else if(distance == Math.pow((r2-r1),2)){
//            return 1;
//        }
//        // case 4 - 외접할때 (접짐이 한 개일 때)
//        else if(distance == Math.pow((r2+r1),2)){
//            return 1;
//        }
//        // case 그 외는 무조건 점점은 2개
//        else {
//            return 2;
//        }
//    }

}
