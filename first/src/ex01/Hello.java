package ex01;

public class Hello {

	public static void main(String[] args) {
		
		int exam = 5000;
		
		int hour, min, second;
		
		hour = exam / 3600; // 1분 = 60초, 60분 = 1시간 => 60 * 60 = 3600, 3600으로 나눈 몫이 시간
		
		System.out.println(hour);
		
		min = (exam / 60)%60; // 4000 / 60 => 분 => 60분 == 1시간이니까 60을 빼면 분 계산
		
		System.out.println(min);
		
		second = exam % 60; // 4000 % 60 => 초 계산 => 60으로 나눈 나머지의 값은 초이기 때문에
		
		System.out.println(second);
	}
}