package sizeyunsuan;
import java.util.Random;
import java.util.Scanner;
class size{
	int q[];
	int q1[];
	Scanner reader=new Scanner(System.in);
	int k,h,e,h1,n,n1;
	Random ra =new Random();
	public void ys() throws Exception{	
		System.out.println("��Ŀ����");
		int a=reader.nextInt();	
		System.out.println("�Ƿ�����˳�����1�ǲ���������2�ǰ�����");
		int c=reader.nextInt();
		System.out.println("�Ƿ����������1�ǲ���������2�ǰ�����");
		int e=reader.nextInt();		
		System.out.println("��ֵ��Χ");				
		int b=reader.nextInt();		
		for(int i=0;i<a;i++){
				if(e==1) {
					if(b==100) {
							h=ra.nextInt(b);
							h1=ra.nextInt(b);
						}else {
							h=ra.nextInt(b);
							h1=ra.nextInt(b);
							}
						}else {
							if(b==100) {
								h=ra.nextInt(b - (-b) + 1)-(100);//rand.nextInt(100 - (-100) + 1) + (-100)
								h1=ra.nextInt(b - (-b) + 1)-(100);
							}else {
								h=ra.nextInt(b - (-b) + 1)-(1000);
								h1=ra.nextInt(b - (-b) + 1)-(1000);
							}
						}
				if(c==1) {
					int c1=(int)(Math.random()*2);//�������һ����������0��ʾ�ӷ���1��ʾ����
					if(c1==0) {	
								n=(h1)+(h);
								
								if(n<b&&n>-b) {
								System.out.println(h1+" + "+h+"="+n);
								}else
								{
									i--;
									continue;
								}
								}
							if(c1==1) {
								n=(h1)-(h);
								if(n<b&&n>-b) {
								System.out.println(h1+" - "+h+"="+n);
								}else {
								i--;
								continue;
								}
								}
						}
					else
						{
							int c1=(int)(Math.random()*4);//�������һ��1-4��������0��ʾ�ӷ���1��ʾ������2��ʾ�˷���3��ʾ����
							if(c1==0) {
								n=(h1)+(h);
								if(n<b&&n>-b) {
								System.out.println(h1+" + "+h+"="+n);
								}
								else {
									i--;
									continue;
								}
							}
							if(c1==1) {
								n=(h1)-(h);
								if(n<b&&n>-b) {
								System.out.println(h1+" - "+h+"="+n);
								}
								else {
									i--;
									continue;
								}
							}
							if(c1==2) {
								n=(h1)*(h);
								if(n<b&&n>-b) {
								System.out.println(h1+" * "+h+"="+n);
								}
								else {
									i--;
									continue;
								}
							}
							if(c1==3) {
								n=(h1)/(h);
								if(n<b&&n>-b) {
								System.out.println(h1+" / "+h+"="+n);
								}
								else {
									i--;
								continue;
							}
							}
						}	
				}
			}		 
	}


public class sz {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub	
		try {
			size s=new size();
			s.ys();
			}
		catch(Exception e)
			{
				System.out.println(Thread.currentThread().getName()+"---"+"��ʽ����");
			}
	}
}
