/** Class: RecursionPractice.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/18/2022
*
* This class – Contains all methods used to solve Recursion Codingbats. 
*/

//displayString
public String displayString(String str, int n)
{
  if(n > 0)
  {
    return str + displayString(str,n-1);
  }
  else
  {
    return "";
  }
}

//getMultiChar
public String getMultiChar(char ch, int n)
{
  if(n == 0)
  {
    return ch+"";
  }
  return ch+getMultiChar(ch,n-1);
}


//getPowerOfTen
public long getPowerOfTen(int n)
{
 if(n ==0)
    return 1;
    
  else
  {
    return 10 * getPowerOfTen(n-1);
  }
}


//factorial 
public int factorial(int n) 
{
  if(n ==0)
  {
    return 0;
  }
  if(n ==1)
  {
    return 1;
  }
  else
  {
    return n * factorial(n-1);
  }
}


//numberOfGloves
public int numberOfGloves(int peopleOfPlanetU101InARoom)
{
  if(peopleOfPlanetU101InARoom ==0)
  {
    return 0;
  }
  else
  {
    return 3* peopleOfPlanetU101InARoom;
  }
}


//getPowerOfTen WITH LOOP
public long getPowerOfTen(int n)
{
  long update=1;
  if(n ==0){
    return 1;
  }
  for(int i = 1 ; i <= n; i++)
  {
    
    update = 10 * (update);
  }
  return update;
}


//numberOfGloves(no recursion)
public int numberOfGlovesNoRecursion(int peopleOfPlanetU101InARoom)
{
  if(peopleOfPlanetU101InARoom == 0)
  {
    return 0;
  }
  if(peopleOfPlanetU101InARoom > 0)
  {
    peopleOfPlanetU101InARoom = 3 * peopleOfPlanetU101InARoom;
  }
  return peopleOfPlanetU101InARoom;
}


//getNumberOfZero WITH LOOP
public int getNumberOfZerosLoop(int n)
{
}


//getNumberOfZerosRecursion
public int getNumberOfZerosRecursion(int n)
{
 
  if(n == 0)
  {
    return 1;
  }
  else if(n < 10)
  {
    return 0;
  }
  else
  {
    int zeroCounter = getNumberOfZerosRecursion(n/10);
    if(n % 10 ==0)
    {
      zeroCounter++;
    }
    return zeroCounter;
  }
  
}
