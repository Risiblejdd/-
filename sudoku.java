import java.util.Scanner;

public class sudoku {
	
	public static void main(String[] args){
//		Scanner scanner = new Scanner(System.in);
//		scanner.next();//性能测试用
		lib ab = new lib();
		ab.loadArgs(args);//传入参数
		ab.checkArgs();//检查输入的文件是否存在
		ab.readFile();//读取文件
		ab.writeFile(false);
		for(int i =0; i < lib.n; i++) {
			ab.getAndDO(i);//取得第i个数独表进行求解
			ab.writeFile(true);//将结果写入指定文件中
		}
//		scanner.next();
		
	}
	
}