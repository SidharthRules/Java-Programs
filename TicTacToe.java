import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Design extends JFrame implements ActionListener
{
	JFrame f;
	Container board;
	JLabel status;
	JButton b[],reset;
	int player;
	int gameMat [][];
	Design()
	{
		f=new JFrame("Tic Tac Toe");
		board = new Container();
		status = new JLabel("Player 1, Make Your Move");
		b= new JButton[9];
		for (int i=0;i<9;i++)
			b[i]=new JButton("-");
		reset = new JButton("Reset");
		player = 1;// Indicates which player Begins
		gameMat = new int [3][3];
		for (int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				gameMat[i][j]=0;
	}
	void add(int p,int data, int i, int j)
	{
		gameMat[i][j]=data;
	}
	void chkTie()
	{
		System.out.println("ChkTie");
		int flag=0;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				if(gameMat[i][j]!=0)
					flag+=1;
		if(flag==9)
			status.setText("Game Tie Between Two Opponents. Reset Game !");
	}
	void chkWin(int x)
	{
		int d1,d2,c1,c2,c3,r1,r2,r3;
		d1=d2=0;
		c1=c2=c3=0;
		r1=r2=r3=0;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			{
				if(i==j && gameMat[i][j]==x)
					d1+=1;
				if(i+j==2 && gameMat[i][j]==x)
					d2+=1;
				if(i==0 && gameMat[i][j]==x)
					r1+=1;
				if(i==1 && gameMat[i][j]==x)
					r2+=1;
				if(i==2 && gameMat[i][j]==x)
					r3+=1;
				if(j==0 && gameMat[i][j]==x)
					c1+=1;
				if(j==1 && gameMat[i][j]==x)
					c2+=1;
				if(j==2 && gameMat[i][j]==x)
					c3+=1;	
			}
		if(c1==3 || c2==3 || c3==3 || d1==3 || d2==3 || r1==3 || r2==3 || r3==3 )
			//status.setText("Player "+x+" is winner !");
			System.out.println("Player "+x+" is winner !");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
					System.out.print(gameMat[i][j]+" ");
				System.out.println();
			}
		System.out.println(c1+" "+c2+" "+c3+" "+r1+" "+r2+" "+r3+" "+d1+" "+d2+" ");
	}
	void gui()
	{
		board.setLayout(new GridLayout(3,1,3,2));
		f.setLayout(new GridLayout(3, 1, 5, 5));
		f.setVisible(true);
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i=0;i<9;i++)
			board.add(b[i]);
		f.add(status);
		f.add(board);
		f.add(reset);
		for(int i=0;i<9;i++)
			b[i].addActionListener(this);
		reset.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b[0])
		{
			if(b[0].getText().equals("-"))
			{
				if(player==1)
				{
					b[0].setText("X");
					add(player,1,0,0);
					player =2;
					status.setText("Player 2, Make Your Move !");
				}
				else
				{
					b[0].setText("O");
					add(player,2,0,0);
					player =1;
					status.setText("Player 1, Make Your Move !");
				}
			}
			else
			{
				status.setText("Invalid Move, Try Again Buddy !");
			}
		}
		if(e.getSource()==b[1])
		{
			if(b[1].getText().equals("-"))
			{
				if(player==1)
				{
					b[1].setText("X");
					add(player,1,0,1);
					player =2;
					status.setText("Player 2, Make Your Move !");
				}
				else
				{
					b[1].setText("O");
					add(player,2,0,1);
					player =1;
					status.setText("Player 1, Make Your Move !");
				}
			}
			else
			{
				status.setText("Invalid Move, Try Again Buddy !");
			}
		}
		if(e.getSource()==b[2])
		{
			if(b[2].getText().equals("-"))
			{
				if(player==1)
				{
					b[2].setText("X");
					add(player,1,0,2);
					player =2;
					status.setText("Player 2, Make Your Move !");
				}
				else
				{
					b[2].setText("O");
					add(player,2,0,2);
					player =1;
					status.setText("Player 1, Make Your Move !");
				}
			}
			else
			{
				status.setText("Invalid Move, Try Again Buddy !");
			}
		}
		if(e.getSource()==b[3])
		{
			if(b[3].getText().equals("-"))
			{
				if(player==1)
				{
					b[3].setText("X");
					add(player,1,1,0);
					player =2;
					status.setText("Player 2, Make Your Move !");
				}
				else
				{
					b[3].setText("O");
					add(player,2,1,0);
					player =1;
					status.setText("Player 1, Make Your Move !");
				}
			}
			else
			{
				status.setText("Invalid Move, Try Again Buddy !");
			}
		}
		if(e.getSource()==b[4])
		{
			if(b[4].getText().equals("-"))
			{
				if(player==1)
				{
					b[4].setText("X");
					add(player,1,1,1);
					player =2;
					status.setText("Player 2, Make Your Move !");
				}
				else
				{
					b[4].setText("O");
					add(player,2,1,1);
					player =1;
					status.setText("Player 1, Make Your Move !");
				}
			}
			else
			{
				status.setText("Invalid Move, Try Again Buddy !");
			}
		}
		if(e.getSource()==b[5])
		{
			if(b[5].getText().equals("-"))
			{
				b[5].setText("X");
				if(player==1)
				{
					add(player,1,1,2);
					player =2;
					status.setText("Player 2, Make Your Move !");
				}
				else
				{
					b[5].setText("O");
					add(player,2,1,2);
					player =1;
					status.setText("Player 1, Make Your Move !");
				}
			}
			else
			{
				status.setText("Invalid Move, Try Again Buddy !");
			}
		}
		if(e.getSource()==b[6])
		{
			if(b[6].getText().equals("-"))
			{
				if(player==1)
				{
					b[6].setText("X");
					add(player,1,2,0);
					player =2;
					status.setText("Player 2, Make Your Move !");
				}
				else
				{
					b[6].setText("O");
					add(player,2,2,0);
					player =1;
					status.setText("Player 1, Make Your Move !");
				}
			}
			else
			{
				status.setText("Invalid Move, Try Again Buddy !");
			}
		}
		if(e.getSource()==b[7])
		{
			if(b[7].getText().equals("-"))
			{
				if(player==1)
				{
					b[7].setText("X");
					add(player,1,2,1);
					player =2;
					status.setText("Player 2, Make Your Move !");
				}
				else
				{
					b[7].setText("O");
					add(player,2,2,1);
					player =1;
					status.setText("Player 1, Make Your Move !");
				}
			}
			else
			{
				status.setText("Invalid Move, Try Again Buddy !");
			}
		}
		if(e.getSource()==b[8])
		{
			if(b[8].getText().equals("-"))
			{
				if(player==1)
				{
					b[8].setText("X");
					add(player,1,2,2);
					player =2;
					status.setText("Player 2, Make Your Move !");
				}
				else
				{
					b[8].setText("O");
					add(player,2,2,2);
					player =1;
					status.setText("Player 1, Make Your Move !");
				}
			}
			else
			{
				status.setText("Invalid Move, Try Again Buddy !");
			}
		}
		if(e.getSource()==reset)
		{
			for(int i=0;i<9;i++)
				b[i].setText("-");
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
					gameMat[i][j]=0;
			player =1;
			status.setText("Reset Succesful, Player 1 make your move !");
		}
		chkWin(1);
		chkWin(2);
		//chkTie();
	}
}
public class TicTacToe {
	public static void main(String []asd)
	{
		new Design().gui();
	}
}
