import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		System.out.print("��ί����Ϊ��");
		int num=reader.nextInt();
		Score s=new Score();
		System.out.println("�������λ��ί�ķ�����");
		int[] a=new int[num];
		for(int i=0;i<num;i++){
			a[i]=reader.nextInt();
		}
		System.out.print("ȥ����߷֣�"+s.max(a)+";");
		System.out.print("ȥ����ͷ֣�"+s.min(a)+"��");
		System.out.println();
		System.out.print("ѡ�����յ÷֣�"+s.match(a,num));
	}
}