
class Rect 
{
	int width, height;
	public Rect(int w, int h)
	{
		this.width = w; 
		this.height = h;
	}
	double calcArea() { return (double) width*height; }
}

public class RectArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect[] list; //객체 배열
		list = new Rect[5]; //배열 초기화
		for(int i=0;i < list.length; i++)
			list[i] = new Rect(i, i); //새로 생성한 객체의 주소값을 저장
		for(int i=0;i < list.length; i++)
			System.out.println(i+"번째 사각형의 면적="+list[i].calcArea()); // 각 배열의 원소가 가리키는 객체에서 함수호출
	}

}
