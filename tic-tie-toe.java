package zjs0317;

//游戏：tic-toc-toe
//玩法：井字棋，一行画三个X，或者一列画三个x，或者对角线上三个x判定赢。
//用户输入棋盘的走势（输入1代表x，0代表O,输入九个），系统判定输赢.
/**
 * @author zjs
 *
 */

import java.util.Scanner;

public class tt {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;//定义棋盘大小
		int i,j;
		int[][] board = new int [SIZE][SIZE];
		boolean getResult = false;//结果
		int num0fX = 0;//x的数量
		int num0fO = 0;
		//读入矩阵：
		System.out.println("请输入棋盘的局势：用数字1代表X,数字0代表O,默认为3*3的棋盘");
		for(i=0; i<board.length; i++ ){
			for(j=0; j<board[i].length;j++)
				board[i][j] = in.nextInt();
		}
		System.out.println("判断结果为：");
		//检查行：
		for(i=0;i<board.length;i++) {
			for(j=0;j<board[i].length;j++){
				if( board[i][j] == 1){
					num0fX ++;
				}
				else{
					num0fO ++;
				}
			}
			if( (num0fX == SIZE || num0fO == SIZE) && getResult == false){
				System.out.println("第："+(i+1)+"行形成了赢得局势，恭喜获胜！");
				getResult = true;
				break;
			}
			else {
				num0fX  = 0;
				num0fO  = 0;
				j = 0;
			}
		}
		//检查列：
		if( !getResult ) {
			i = 0;
			j = 0;
			for(j=0;j<board[i].length;j++) {
				for( i=0;i<board.length;i++){
					if( board[i][j] == 1){
						num0fX ++;
					}
					else{
						num0fO ++;
					}
				}
				if( (num0fX == SIZE || num0fO == SIZE) && getResult == false){
					System.out.println("第："+(j+1)+"列形成了赢得局势，恭喜获胜！");
					getResult = true;
					break;
				}
				else {
					num0fX  =0;
					num0fO  = 0;
					i = 0;
				}
			}
			}
		//检查正对角线
		if( !getResult ) {
			for(i=0;i<board.length;i++) {
				if( board[i][i] == 1){
					num0fX ++;
				}
				else{
					num0fO ++;
				}
			}
			if( (num0fX == SIZE || num0fO == SIZE) && getResult == false){
				System.out.println("正对角线形成了赢得局势，恭喜获胜！");
				getResult = true;
				}
			else {
				num0fX  = 0;
				num0fO  = 0;
				}
		}
			//检查反对角线
			if(!getResult) {
				for(i=0; i<SIZE; i++) {
					if(board[i][SIZE - i - 1] == 1) {
						num0fX ++;
					}
					else {
						num0fO ++;
					}
				}
				if ( (num0fO == SIZE || num0fX == SIZE) && getResult == false) {
					System.out.println("反对角线形成了赢得局势，恭喜获胜！");
					getResult = true;
				}
				else {
					num0fX  = 0;
					num0fO  = 0;
				}
			}
	}
	}
