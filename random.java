import java.rmi.StubNotFoundException;
import java.util.*;

class random{
    public static void main(String[] args)
    {
        int x,ch,moreattempt;
        int flag;
        Random rd=new Random();
        int randnum;
       Scanner sc=new Scanner(System.in);
       

        System.out.println("*****************Lets Guess the number***************");
do{
    flag=0;
    moreattempt=0;
    randnum=rd.nextInt(100)+1;
    System.out.println("You have maximum 3 chances");
    ch=3;
    do{
    System.out.println("Enter Number(1-100):");
    do{
    x=sc.nextInt();
    }while(x>100 || x<1);
  //System.out.println(randnum);
    if(x==randnum){
        System.out.println("Congratulations!!!!\nYou WIN");
        flag=1;
        ch=ch-1;
    }
    else if(x>randnum){
        System.out.println("Guessed number is greater than actual number");
        ch=ch-1;
    }
    else if(x<randnum){
        System.out.println("Guessed number is Lesser than actual number");
        ch=ch-1;
    }
    if(ch==0){
        System.out.println("Want one extra attempt");
        System.out.println("1:YES\n2.Exit");
        moreattempt=sc.nextInt();

    }
   
    
}while(ch!=0 && flag!=1 );
if(ch==2){
    System.out.println("Number of attempts:"+ch+1+moreattempt);
    System.out.println("Your score=5000");
}
else if(ch==1 && flag==1){
    System.out.println("Number of attempts:"+ch+1+moreattempt);
    System.out.println("Your score=3000");
}
else if(ch==0 && flag==1){

    System.out.println("Number of attempts:"+ch+1+moreattempt);
    System.out.println("Your score=1000");
}
else{
    System.out.println("Number of attempts:"+ch+1+moreattempt);
    System.out.println("You Loss");
}

System.out.println("Wanna Play Again?\n1:YES\n2.Exit");
moreattempt=sc.nextInt();
}while(moreattempt==1);
System.out.println("Thanks for playing");
    }
} 