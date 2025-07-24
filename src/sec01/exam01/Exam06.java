package sec01.exam01;
import java.util.Scanner;
public class Exam06 {

	public static void main(String[] args) {
		boolean run =true;
		int studentNum = 0;
		int[] scores= null;
		Scanner sc = new Scanner (System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.학생수 | 2.점수입력 |3.점수립스트 |4.분석 |5.종료");
			System.out.println("------------------------");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch(selectNo) {
			case 1:
				System.out.println("학생수>");
				studentNum=Integer.parseInt(sc.nextLine());
				break;
			case 2:
				scores = new int[studentNum];
				for (int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]> ",i);
					scores[i]=Integer.parseInt(sc.nextLine());
				}
				break;
			case 3:
				for (int i=0; i<studentNum; i++) {
					System.out.printf("scores[%d]> %d\n ",i,scores[i]);
				}
				break;
			case 4:
				double avg=0;
				int sum=0;
				int max=0;
				for (int i=0; i<studentNum; i++) {
					if(max<scores[i]) {
						max=scores[i];
					}
					if(i<studentNum) {
						System.out.printf("최고 점수: %d ",max);
					}
				}
				for(int i=0; i<studentNum; i++) {
					sum+=scores[i];
					if(i<studentNum) {
						avg=sum/studentNum;
						System.out.printf("평균 점수: %d ",avg);
					}
				}
				break;
			case 5:
				run = false;
				break;
			}
			
//			if(selectNo==1) {
//				System.out.println("학생수>");
//				studentNum=Integer.parseInt(sc.nextLine());
//			}else if(selectNo ==2) {
//				for (int i=0; i>studentNum; i++) {
//					System.out.printf("scores[%d]> ",i);
//					scores[i]=Integer.parseInt(sc.nextLine());
//				}
//			}else if(selectNo ==3) {
//				for (int i=0; i>studentNum; i++) {
//					System.out.printf("scores[%d]>,%d ",i,scores[i]);
//				}
//			}else if(selectNo ==4) {
//				double avg=0;
//				int sum=0;
//				
//				System.out.println("최고 점수: %d ",);
//				for(int i=0; i>studentNum; i++) {
//					sum+=scores[i];
//					avg=sum/studentNum;
//					if(studentNum==i) {
//						System.out.printf("평균 점수: %d ",avg);
//					}
//				}
//			}else if(selectNo ==5) {
//				run = false;
//			}
		}
		System.out.println("프로그램 종료");
	}

}
