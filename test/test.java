
class test {
    public boolean isPalindrome(int x) {
       if(x<0)
            return false;
        else{
                int a=0,b=x;
                do{
                    a=a*10+b-(b/10)*10;
                    b=b/10;
                }while(b!=0);
                System.out.println(a);
            if(a+x==2*x)
                return true;
        } 

    

        return false;
    }

    public static void main(String[] args) {
       test s=new test();

    System.out.println(s.isPalindrome(12321));
    }
    
}
