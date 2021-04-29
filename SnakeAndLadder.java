package com.company;
public class SnakeAndLadder 
{
    public static void main(String[] args)
    {
        int position = 0;
        int diceroll = (int) Math.floor(((Math.random() * 10) % 6) + 1);
	int dicecheck = (int) Math.floor(((Math.random() * 10) % 3) + 1);

           while (position != 100)
        {
            if (dicecheck == 1)
            {
                position=position+diceroll;
            }
            else if (dicecheck==2)
            {
                position = position - diceroll;
            }
            else
            {
                position=position;
            }

	}
    }
}
