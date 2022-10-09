import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		System.out.print("评委个数为：");
		int num=reader.nextInt();
		Score s=new Score();
		System.out.println("请输入各位评委的分数：");
		int[] a=new int[num];
		for(int i=0;i<num;i++){
			a[i]=reader.nextInt();
		}
		System.out.print("去掉最高分："+s.max(a)+";");
		System.out.print("去掉最低分："+s.min(a)+"。");
		System.out.println();
		System.out.print("选手最终得分："+s.match(a,num));
	}
}