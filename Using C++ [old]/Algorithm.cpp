<<<<<<< HEAD
/*
	This CCP code is capable of solving complicated Rubik's cube states using an algorithim I developed. 
	This method of solving the cube is based on the Fridrich method.
	
	Author: Shubham Sharma
	Contact: shubham71098@gmail.com
*/

=======
>>>>>>> 39ea295e868b6be101f5de5ab3b6b1b9401a10a1
#include <iostream>
#include <cstdlib>
#include <ctime>
#include <stdlib.h>

using namespace std;

<<<<<<< HEAD

// This class defines the current state of the cube.
=======
>>>>>>> 39ea295e868b6be101f5de5ab3b6b1b9401a10a1
class def
{

    public:

        int W[3][3] = {{11,12,13},{14,15,16},{17,18,19}};
        int R[3][3] = {{21,22,23},{24,25,26},{27,28,29}};
        int O[3][3] = {{31,32,33},{34,35,36},{37,38,39}};
        int B[3][3] = {{41,42,43},{44,45,46},{47,48,49}};
        int G[3][3] = {{51,52,53},{54,55,56},{57,58,59}};
        int Y[3][3] = {{61,62,63},{64,65,66},{67,68,69}};


};

void moveU();
void moveUi();
void moveD();
void moveDi();
void moveF();
void moveFi();
void moveL();
void moveLi();
void moveR();
void moveRi();
void moveB();
void moveBi();

void reset();
void randomize();

void stage1();
int checkStage1();

void stage2();
int checkStage2();

void stage3();
int checkStage3();

void stage4();
int checkStage4();

void stage5();
int checkStage5();

void stage6();
int checkStage6();

void stage7();
int checkStage7();

void showStatus();
int checkeverything();



def lol;

int main()
{

int choice;
int stay =1;
int dummy;
do
{

/*
cout<<"\t 1. Move U"<<endl;
cout<<"\t 2. Move Ui"<<endl;
cout<<"\t 3. Move D"<<endl;
cout<<"\t 4. Move Di"<<endl;
cout<<"\t 5. Move F"<<endl;
cout<<"\t 6. Move Fi"<<endl;
cout<<"\t 7. Move L"<<endl;
cout<<"\t 8. Move Li"<<endl;
cout<<"\t 9. Move R"<<endl;
cout<<"\t10. Move Ri"<<endl;
cout<<"\t11. Move B"<<endl;
cout<<"\t12. Move Bi"<<endl;
*/
cout<<"\t1. Randomize the Rubik's Cube "<<endl;
cout<<"\t2. START TO SOLVE"<<endl;
cout<<"\t3. Reset the Rubik's Cube "<<endl;

// USR enters a choice

cout<<"\t Enter choice : ";
cin>>choice;

if ( choice == 13 )
{
    moveU();
    showStatus();
}
else if ( choice == 14 )
{
    moveUi();
    showStatus();
}
else if ( choice == 15 )
{
    moveD();
    showStatus();
}
else if ( choice == 4 )
{
    moveDi();
    showStatus();
}
else if ( choice == 5 )
{
    moveF();
    showStatus();
}
else if ( choice == 6 )
{
    moveFi();
    showStatus();
}
else if ( choice == 7 )
{
    moveL();
    showStatus();
}
else if ( choice == 8 )
{
    moveLi();
    showStatus();
}
else if ( choice == 9 )
{
    moveR();
    showStatus();
}
else if ( choice == 10 )
{
    moveRi();
    showStatus();
}
else if ( choice == 11 )
{
    moveB();
    showStatus();
}
else if ( choice == 12 )
{
    moveBi();
    showStatus();
}
else if ( choice == 1 )
{
    randomize();
    system("clear");
    showStatus();
    cout<<" \t\t Cube has been randomized ! "<<endl;
}
else if ( choice == 2)
{
    unsigned int start = clock();
    stage1();
    stage2();
    stage3();
    stage4();
    stage5();
    stage6();
    stage7();
    checkeverything();
    cout<<endl;
    cout<<"\t\t\t THE CUBE HAS BEEN SOLVED IN "<<(clock()-start)/10<<" MILLISECONDS"<<endl;
    showStatus();
    cout<<" Enter any number to continue : ";
    cin>>dummy;

    system("clear");

}
else if ( choice == 3 )
{
        reset();
        showStatus();
}
else
cout<<" Invialid input ! "<<endl;

} while ( stay == 1 );

return 0;
}


int checkeverything()
{
    int stay = 1;

    do {
    if ( lol.G[0][0] == 51 && lol.G[0][1] == 52 && lol.G[0][2] == 53 && lol.G[1][0] == 54 && lol.G[1][1] == 55 && lol.G[1][2] == 56 && lol.G[2][0] == 57 && lol.G[2][1] == 58 && lol.G[2][2] == 59 )
{
    if ( lol.O[0][0] == 31 && lol.O[0][1] == 32 && lol.O[0][2] == 33 && lol.O[1][0] == 34 && lol.O[1][1] == 35 && lol.O[1][2] == 36 && lol.O[2][0] == 37 && lol.O[2][1] == 38 && lol.O[2][2] == 39 )
{
    if ( lol.B[0][0] == 41 && lol.B[0][1] == 42 && lol.B[0][2] == 43 && lol.B[1][0] == 44 && lol.B[1][1] == 45 && lol.B[1][2] == 46 && lol.B[2][0] == 47 && lol.B[2][1] == 48 && lol.B[2][2] == 49 )
{
    if ( lol.R[0][0] == 21 && lol.R[0][1] == 22 && lol.R[0][2] == 23 && lol.R[1][0] == 24 && lol.R[1][1] == 25 && lol.R[1][2] == 26 && lol.R[2][0] == 27 && lol.R[2][1] == 28 && lol.R[2][2] == 29 )
{
    if ( lol.Y[0][0] == 61 && lol.Y[0][1] == 62 && lol.Y[0][2] == 63 && lol.Y[1][0] == 64 && lol.Y[1][1] == 65 && lol.Y[1][2] == 66 && lol.Y[2][0] == 67 && lol.Y[2][1] == 68 && lol.Y[2][2] == 69 )
{
    if ( lol.W[0][0] == 11 && lol.W[0][1] == 12 && lol.W[0][2] == 13 && lol.W[1][0] == 14 && lol.W[1][1] == 15 && lol.W[1][2] == 16 && lol.W[2][0] == 17 && lol.W[2][1] == 18 && lol.W[2][2] == 19 )
    {
        cout<<"\t\t Cube Approved ! "<<endl; return 0;
    }
}
}
}
}
}
        cout<<" CHECK: ";moveU();
        }while ( stay == 1 );
}


void stage7()
{
    int U = 0 ;
        cout<<"\t\t\t\t\t STAGE 7 : START "<<endl;
        while ( checkStage7() == 1)
        {
        cout<<" ST7: Moving U :";moveU();
        showStatus();
           if ( lol.G[0][1] != 52 && lol.O[0][1] != 32 && lol.B[0][1] != 42 && lol.R[0][1] != 22 && lol.G[0][0] == 51 && lol.O[0][0] == 31 && lol.B[0][0] == 41 && lol.R[0][0] == 21)

           {
                moveF();
                moveF();
                moveU();
                moveL();
                moveRi();
                moveF();
                moveF();
                moveLi();
                moveR();
                moveU();
                moveF();
                moveF();
                cout<<" ST7: 1NONE"<<endl;
                showStatus();
           }

            if  ( lol.B[0][0] == 41 && lol.B[0][1] == 42 )
            {
                if ( lol.G[0][1] == 32)
                {
                    moveF();
                    moveF();
                    moveUi();
                    moveL();
                    moveRi();
                    moveF();
                    moveF();
                    moveLi();
                    moveR();
                    moveUi();
                    moveF();
                    moveF();
                    cout<<" ST7: RBlue"<<endl;
                    showStatus();
                }

                if ( lol.G[0][1] == 22 )
                {
                    moveF();
                    moveF();
                    moveU();
                    moveL();
                    moveRi();
                    moveF();
                    moveF();
                    moveLi();
                    moveR();
                    moveU();
                    moveF();
                    moveF();
                    cout<<" ST7: LBlue"<<endl;
                    showStatus();
                }
            }

            if ( lol.B[0][0] == 31 && lol.B[0][1] == 32 )
            {
                if ( lol.G[0][1] == 52 )
                {
                    moveF();
                    moveF();
                    moveUi();
                    moveL();
                    moveRi();
                    moveF();
                    moveF();
                    moveLi();
                    moveR();
                    moveUi();
                    moveF();
                    moveF();
                    cout<<" ST7: ROrange"<<endl;
                    showStatus();
                }

                if ( lol.G[0][1] == 42 )
                {
                    moveF();
                    moveF();
                    moveU();
                    moveL();
                    moveRi();
                    moveF();
                    moveF();
                    moveLi();
                    moveR();
                    moveU();
                    moveF();
                    moveF();
                    cout<<" ST7: LOrange"<<endl;
                    showStatus();
                }
            }

            if ( lol.B[0][1] == 52 && lol.B[0][0] == 51 )
            {

                if ( lol.G[0][1] == 32 )
                {
                    moveF();
                    moveF();
                    moveU();
                    moveL();
                    moveRi();
                    moveF();
                    moveF();
                    moveLi();
                    moveR();
                    moveU();
                    moveF();
                    moveF();
                    cout<<" ST7: LGreen"<<endl;
                    showStatus();
                }

                if ( lol.G[0][1] == 22 )
                {
                    moveF();
                    moveF();
                    moveUi();
                    moveL();
                    moveRi();
                    moveF();
                    moveF();
                    moveLi();
                    moveR();
                    moveUi();
                    moveF();
                    moveF();
                    cout<<" ST7: RGreen"<<endl;
                    showStatus();
                }
            }

            if ( lol.B[0][0] == 21 && lol.B[0][1] == 22)
            {
                if ( lol.G[0][1] == 52 )
                {
                    moveF();
                    moveF();
                    moveU();
                    moveL();
                    moveRi();
                    moveF();
                    moveF();
                    moveLi();
                    moveR();
                    moveU();
                    moveF();
                    moveF();
                    cout<<" ST7: LRed"<<endl;
                    showStatus();
                }
                if ( lol.G[0][1] == 42 )
                {
                    moveF();
                    moveF();
                    moveUi();
                    moveL();
                    moveRi();
                    moveF();
                    moveF();
                    moveLi();
                    moveR();
                    moveUi();
                    moveF();
                    moveF();
                    cout<<" ST7: RRed"<<endl;
                    showStatus();
                }
            }
        }
}

int checkStage7()
{
    if ( lol.G[0][1] == 52 && lol.O[0][1] == 32 && lol.B[0][1] == 42 && lol.R[0][1] == 22 && lol.G[0][0] == 51 && lol.O[0][0] == 31 && lol.B[0][0] == 41 && lol.R[0][0] == 21 )
     {
        cout<<"\t\t\t\t\t STAGE 7 TOP EDGES : DONE "<<endl;
        return 0;
    }

    else
    {
        return 1;
    }



}


void stage6()
{

        cout<<"\t\t\t\t\t STAGE 6 : START "<<endl;
        while ( checkStage6() == 1)
        {
            if ( lol.R[0][2] > 20 && lol.R[0][2] < 30  && lol.O[0][0] > 20 && lol.O[0][0] < 30 )
            {
                moveRi();
                moveF();
                moveRi();
                moveB();
                moveB();
                moveR();
                moveFi();
                moveRi();
                moveB();
                moveB();
                moveR();
                moveR();
                cout<<" ST6: 1R"<<endl;
                showStatus();
            }

            if ( lol.R[0][2] > 30 && lol.R[0][2] < 40  && lol.O[0][0] > 30 && lol.O[0][0] < 40 )
            {
                moveRi();
                moveF();
                moveRi();
                moveB();
                moveB();
                moveR();
                moveFi();
                moveRi();
                moveB();
                moveB();
                moveR();
                moveR();
                cout<<" ST6: 10"<<endl;
                showStatus();
            }

            if ( lol.R[0][2] > 40 && lol.R[0][2] < 50  && lol.O[0][0] > 40 && lol.O[0][0] < 50 )
            {
                moveRi();
                moveF();
                moveRi();
                moveB();
                moveB();
                moveR();
                moveFi();
                moveRi();
                moveB();
                moveB();
                moveR();
                moveR();
                cout<<" ST6: 1B"<<endl;
                showStatus();
            }

            if ( lol.R[0][2] > 50 && lol.R[0][2] < 60  && lol.O[0][0] > 50 && lol.O[0][0] < 60 )
            {
                moveRi();
                moveF();
                moveRi();
                moveB();
                moveB();
                moveR();
                moveFi();
                moveRi();
                moveB();
                moveB();
                moveR();
                moveR();
                cout<<" ST6: 1G"<<endl;
                showStatus();
            }

        cout<<" ST6: Moving U:";moveU();
        showStatus();


        }



}

int checkStage6()
{

      if( lol.G[0][0] == 51 && lol.G[0][2] == 53 && lol.R[0][0] == 21 && lol.R[0][2] == 23 && lol.B[0][0] == 41 && lol.B[0][2] == 43  && lol.O[0][0] == 31 && lol.O[0][2] == 33  )
    {
        cout<<"\t\t\t\t\t STAGE 6 TOP CORNERS : DONE "<<endl;
        return 0;
    }

    else
    {
        return 1;
    }

}

void stage5()
{
        cout<<"\t\t\t\t\t STAGE 5 : START "<<endl;
        while ( checkStage5() == 1)
            {
                if ( lol.Y[0][0] > 60 && lol.Y[2][2] > 60 && lol.Y[0][2] < 60 && lol.Y[2][0] < 60 )
                {
                    moveR();
                    moveU();
                    moveRi();
                    moveU();
                    moveR();
                    moveU();
                    moveU();
                    moveRi();
                    cout<<" ST5: Opposite"<<endl;
                    showStatus();
                }

               if ( lol.Y[0][0] < 60 && lol.Y[2][2] < 60 && lol.Y[0][2] < 60 && lol.Y[2][0] > 60 )
               {
                    moveR();
                    moveU();
                    moveRi();
                    moveU();
                    moveR();
                    moveU();
                    moveU();
                    moveRi();
                    cout<<" ST5: FAV"<<endl;
                    showStatus();
               }

              if ( lol.Y[0][0] < 60 && lol.Y[2][2] > 60 && lol.Y[0][2] > 60 && lol.Y[2][0] < 60 )
              {
                    moveR();
                    moveU();
                    moveRi();
                    moveU();
                    moveR();
                    moveU();
                    moveU();
                    moveRi();
                    cout<<" ST5: SpaceShip"<<endl;
                    showStatus();
              }

              if ( lol.Y[0][0] < 60 && lol.Y[2][2] < 60 && lol.Y[0][2] < 60 && lol.Y[2][0] < 60 && lol.G[0][2] < 60 )
              {
                    moveR();
                    moveU();
                    moveRi();
                    moveU();
                    moveR();
                    moveU();
                    moveU();
                    moveRi();
                    cout<<" ST5: Simple"<<endl;
                    showStatus();
              }

                    cout<<"ST5: Moving ";moveU();
            }
}

int checkStage5()
{

      if( lol.Y[0][0] > 60 && lol.Y[0][1] > 60 && lol.Y[2][0] > 60 && lol.Y[2][2] > 60 )
    {
        cout<<"\t\t\t\t\t STAGE 5 YELLOW LAYER : DONE "<<endl;
        return 0;
    }

    else
    {
        return 1;
    }

}
void stage4()
{
     cout<<"\t\t\t\t\t STAGE 4 : START "<<endl;
        while ( checkStage4() == 1)
            {
                if( (lol.Y[1][0] > 60  && lol.Y[0][1] > 60) || ( lol.Y[1][0] > 60 && lol.Y[1][2] > 60 ) || ( lol.Y[0][1] < 60 && lol.Y[1][0] < 60 && lol.Y[2][1] < 60 && lol.Y[1][2] < 60 ) )
                {
                    moveF();
                    moveU();
                    moveR();
                    moveUi();
                    moveRi();
                    moveFi();
                    moveU();
                    cout<<" ST4: 01"<<endl;
                    showStatus();
}


                cout<<" ST4: Moving : ";
                moveU();
                showStatus();
            }
}

int checkStage4()
{
    if( lol.Y[0][1] > 60 && lol.Y[1][0] > 60 && lol.Y[2][1] > 60 && lol.Y[1][2] > 60 )
    {
        cout<<"\t\t\t\t\t STAGE 4 YELLOW CROSS : DONE "<<endl;
        return 0;
    }

    else
    {
        return 1;
    }
}

void stage3()
{
    cout<<"\t\t\t\t\t STAGE 3 : START "<<endl;
    while ( checkStage3() == 1)
    {

        if ( ( lol.Y[2][1] > 60 || lol.G[0][1] > 60 ) && ( lol.Y[1][0] > 60 || lol.R[0][1] > 60 ) && ( lol.Y[0][1] > 60 || lol.B[0][1] > 60 ) && ( lol.Y[1][2] > 60 || lol.O[0][1] > 60 ) )
        {
            if ( lol.G[1][0] != 54 )
            {
                moveUi();
                moveLi();
                moveU();
                moveL();
                moveU();
                moveF();
                moveUi();
                moveFi();
                cout<<" ST3: 0G"<<endl;
            }

            if ( lol.R[1][0] != 24 )
            {
                moveBi();
                moveU();
                moveB();
                moveU();
                moveL();
                moveUi();
                moveLi();
                cout<<" ST3: 0R"<<endl;
            }

            if ( lol.B[1][0] != 44 )
            {
                moveU();
                moveRi();
                moveU();
                moveR();
                moveU();
                moveB();
                moveUi();
                moveBi();
                cout<<" ST3: 0B"<<endl;
            }

            if ( lol.O[1][0] != 34 )
            {
                moveUi();
                moveUi();
                moveFi();
                moveU();
                moveF();
                moveU();
                moveR();
                moveUi();
                moveRi();
                cout<<" ST3: 0O"<<endl;
            }
        }

        if ( lol.G[0][1] == 34 && lol.Y[2][1] == 56 )
        {
            moveU();
            moveU();
            moveFi();
            moveU();
            moveF();
            moveU();

            moveR();
            moveUi();
            moveRi();
            cout<<" ST3: 1OG"<<endl;
            showStatus();
        }

         if ( lol.G[0][1] == 56 && lol.Y[2][1] == 34 )
         {
            moveU();
            moveR();
            moveUi();
            moveRi();
            moveUi();
            moveFi();
            moveU();
            moveF();
            cout<<" ST3: 1GO"<<endl;
            showStatus();
         }

         if ( lol.G[0][1] == 26 && lol.Y[2][1] == 54)
         {
            moveU();
            moveU();
            moveF();
            moveUi();
            moveFi();
            moveUi();
            moveLi();
            moveU();
            moveL();
            cout<<" ST3: 1RG"<<endl;
            showStatus();
         }

         if ( lol.G[0][1] == 54 && lol.Y[2][1] == 26 )
         {
            moveUi();
            moveLi();
            moveU();
            moveL();
            moveU();
            moveF();
            moveUi();
            moveFi();
            cout<<" ST3: 1GR"<<endl;
            showStatus();
         }

         if ( lol.G[0][1] == 46 && lol.Y[2][1] == 24 )
         {
            moveUi();
            moveL();
            moveUi();
            moveLi();
            moveUi();
            moveBi();
            moveU();
            moveB();
            cout<<" ST3: 1BR"<<endl;
            showStatus();
         }

         if ( lol.G[0][1] == 24 && lol.Y[2][1] == 46 )
         {
            moveBi();
            moveU();
            moveB();
            moveU();
            moveL();
            moveUi();
            moveLi();
            cout<<" ST3: 1RB"<<endl;
            showStatus();
         }

         if ( lol.G[0][1] == 36 && lol.Y[2][1] == 44 )
         {
            moveB();
            moveUi();
            moveBi();
            moveUi();
            moveRi();
            moveU();
            moveR();
            cout<<" ST3: 1OB"<<endl;
            showStatus();
         }

         if ( lol.G[0][1] ==  44 && lol.Y[2][1] == 36 )
         {
            moveU();
            moveRi();
            moveU();
            moveR();
            moveU();
            moveB();
            moveUi();
            moveBi();
            cout<<" ST3: 1BO"<<endl;
            showStatus();
         }

            cout<<"ST3: Moving U: "; moveU();
            showStatus();

    }


}

int checkStage3()
{
    if ( lol.W[0][1] == 12 && lol.W[1][0] == 14 && lol.W[2][1] == 18 && lol.W[1][2] == 16 && lol.G[2][1] == 58 && lol.R[2][1] == 28 && lol.B[2][1] == 48 && lol.O[2][1] == 38 && lol.W[0][0] == 11 && lol.W[0][2] == 13 && lol.W[2][0] == 17 && lol.W[2][2] == 19 && lol.G[2][2] == 59 && lol.R[2][2] == 29 && lol.B[2][2] == 49 && lol.O[2][2] == 39 && lol.G[2][0] == 57 && lol.R[2][0] == 27 && lol.B[2][0] == 47 && lol.O[2][0] == 37 && lol.G[1][0] == 54 && lol.G[1][2] == 56 && lol.R[1][0] == 24 && lol.R[1][2] == 26 && lol.B[1][0] == 44 && lol.B[1][2] == 46 && lol.O[1][0] == 34 && lol.O[1][2] == 36 )
    {          cout<<"\t\t\t\t\t STAGE 3 WHITE TEA EDGES: DONE "<<endl;
                return 0;
        }
    else
    return 1;
}

void stage2()
{
    cout<<"\t\t\t\t\t STAGE 2 : START "<<endl;
    while ( checkStage2() == 1 )
    {

        if ( lol.W[0][0] < 20 && lol.W[0][2] < 20 && lol.W[2][0] < 20 && lol.W[2][2] < 20 )
        {
            if ( lol.O[2][2] != 39 )
            {
                moveF();
                moveU();
                moveFi();
                cout<<" MOVED 0O"<<endl;
                showStatus();
            }
            if ( lol.G[2][2] != 59)
            {
                moveR();
                moveU();
                moveRi();
                cout<<" MOVED 0R"<<endl;
                showStatus();
            }
            if ( lol.R[2][2] != 29 )
            {
                moveF();
                moveU();
                moveFi();
                cout<<" MOVED 0R"<<endl;
                showStatus();
            }
            if ( lol.B[2][2] != 49 )
            {
                moveL();
                moveU();
                moveLi();
                cout<<" MOVED 0B"<<endl;
                showStatus();
            }
        }

        if ( lol.G[0][2] < 20 )
        { cout<<" PASS 1"<<endl;
            if ( lol.Y[2][2] == 29 && lol.O[0][0] == 57 )
            {
                moveU();
                moveLi();
                moveUi();
                moveL();
                cout<<" MOVED 1RG"<<endl;
                showStatus();

            }
            if ( lol.Y[2][2] == 59 && lol.O[0][0] == 37 )
            {
                moveU();
                moveR();
                moveUi();
                moveRi();
                cout<<" MOVED 1GO"<<endl;
                showStatus();
            }
            if ( lol.Y[2][2] == 39 && lol.O[0][0] == 47 )
            {
                moveB();
                moveUi();
                moveBi();
                cout<<" MOVED 1OB"<<endl;
                showStatus();
            }
            if ( lol.Y[2][2] == 49 && lol.O[0][0] == 27 )
            {
                moveU();
                moveU();
                moveBi();
                moveUi();
                moveB();
                cout<<" MOVED 1BR"<<endl;
                showStatus();
            }
        }

        if ( lol.G[0][0] < 20 )
        {
                if ( lol.Y[2][0] == 57 && lol.R[0][2] == 29 )
                {
                    moveF();
                    moveU();
                    moveFi();
                    cout<<" MOVED 2GR"<<endl;
                    showStatus();
                }
                if ( lol.Y[2][0] == 37 && lol.R[0][2] == 59 )
                {
                    moveUi();
                    moveR();
                    moveU();
                    moveRi();
                    cout<<" MOVED 2OG"<<endl;
                    showStatus();

                }
                if ( lol.Y[2][0] == 47 && lol.R[0][2] == 39 )
                {
                    moveU();
                    moveRi();
                    moveU();
                    moveR();
                    cout<<" MOVED 2BO"<<endl;
                    showStatus();
                }
                if ( lol.Y[2][0] == 27 && lol.R[0][2] == 49 )
                {
                    moveU();
                    moveL();
                    moveU();
                    moveLi();
                    cout<<" MOVED 2RB"<<endl;
                    showStatus();
                }
        }

        if ( lol.Y[2][2] < 20 )
        {
            if ( lol.G[0][2] == 37 && lol.O[0][0] == 59 )
            {
                moveR();
                moveU();
                moveU();
                moveRi();
                moveUi();
                moveR();
                moveU();
                moveRi();
                cout<<" MOVED 30G"<<endl;
                showStatus();
            }
            if ( lol.G[0][2] == 57 && lol.O[0][0] == 29 )
            {
                moveR();
                moveU();
                moveU();
                moveRi();
                moveF();
                moveU();
                moveFi();
                cout<<" MOVED 3GR"<<endl;
                showStatus();
            }
            if ( lol.G[0][2] == 47 && lol.O[0][0] == 39 )
            {
                moveR();
                moveU();
                moveU();
                moveRi();
                moveU();
                moveU();
                moveB();
                moveU();
                moveBi();
                cout<<" MOVED 3BO"<<endl;
                showStatus();
            }
            if ( lol.G[0][2] == 27 && lol.O[0][0] == 49 )
            {
                moveR();
                moveU();
                moveU();
                moveRi();
                moveBi();
                moveU();
                moveB();
                cout<<" MOVED 3RB"<<endl;
                showStatus();
            }
        }

            if ( lol.G[2][2] < 20 )
            {
                moveR();
                moveU();
                moveRi();
                cout<<" MOVED 4G(R)"<<endl;
                showStatus();
            }
            if ( lol.G[2][0] < 20 )
            {
                moveLi();
                moveU();
                moveU();
                moveL();
                cout<<" MOVED 4G(L)"<<endl;
                showStatus();
            }
            if ( lol.R[2][2] < 20 )
            {
                moveF();
                moveU();
                moveFi();
                cout<<" MOVED 4R(R)"<<endl;
                showStatus();
            }
            if ( lol.R[2][0] < 20 )
            {
                moveBi();
                moveU();
                moveU();
                moveB();
                cout<<" MOVED 4R(L)"<<endl;
                showStatus();
            }
            if ( lol.B[2][2] < 20 )
            {
                moveL();
                moveU();
                moveLi();
                cout<<" MOVED 4B(R)"<<endl;
                showStatus();
            }
            if ( lol.B[2][0] < 20 )
            {
                moveRi();
                moveU();
                moveU();
                moveR();
                cout<<" MOVED 4B(L)"<<endl;
                showStatus();
            }
            if ( lol.O[2][2] < 20 )
            {
                moveB();
                moveU();
                moveBi();
                cout<<" MOVED 4O(R)"<<endl;
                showStatus();
            }
            if ( lol.O[2][0] < 20 )
            {
                moveR();
                moveU();
                moveRi();
                cout<<" MOVED 4O(L)"<<endl;
                showStatus();
            }


        cout<<"ST2: Moving : ";
        moveU();
        showStatus();

    }
}

int checkStage2()
{
    if ( lol.W[0][1] == 12 && lol.W[1][0] == 14 && lol.W[2][1] == 18 && lol.W[1][2] == 16 && lol.G[2][1] == 58 && lol.R[2][1] == 28 && lol.B[2][1] == 48 && lol.O[2][1] == 38 && lol.W[0][0] == 11 && lol.W[0][2] == 13 && lol.W[2][0] == 17 && lol.W[2][2] == 19 && lol.G[2][2] == 59 && lol.R[2][2] == 29 && lol.B[2][2] == 49 && lol.O[2][2] == 39 && lol.G[2][0] == 57 && lol.R[2][0] == 27 && lol.B[2][0] == 47 && lol.O[2][0] == 37 )
      {          cout<<"\t\t\t\t\t STAGE 2 WHITE TEA: DONE "<<endl;
                return 0;
        }
    else
    return 1;
}


void stage1()
{
    int stay = 0;
    cout<<"\t\t\t\t\t STAGE 1 : START "<<endl;
    while ( checkStage1() == 1)
    {

            // Check if white has DUPLICATES
        if ( lol.W[0][1] < 20 && lol.W[1][0] < 20 && lol.W[2][1] < 20 && lol.W[1][2] < 20 )
        {
                if ( lol.G[2][1] != 58 )
                {
                    moveF();
                    moveF();
                    cout<<" MOVED 0G"<<endl;
                    showStatus();
                }
                if ( lol.R[2][1] != 28 )
                {
                    moveL();
                    moveL();
                    cout<<" MOVED 0R"<<endl;
                    showStatus();
                }
                if ( lol.B[2][1] != 48 )
                {
                    moveB();
                    moveB();
                    cout<<" MOVED 0B"<<endl;
                    showStatus();
                }
                if ( lol.O[2][1] != 38 )
                {
                    moveR();
                    moveR();
                    cout<<" MOVED 0O"<<endl;
                    showStatus();
                }
        }

        // On Yellow Side for FF
        if ( lol.Y[0][1] > 10 && lol.Y[0][1] < 20 )
        {
            if ( lol.B[0][1] == 28 && lol.Y[0][1] == 14) // Check for Red Edge
            {
                moveUi();
                moveL();
                moveL();
                cout<<" MOVED 1R"<<endl;
                showStatus();

            }
            if ( lol.B[0][1] == 38 && lol.Y[0][1] == 16 ) // Check for Orange Edge
            {
                moveU();
                moveR();
                moveR();
                cout<<" MOVED 1O"<<endl;
                showStatus();
            }
            if ( lol.B[0][1] == 48 && lol.Y[0][1] == 18 ) // Check for Blue Edge
            {
                moveB();
                moveB();
                cout<<" MOVED 1B"<<endl;
                showStatus();

            }
            if ( lol.B[0][1] == 58 && lol.Y[0][1] == 12 ) // Check for Green Edge
            {
                moveU();
                moveU();
                moveF();
                moveF();
                cout<<" MOVED 1G"<<endl;
                showStatus();

            }

        }
        // Check for white on Green top
        if ( lol.G[0][1] > 10 && lol.G[0][1] < 20 )
        {
            if ( lol.Y[2][1] == 28 && lol.G[0][1] == 14 )    // Check for Red Edge
            {
                moveU();
                moveL();
                moveD();
                moveFi();
                moveDi();
                cout<<" MOVED 5R"<<endl;
                showStatus();
            }

            if ( lol.Y[2][1] == 38 && lol.G[0][1] == 16)    // Check for Orange Edge
            {
                moveUi();
                moveRi();
                moveDi();
                moveF();
                moveD();
                cout<<" MOVED 5O"<<endl;
                showStatus();
            }

            if ( lol.Y[2][1] == 48 && lol.G[0][1] == 18)    // Check for Blue Edge
            {
                moveUi();
                moveR();
                moveBi();
                moveRi();
                cout<<" MOVED 5B"<<endl;
                showStatus();
            }

            if ( lol.Y[2][1] == 58 && lol.G[0][1] == 12 )    // Check for Green Edge
            {
                moveF();
                moveD();
                moveRi();
                moveDi();
                cout<<" MOVED 5G"<<endl;
                showStatus();
            }

        }
        if ( lol.G[1][2] > 10 && lol.G[1][2] <20 )
        {
            moveR();
            moveU();
            moveRi();
            cout<<" MOVED 6G"<<endl;
            showStatus();
        }
        if ( lol.O[1][2] > 10 && lol.O[1][2] <20 )
        {
            moveB();
            moveU();
            moveBi();
            cout<<" MOVED 6O"<<endl;
            showStatus();
        }
        if ( lol.B[1][2] > 10 && lol.B[1][2] < 20)
        {
            moveL();
            moveU();
            moveLi();
            cout<<" MOVED 6B"<<endl;
            showStatus();
        }
        if ( lol.R[1][2] > 10 && lol.R[1][2] < 20 )
        {
            moveF();
            moveU();
            moveFi();
            cout<<" MOVED 6R"<<endl;
            showStatus();
        }

        if ( lol.G[1][0] > 10 && lol.G[1][0] < 20 )
        {
            moveLi();
            moveU();
            moveL();
            cout<<" MOVED 7G"<<endl;
            showStatus();
        }
        if ( lol.O[1][0] > 10 && lol.O[1][0] <20 )
        {
            moveFi();
            moveU();
            moveF();
            cout<<" MOVED 7O"<<endl;
            showStatus();
        }
        if ( lol.B[1][0] > 10 && lol.B[1][0] < 20 )
        {
            moveRi();
            moveU();
            moveR();
            cout<<" MOVED 7B"<<endl;
            showStatus();
        }
        if ( lol.R[1][0] > 10 && lol.R[1][0] < 20 )
        {
            moveBi();
            moveU();
            moveB();
            cout<<" MOVED 7R"<<endl;
            showStatus();
        }
        if ( lol.G[2][1] <20 )
        {
            moveF();
            moveF();
            cout<<" MOVED 8G"<<endl;
            showStatus();
        }
        if ( lol.O[2][1] < 20 )
        {
            moveR();
            moveR();
            showStatus();
        }
        if ( lol.B[2][1] < 20 )
        {
            moveB();
            moveB();
            showStatus();
        }
        if ( lol.R[2][1] < 20 )
        {
            moveL();
            moveL();
            showStatus();
        }
        if ( stay < 25 )
        {cout<<" ST1: Moving :";moveU();
        showStatus();}
    }

}

int checkStage1()
{
    if( lol.W[0][1] == 12 && lol.W[1][0] == 14 && lol.W[2][1] == 18 && lol.W[1][2] == 16 && lol.G[2][1] == 58 && lol.R[2][1] == 28 && lol.B[2][1] == 48 && lol.O[2][1] == 38)
    {
        cout<<"\t\t\t\t\t STAGE 1 WHITE CROSS : DONE "<<endl;
        return 0;
    }

    else
    {
        return 1;
    }
}

void randomize()
{

        int a;
            srand(time(NULL));
        for ( int i=0 ; i<1000; i++)
        {
            cout<<" Movement No. : "<<i+1<<endl;

            a = rand() % 12 + 1;
            cout<<"\t\t A = "<<a<<endl;

            cout<<endl;
        if ( a == 1 )
             moveU();
        else if ( a == 2 )
             moveUi();
        else if ( a == 3 )
             moveD();
        else if ( a == 4 )
             moveDi();
        else if ( a == 5 )
             moveF();
        else if ( a == 6 )
             moveFi();
        else if ( a == 7 )
             moveL();
        else if ( a == 8 )
             moveLi();
        else if ( a == 9 )
             moveR();
        else if ( a == 10 )
             moveRi();
        else if ( a == 11 )
             moveB();
        else if ( a == 12 )
             moveBi();
        else
        {
        cout<<" INVALID RAND()"<<endl;
        break;
        }
         showStatus();
        }
        cout<<" The cube has been Randomized ! "<<endl;
}

void showStatus()
{
    cout<<"White Side : "<<endl;
    for ( int i=0 ; i<3 ; i++)
    {
        for ( int j=0 ; j<3 ; j++)
        cout<<"\t["<<lol.W[i][j]<<"]"<<" ";
        cout<<endl;
    }


    cout<<"Red Side : "<<endl;

    for ( int i=0 ; i<3 ; i++)
    {
        for ( int j=0 ; j<3 ; j++)
        cout<<"\t["<<lol.R[i][j]<<"]"<<" ";
        cout<<endl;
    }

    cout<<"Orange Side : "<<endl;

    for ( int i=0 ; i<3 ; i++)
    {
        for ( int j=0 ; j<3 ; j++)
        cout<<"\t["<<lol.O[i][j]<<"]"<<" ";
        cout<<endl;
    }

    cout<<"Blue Side : "<<endl;

    for ( int i=0 ; i<3 ; i++)
    {
        for ( int j=0 ; j<3 ; j++)
        cout<<"\t["<<lol.B[i][j]<<"]"<<" ";
        cout<<endl;
    }

    cout<<"Green Side : "<<endl;

    for ( int i=0 ; i<3 ; i++)
    {
        for ( int j=0 ; j<3 ; j++)
        cout<<"\t["<<lol.G[i][j]<<"]"<<" ";
        cout<<endl;
    }

    cout<<"Yellow Side : "<<endl;

    for ( int i=0 ; i<3 ; i++)
    {
        for ( int j=0 ; j<3 ; j++)
        cout<<"\t["<<lol.Y[i][j]<<"]"<<" ";
        cout<<endl;
    }


    cout<<"----xxxx----xxxx----xxxx----xxxx----xxxx----xxxx----xxxx----xxxx\n"<<endl;



}

void moveU()
{

    int temp1, temp2 ;

    // For [0][2] Cell of G,R,B & O
    temp1 =  lol.G[0][2] ;
    lol.G[0][2] = lol.O[0][2] ;
    temp2 = lol.R[0][2];
    lol.R[0][2] = temp1;    // Temp1 is discarded
    temp1 = lol.B[0][2];
    lol.B[0][2] = temp2;    // Temp2 is discarded
    lol.O[0][2] = temp1;    // Temp1 is discarded

    // For [0][1] Cell of G,R,B & O
    temp1 =  lol.G[0][1] ;
    lol.G[0][1] = lol.O[0][1] ;
    temp2 = lol.R[0][1];
    lol.R[0][1] = temp1;    // Temp1 is discarded
    temp1 = lol.B[0][1];
    lol.B[0][1] = temp2;    // Temp2 is discarded
    lol.O[0][1] = temp1;    // Temp1 is discarded

    // For [0][0] Cell of G,R,B & O
    temp1 =  lol.G[0][0] ;
    lol.G[0][0] = lol.O[0][0] ;
    temp2 = lol.R[0][0];
    lol.R[0][0] = temp1;    // Temp1 is discarded
    temp1 = lol.B[0][0];
    lol.B[0][0] = temp2;    // Temp2 is discarded
    lol.O[0][0] = temp1;    // Temp1 is discarded

    // For rotating Y corners Clockwise
    temp1 = lol.Y[0][0];
    lol.Y[0][0] = lol.Y[2][0];
    temp2 = lol.Y[0][2];
    lol.Y[0][2] = temp1;    // Temp1 is discarded
    temp1 = lol.Y[2][2];
    lol.Y[2][2] = temp2;    // Temp2 is discarded
    lol.Y[2][0] = temp1;     // Temp1 is discarded


    // For rotating Y edges Clockwise
    temp1 = lol.Y[1][0];
    lol.Y[1][0] = lol.Y[2][1];
    temp2 = lol.Y[0][1];
    lol.Y[0][1] = temp1;    // Temp1 is discarded
    temp1 = lol.Y[1][2];
    lol.Y[1][2] = temp2;    // Temp2 is discarded
    lol.Y[2][1] = temp1;     // Temp1 is discarded

    cout<<" moveU();"<<endl;


}

void moveUi()  // moveUi() == ( 3 X moveU() )
{
 moveU();
 moveU();
 moveU();
 cout<<" moveUi();"<<endl;
}

void moveD()
{
    moveDi();
    moveDi();
    moveDi();
    cout<<" moveD();"<<endl;
}
void moveDi()
{

     int temp1, temp2 ;

    // For [2][2] Cell of G,R,B & O
    temp1 =  lol.G[2][2] ;
    lol.G[2][2] = lol.O[2][2] ;
    temp2 = lol.R[2][2];
    lol.R[2][2] = temp1;    // Temp1 is discarded
    temp1 = lol.B[2][2];
    lol.B[2][2] = temp2;    // Temp2 is discarded
    lol.O[2][2] = temp1;    // Temp1 is discarded

    // For [2][1] Cell of G,R,B & O
    temp1 =  lol.G[2][1] ;
    lol.G[2][1] = lol.O[2][1] ;
    temp2 = lol.R[2][1];
    lol.R[2][1] = temp1;    // Temp1 is discarded
    temp1 = lol.B[2][1];
    lol.B[2][1] = temp2;    // Temp2 is discarded
    lol.O[2][1] = temp1;    // Temp1 is discarded

    // For [2][0] Cell of G,R,B & O
    temp1 =  lol.G[2][0] ;
    lol.G[2][0] = lol.O[2][0] ;
    temp2 = lol.R[2][0];
    lol.R[2][0] = temp1;    // Temp1 is discarded
    temp1 = lol.B[2][0];
    lol.B[2][0] = temp2;    // Temp2 is discarded
    lol.O[2][0] = temp1;    // Temp1 is discarded

    // For rotating W corners Clockwise
    temp1 = lol.W[2][0];
    lol.W[2][0] = lol.W[0][0];
    temp2 = lol.W[2][2];
    lol.W[2][2] = temp1;    // Temp1 is discarded
    temp1 = lol.W[0][2];
    lol.W[0][2] = temp2;    // Temp2 is discarded
    lol.W[0][0] = temp1;     // Temp1 is discarded

    // For rotating W edges Clockwise
    temp1 = lol.W[2][1];
    lol.W[2][1] = lol.W[1][0];
    temp2 = lol.W[1][2];
    lol.W[1][2] = temp1;    // Temp1 is discarded
    temp1 = lol.W[0][1];
    lol.W[0][1] = temp2;    // Temp2 is discarded
    lol.W[1][0] = temp1;     // Temp1 is discarded
    cout<<" moveDi();"<<endl;
}

void moveF()
{

    int temp[6];

    // For moving cells onto Yellow Face and others respectively
    temp[0] = lol.Y[2][0];
    temp[1] = lol.Y[2][1];
    temp[2] = lol.Y[2][2];
    lol.Y[2][0] = lol.R[2][2];
    lol.Y[2][1] = lol.R[1][2];
    lol.Y[2][2] = lol.R[0][2];
    temp[3] = lol.W[0][0];
    temp[4] = lol.W[0][1];
    temp[5] = lol.W[0][2];
    lol.W[0][0] = lol.O[2][0];
    lol.W[0][1] = lol.O[1][0];
    lol.W[0][2] = lol.O[0][0];
    lol.O[0][0] = temp[0];    // Temp[0] is discarded
    lol.O[1][0] = temp[1];    // Temp[1] is discarded
    lol.O[2][0] = temp[2];    // Temp[2] is discarded
    lol.R[0][2] = temp[3];    // Temp[3] is discarded
    lol.R[1][2] = temp[4];    // Temp[4] is discarded
    lol.R[2][2] = temp[5];    // Temp[5] is discarded

    // For rotating G corners Clockwise
    temp[0] = lol.G[0][0];
    lol.G[0][0] = lol.G[2][0];
    temp[1] = lol.G[0][2];
    lol.G[0][2] = temp[0];    // Temp[0] is discarded
    temp[0] = lol.G[2][2];
    lol.G[2][2] = temp[1];    // Temp2 is discarded
    lol.G[2][0] = temp[0];    // Temp1 is discarded


    // For rotating G edges Clockwise
    temp[0] = lol.G[1][0];
    lol.G[1][0] = lol.G[2][1];
    temp[1] = lol.G[0][1];
    lol.G[0][1] = temp[0];    // Temp1 is discarded
    temp[0] = lol.G[1][2];
    lol.G[1][2] = temp[1];    // Temp2 is discarded
    lol.G[2][1] = temp[0];    // Temp1 is discarded


    cout<<" moveF();"<<endl;
}

void moveFi()
{

    moveF();
    moveF();
    moveF();
    cout<<" moveFi();"<<endl;

}


void moveL()
{

    int temp[6];

    // For moving cells onto Green Face and others respectively
    temp[0] = lol.G[0][0];
    temp[1] = lol.G[1][0];
    temp[2] = lol.G[2][0];
    lol.G[0][0] = lol.Y[0][0];
    lol.G[1][0] = lol.Y[1][0];
    lol.G[2][0] = lol.Y[2][0];
    temp[3] = lol.B[0][2];
    temp[4] = lol.B[1][2];
    temp[5] = lol.B[2][2];
    lol.B[0][2] = lol.W[2][0];
    lol.B[1][2] = lol.W[1][0];
    lol.B[2][2] = lol.W[0][0];
    lol.W[0][0] = temp[0];  // Temp[0] is discarded
    lol.W[1][0] = temp[1];  // Temp[1] is discarded
    lol.W[2][0] = temp[2];  // Temp[2] is discarded
    lol.Y[0][0] = temp[5];  // Temp[5] is discarded
    lol.Y[1][0] = temp[4];  // Temp[4] is discarded
    lol.Y[2][0] = temp[3];  // Temp[3] is discarded

     // For rotating R corners Clockwise
    temp[0] = lol.R[0][0];
    lol.R[0][0] = lol.R[2][0];
    temp[1] = lol.R[0][2];
    lol.R[0][2] = temp[0];    // Temp[0] is discarded
    temp[0] = lol.R[2][2];
    lol.R[2][2] = temp[1];    // Temp2 is discarded
    lol.R[2][0] = temp[0];    // Temp1 is discarded


    // For rotating R edges Clockwise
    temp[0] = lol.R[1][0];
    lol.R[1][0] = lol.R[2][1];
    temp[1] = lol.R[0][1];
    lol.R[0][1] = temp[0];    // Temp1 is discarded
    temp[0] = lol.R[1][2];
    lol.R[1][2] = temp[1];    // Temp2 is discarded
    lol.R[2][1] = temp[0];    // Temp1 is discarded

    cout<<" moveL();"<<endl;

}

void moveLi()
{
    moveL();
    moveL();
    moveL();

    cout<<" moveLi();"<<endl;
}

void moveR()
{
    int temp[6];

    // For moving cells onto Green Face and others respectively
    temp[0] = lol.G[0][2];
    temp[1] = lol.G[1][2];
    temp[2] = lol.G[2][2];
    lol.G[0][2] = lol.W[0][2];
    lol.G[1][2] = lol.W[1][2];
    lol.G[2][2] = lol.W[2][2];
    temp[3] = lol.B[0][0];
    temp[4] = lol.B[1][0];
    temp[5] = lol.B[2][0];
    lol.B[0][0] = lol.Y[2][2];
    lol.B[1][0] = lol.Y[1][2];
    lol.B[2][0] = lol.Y[0][2];
    lol.W[0][2] = temp[5];  // Temp[0] is discarded
    lol.W[1][2] = temp[4];  // Temp[1] is discarded
    lol.W[2][2] = temp[3];  // Temp[2] is discarded
    lol.Y[0][2] = temp[0];  // Temp[5] is discarded
    lol.Y[1][2] = temp[1];  // Temp[4] is discarded
    lol.Y[2][2] = temp[2];  // Temp[3] is discarded

     // For rotating O corners Clockwise
    temp[0] = lol.O[0][0];
    lol.O[0][0] = lol.O[2][0];
    temp[1] = lol.O[0][2];
    lol.O[0][2] = temp[0];    // Temp[0] is discarded
    temp[0] = lol.O[2][2];
    lol.O[2][2] = temp[1];    // Temp2 is discarded
    lol.O[2][0] = temp[0];    // Temp1 is discarded


    // For rotating O edges Clockwise
    temp[0] = lol.O[1][0];
    lol.O[1][0] = lol.O[2][1];
    temp[1] = lol.O[0][1];
    lol.O[0][1] = temp[0];    // Temp1 is discarded
    temp[0] = lol.O[1][2];
    lol.O[1][2] = temp[1];    // Temp2 is discarded
    lol.O[2][1] = temp[0];    // Temp1 is discarded

    cout<<" moveR();"<<endl;

}

void moveRi()
{
    moveR();
    moveR();
    moveR();
    cout<<" moveRi();"<<endl;
}

void moveB()
{

    int temp[6];

    // For moving cells onto Green Face and others respectively
    temp[0] = lol.R[0][0];
    temp[1] = lol.R[1][0];
    temp[2] = lol.R[2][0];
    lol.R[0][0] = lol.Y[0][2];
    lol.R[1][0] = lol.Y[0][1];
    lol.R[2][0] = lol.Y[0][0];
    temp[3] = lol.O[0][2];
    temp[4] = lol.O[1][2];
    temp[5] = lol.O[2][2];
    lol.O[0][2] = lol.W[2][2];
    lol.O[1][2] = lol.W[2][1];
    lol.O[2][2] = lol.W[2][0];
    lol.W[2][0] = temp[0];  // Temp[0] is discarded
    lol.W[2][1] = temp[1];  // Temp[1] is discarded
    lol.W[2][2] = temp[2];  // Temp[2] is discarded
    lol.Y[0][0] = temp[3];  // Temp[5] is discarded
    lol.Y[0][1] = temp[4];  // Temp[4] is discarded
    lol.Y[0][2] = temp[5];  // Temp[3] is discarded

     // For rotating B corners Clockwise
    temp[0] = lol.B[0][0];
    lol.B[0][0] = lol.B[2][0];
    temp[1] = lol.B[0][2];
    lol.B[0][2] = temp[0];    // Temp[0] is discarded
    temp[0] = lol.B[2][2];
    lol.B[2][2] = temp[1];    // Temp2 is discarded
    lol.B[2][0] = temp[0];    // Temp1 is discarded


    // For rotating B edges Clockwise
    temp[0] = lol.B[1][0];
    lol.B[1][0] = lol.B[2][1];
    temp[1] = lol.B[0][1];
    lol.B[0][1] = temp[0];    // Temp1 is discarded
    temp[0] = lol.B[1][2];
    lol.B[1][2] = temp[1];    // Temp2 is discarded
    lol.B[2][1] = temp[0];    // Temp1 is discarded

    cout<<" moveB();"<<endl;


}

void moveBi()
{
    moveB();
    moveB();
    moveB();

    cout<<" moveBi();"<<endl;
}

void reset()
{

        int W[3][3] = {{11,12,13},{14,15,16},{17,18,19}};
        int R[3][3] = {{21,22,23},{24,25,26},{27,28,29}};
        int O[3][3] = {{31,32,33},{34,35,36},{37,38,39}};
        int B[3][3] = {{41,42,43},{44,45,46},{47,48,49}};
        int G[3][3] = {{51,52,53},{54,55,56},{57,58,59}};
        int Y[3][3] = {{61,62,63},{64,65,66},{67,68,69}};

        lol.W[0][0] =11;
        lol.W[0][1] =12;
        lol.W[0][2] =13;
        lol.W[1][0] =14;
        lol.W[1][1] =15;
        lol.W[1][2] =16;
        lol.W[2][0] =17;
        lol.W[2][1] =18;
        lol.W[2][2] =19;

        lol.R[0][0] =21;
        lol.R[0][1] =22;
        lol.R[0][2] =23;
        lol.R[1][0] =24;
        lol.R[1][1] =25;
        lol.R[1][2] =26;
        lol.R[2][0] =27;
        lol.R[2][1] =28;
        lol.R[2][2] =29;

        lol.O[0][0] =31;
        lol.O[0][1] =32;
        lol.O[0][2] =33;
        lol.O[1][0] =34;
        lol.O[1][1] =35;
        lol.O[1][2] =36;
        lol.O[2][0] =37;
        lol.O[2][1] =38;
        lol.O[2][2] =39;

        lol.B[0][0] =41;
        lol.B[0][1] =42;
        lol.B[0][2] =43;
        lol.B[1][0] =44;
        lol.B[1][1] =45;
        lol.B[1][2] =46;
        lol.B[2][0] =47;
        lol.B[2][1] =48;
        lol.B[2][2] =49;

        lol.G[0][0] =51;
        lol.G[0][1] =52;
        lol.G[0][2] =53;
        lol.G[1][0] =54;
        lol.G[1][1] =55;
        lol.G[1][2] =56;
        lol.G[2][0] =57;
        lol.G[2][1] =58;
        lol.G[2][2] =59;

        lol.Y[0][0] =61;
        lol.Y[0][1] =62;
        lol.Y[0][2] =63;
        lol.Y[1][0] =64;
        lol.Y[1][1] =65;
        lol.Y[1][2] =66;
        lol.Y[2][0] =67;
        lol.Y[2][1] =68;
        lol.Y[2][2] =69;
}

