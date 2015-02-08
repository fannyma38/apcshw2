public int fib(int n) {
  if (n==0){
  return 0;}
  if (n==1){
  return 1;}
  return fib(n-1)+ fib(n-2);
  }

public int bunnyEars2(int bunnies) {
  if (bunnies == 0 ){
  return 0;}
  if ((bunnies % 2)==0){
  return bunnyEars2(bunnies-1) + 3;
  }
  else {
  return bunnyEars2(bunnies-1)+2;
}
}

public int strCount(String str, String sub) {
  int x = sub.length();
  if (str.length()==0)
  { return 0;}
  if (str.length()== x-1){
  return 0;}
  if (str.substring(0,x).equals(sub))
  {
  return 1 + strCount(str.substring(x), sub);
  }
  else{
  return strCount(str.substring(1),sub);
  }
}


public int sumDigits(int n) {
  if (n < 10){
  return n;}
  else { 
  return n%10 + sumDigits(n/10);
  }
  
}

public String allStar(String str) {
  if (str.equals("")){
  return ("");}
  if (str.length()==1){
  return str;}
  else{
  return str.substring(0,1) + "*" + allStar(str.substring(1));}
}

public int len(String s){
    if (str.equals("")){
	return 0;}
    else{
	return 1 + len(s.substring(1));}
}

public int count(String s, char c){
    if(s.equals("")) 
	{return 0;}
    if(s.charAt(0)==c){
	return 1 + count(s.substring(1),c);
    }else{
	return count(s.substring(1),c);
    }
}
