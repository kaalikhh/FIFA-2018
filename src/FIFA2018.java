public class FIFA2018
{
    String a[]={"Russia","Uruguay","Egypt","Saudi Arabia"};
    String b[]={"Iran","Portugal","Spain","Morocco"};
    String c[]={"France","Denmark","Australia","Peru"};
    String d[]={"Croatia","Argentina","Iceland","Nigeria"};
    String e[]={"Serbia","Brazil","Switzerland","Costa Rica"};
    String f[]={"Mexico","Sweden","Germany","Korea Republic"};
    String g[]={"Belgium","England","Tunisia","Panama"};
    String h[]={"Senegal","Japan","Poland","Colombia"};
    
    private void game(){
        String b1,b2,b3,b4,e1,e2;
        int i=(int)(Math.random()*4), j=(int)(Math.random()*4), k=(int)(Math.random()*4), l=(int)(Math.random()*4), m=(int)(Math.random()*4), n=(int)(Math.random()*4), o=(int)(Math.random()*4), p=(int)(Math.random()*4);
        
        System.out.print("WINNERS (Round- 16 Matches)\n.............................\n\nGroup A : "+a[i]+"\nGroup B : "+b[j]+"\nGroup C : "+c[k]+"\nGroup D : "+d[l]+"\nGroup E : "+e[m]+"\nGroup F : "+f[n]+"\nGroup G : "+g[o]+"\nGroup H : "+h[p]+"\n\n");
        System.out.print(".............................\nQuarter Final Matches\n.............................\n\n"+ "1: " + a[i]+" VS "+b[j]+"\n"+ "2: " + c[k]+" VS "+d[l]+"\n" + "3: " +e[m]+" VS "+f[n]+"\n"+ "4: " + g[o]+" VS "+h[p]);
        System.out.print("\n\n..............................\nWinner of QUARTER-FINALs\n..............................\n\n");
      
        int a1=(int)(Math.random()*10)+1, a2=(int)(Math.random()*10)+1, a3=(int)(Math.random()*10)+1, a4=(int)(Math.random()*10)+1, a5=(int)(Math.random()*10)+1, a6=(int)(Math.random()*10)+1, a7=(int)(Math.random()*10)+1, a8=(int)(Math.random()*10)+1;
        
       System.out.println((a1>a2)?a[i]:b[j]);
       b1=(a1>a2)?a[i]:b[j];
       System.out.println((a3>a4)?c[k]:d[l]);
       b2=(a3>a4)?c[k]:d[l];
       System.out.println((a5>a6)?e[m]:f[n]);
       b3=(a5>a6)?e[m]:f[n];
       System.out.println((a7>a8)?g[o]:h[p]);
       b4=(a7>a8)?g[o]:h[p];
       
       System.out.print("\n..........................\nSemi-Final Matches\n..........................\n\n"+"1: " + b1+" VS "+b2+"\n"+"2: " + b3+" VS "+b4+"\n\n");
       System.out.print(".........................\nWinners of SEMI-FINALs\n.........................\n\n");
       int c1=(int)(Math.random()*10)+1, c2=(int)(Math.random()*10)+1, c3=(int)(Math.random()*10)+1, c4=(int)(Math.random()*10)+1;
       
        System.out.println((c1>c2)?b1:b2);
        e1=(c1>c2)?b1:b2;
        System.out.println((c3>c4)?b3:b4);
        e2=(c3>c4)?b3:b4;
        
       System.out.print("\n.........................\nFinal of FIFA 2018\n.........................\n\n"+e1+" VS "+e2+"\n\n"); 
       System.out.print(":::::::::::::::::::::::::::::::::::::::::::::::: \nHERE IS THE WINNER OF FIFA World Cup 2018\n:::::::::::::::::::::::::::::::::::::::::::::::: \n\n");
        int d1=(int)(Math.random()*10)+1, d2=(int)(Math.random()*10)+1; 
        	System.out.print((d1>d2)?"\t\t"+e1+"\n\n":"\t\t"+e2+"\n\n");
    }
}
