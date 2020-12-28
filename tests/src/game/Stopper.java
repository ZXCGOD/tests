package game;
public class Stopper
{
    public static int rightCheck(int PlX, int PlY, int ObjX, int ObjY, int PlWi, int ObjHe, int PlHe, int ObjWi)
    {
	if((PlY<=ObjY+ObjHe) && (PlY+PlHe>=ObjY))
	    if  (PlX+PlWi+5<ObjX || PlX +5 > ObjX+ObjWi)
		return 0;
	    else 
		return 1;  
	else 
	    return 0;  
    }
    public static int leftCheck(int PlX,int PlY, int ObjX, int ObjY, int ObjWi, int ObjHe, int PlHe, int PlWi)
    {
	if((PlY<=ObjY+ObjHe) && (PlY+PlHe>=ObjY))
	    if (PlX-5>ObjX+ObjWi || PlX + PlWi -5 < ObjX)
		return 0;
	    else
		return 1;
	else
	    return 0;
  
    }
  
     public static int topCheck(int PlX,int PlY, int ObjX, int ObjY, int PlWi, int ObjWi, int PlHe)
    {
	if((PlX+PlWi>=ObjX) && (PlX<=ObjX+ObjWi))
	    if  (PlY-5>ObjY+ObjWi || PlY+PlWi-5<ObjY)
		return 0;
	    else
		return 1;
	else
	    return 0;
    }

    public static int botCheck(int PlX,int PlY, int ObjX, int ObjY, int ObjWi, int PlWi, int PlHe)
    {
	if((PlX+PlWi>=ObjX) && (PlX<=ObjX+ObjWi))
	    if  (PlY+PlWi+5< ObjY || PlY+5>ObjY+ObjWi)
		return 0;
	    else
		return 1;
	else
	    return 0;
    }

   
    
}
