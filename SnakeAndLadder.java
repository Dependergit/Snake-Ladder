package com.company;
public class SnakeAndLadder
{
    public static void main(String[] args)
    {
        int position = 0;
        int dicecount = 0;
        int position2 = 0;

        while (position != 100 && position2 != 100)
        {
            int diceroll = (int) Math.floor(((Math.random() * 10) % 6) + 1);
           int dicecheck = (int) Math.floor(((Math.random() * 10) % 3) + 1);

           if (dicecheck == 1)
           {
               if (position+diceroll<=100)
               {
                   position=position+diceroll;
               }
           }
           else if (dicecheck==2)
           {
               position = position - diceroll;
           }
           else
           {
               position=position;
           }

           dicecount = dicecount +1;
           System.out.println(dicecount + " player1 number of position " + position);


            int diceroll2 = (int) Math.floor(((Math.random() * 10) % 6) + 1);
            int dicecheck2 = (int) Math.floor(((Math.random() * 10) % 3) + 1);

            if (dicecheck2 == 1)
            {
                if (position2 + diceroll2<=100)
                {
                    position2 =position2+diceroll2;
                }
            }
            else if (dicecheck2==2)
            {
                position2 = position2 - diceroll2;
            }
            else
            {
                position2=position2;
            }

            dicecount = dicecount +1;
            System.out.println(dicecount + " player2 number of position " + position2);
        }
        if (position==100)
        {
            dicecount=dicecount-1;
            System.out.println("Player 1 won in dicecount " + dicecount + " position " + position);
        }
        else
        {
            System.out.println("Player 2 won in dicecount " + dicecount+ " position " + position2);
        }

    }
}

