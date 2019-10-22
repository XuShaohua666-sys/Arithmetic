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
		System.out.println("题目数量");
		int a=reader.nextInt();	
		System.out.println("是否包含乘除法（1是不包含）（2是包含）");
		int c=reader.nextInt();
		System.out.println("是否包含负数（1是不包含）（2是包含）");
		int e=reader.nextInt();		
		System.out.println("数值范围");				
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
					int c1=(int)(Math.random()*2);//随机生成一个的整数，0表示加法，1表示减法
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
							int c1=(int)(Math.random()*4);//随机生成一个1-4的整数，0表示加法，1表示减法，2表示乘法，3表示除法
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
				System.out.println(Thread.currentThread().getName()+"---"+"格式错误");
			}
	}
}
