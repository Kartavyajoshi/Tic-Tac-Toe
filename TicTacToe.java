import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
        char [][]board=new char[3][3];
        char []player= {'X','O'};
        for(int i=0;i<3;i++) {
        	for(int j=0;j<3;j++) {
        		board[i][j]=' ';
        	}
        }
        Scanner sc=new Scanner(System.in);
        while(true) {
        printboard(board);
        System.out.println("Enter your choice "+player[f]+" row & col ::");
        int row=sc.nextInt();
        int col=sc.nextInt();
        if(board[row][col]==' ') {
        	board[row][col]=player[f];
        	if(gameover(board,player,f)) {
        		System.out.println("Player "+player[f]+" won ...!");
        		break;
        	}
        	f=(f==0)? 1:0;  //swap the player
        }
        	System.out.println("Invalid move try-againg !");
        }
        
	}
	public static boolean gameover(char [][]board ,char player[],int i) {
	          for(int a=0;a<board.length;a++) {
	        	  if(board[a][0]==player[i] && board[a][1]==player[i] && board[a][2]==player[i]) {
	        		  return true;
	        	  }
	          }
	          for(int a=0;a<board[0].length;a++) {
	        	  if(board[0][a]==player[i] && board[1][a]==player[i] && board[2][a]==player[i]) {
	        		  return true;
	        	  }
	          }
	          if(board[0][0]==player[i] && board[1][1]==player[i] && board[2][2]==player[i]) {
        		  return true;
        	  }
	          else if(board[2][0]==player[i] && board[1][1]==player[i] && board[0][2]==player[i]) {
        		  return true;
        	  }
	          return false;
	}
	public static void printboard(char [][]board) {
		 for(int i=0;i<board.length;i++) {
	        	for(int j=0;j<board[0].length;j++) {
	        		System.out.print("|"+board[i][j]+"|");
	        	}
	        	System.out.println();
	        }
	}

}
