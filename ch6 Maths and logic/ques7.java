class Gender{
  int boys, girls;

  Gender()
  { boys=0; girls=0; }

  void setGender(int val, int ch)
  {
        if(ch==0)
          boys+=val;
        else
          girls+=val;
  }
  int getBoys()
  { return boys; }
  int getGirls()
  { return girls; }
}

class ques7{

  static void checkgenderratio(int n){
    Gender g = new Gender();
    //System.out.println("Hello");
    for(int i=0; i<n; i++)
      checkonefamily(g);

    int noOfBoys = g.getBoys();
    int noOfGirls = g.getGirls();

    double ratio = noOfBoys/noOfGirls;
    System.out.println(ratio);
  }

  static void checkonefamily(Gender g){
    double val = Math.random();
    int boys=0;
    while(val>0.5)
    {
      //System.out.println(val);
      boys+=1;
      val = Math.random();
    }
    //System.out.println(boys);
    g.setGender(boys,0);
    g.setGender(1,1);
  }

  public static void main(String[] args) {

    checkgenderratio(20);

  }

}
